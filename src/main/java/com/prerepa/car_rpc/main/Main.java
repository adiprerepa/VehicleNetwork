package com.prerepa.car_rpc.main;

import com.prerepa.car_rpc.api.VehicleNetwork;

import java.nio.file.Path;

/**
 * Main class. The gRPC server is run
 * in {@link VehicleNetwork}
 * @author aditya
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        VehicleNetwork vehicleNetwork = new VehicleNetwork();
        Path databseCredentialsPath = Path.of(
                String.format("%s/Car-Rpc/ServicePlatform/src/main/resources/database_credentials.json", System.getenv("HOME")));

        if (args.length != 0)
            vehicleNetwork.start(databseCredentialsPath, Integer.parseInt(args[0]));
        else
            vehicleNetwork.start(databseCredentialsPath, 2000);
        vehicleNetwork.blockUntilShutdown();
    }
}