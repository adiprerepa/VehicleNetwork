package com.prerepa.car_rpc.controller;

import com.car_rpc.generated.*;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

/**
 * The actual service rpc definition, links to
 * {@link ControlInteractor} for the most part.
 * @author aditya
 */
public class ControllerRequestBase extends ControllerServiceGrpc.ControllerServiceImplBase {

    private ControlInteractor controlInteractor;
    // database of known cars used in last 2 services

    public ControllerRequestBase(ControlInteractor controlInteractor) {
        this.controlInteractor = controlInteractor;
    }

    /**
     * Command RPC
     */
    // STOPSHIP: 9/14/19 ADD SWITCHING OF CLIENTS - IF MOBILE WANTS TO CONTROL ANOTHER - IT SHOULD SEND

    @Override
    public void controlCommandService(ControlRequest controlRequest, StreamObserver<ControlResponse> responseStreamObserver) {

        System.out.println("Command req");
        ControlResponse response = null;
        try {
            // sends request to esp8266, goes through ControllerInteractor and Esp8266 interactor that
            // has the socket set in it from the acknowledge
            controlInteractor.handleControllerRequest(controlRequest);
            // recieves response from socket set in esp8266 interactor which controlInteractor has.
            // one instance of everything per service call.
            try {
                response = controlInteractor.recieveRepsonse();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
        System.out.println("Command req completed");
    }

    /**
     * Acknowledge RPC
     */
    @Override
    public void controlAcknowledgeService(ControlAcknowledge esp8266Acknowledge, StreamObserver<ControlAcknowledgeResponse> responseStreamObserver) {
        System.out.println("Got a connection.");
        // handles the address by setting the socket and key to the interactor and ValueStore
        responseStreamObserver.onNext(controlInteractor.handleAcknowledge(esp8266Acknowledge));
        responseStreamObserver.onCompleted();
    }

    @Override
    public void serverAcknowledgeService(ServerAcknowledge serverAcknowledge, StreamObserver<ServerAcknowledgeResponse> responseStreamObserver) {
        System.out.println("Server Acknowledge Request");
        ServerAcknowledgeResponse response = controlInteractor.handleServerAcknowledge(serverAcknowledge);
        response.getCarEntitiesList().forEach(carEntity -> System.out.println(carEntity.getName()));
        responseStreamObserver.onNext(response);
        System.out.println("done");
        responseStreamObserver.onCompleted();
    }

    @Override
    public void discoveryService(Esp8266DiscoveryRequest discoveryRequest, StreamObserver<Esp8266DiscoveryResponse> responseStreamObserver) {
        // todo when mdns works
    }
}
