package com.prerepa.car_rpc.main;

import com.prerepa.car_rpc.api.VehicleNetwork;

import java.nio.file.Path;

/**
 * Main class. The gRPC server is run
 * in {@link VehicleNetwork}
 * (This is just example usage - you would normally
 * include {@link VehicleNetwork} in your project and run the server
 * as you wish)
 * @author aditya
 */
public class Main {
    public static void main(String[] args) throws Throwable {
        VehicleNetwork vehicleNetwork = new VehicleNetwork();
        Path databseCredentialsPath = Path.of(
                String.format("%s/VehicleNetwork/src/main/resources/database_credentials.json", System.getenv("HOME")));

        if (args.length != 0)
            vehicleNetwork.start(databseCredentialsPath, Integer.parseInt(args[0]));
        else
            vehicleNetwork.start(databseCredentialsPath, 2000);
        vehicleNetwork.blockUntilShutdown();
    }
}