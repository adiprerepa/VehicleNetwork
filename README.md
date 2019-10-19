# VehicleNetwork Backend
The objective of this project is to effectively take control of a toy car (RC), with a platform API and controllers, and give it infinite range. This is the server. 

## Travis CI Build Status
[![Build Status](https://travis-ci.org/adiprerepa/Car-Rpc.svg?branch=master)](https://travis-ci.org/adiprerepa/Car-Rpc)

## Purpose
The purpose of this project is to give any hobbyist or person who loves to build things a platform to build on to make autonomous RC cars. It is to give satisfaction to any designer, programmer, or builder that they can also make cool stuff.

## How it works
If you have an rc car, a phone, and a computer, this project will work. Essentially, you can control the rc car from your phone's accelerometer, and the control is instantaneous. So, tilt left will turn the car left, right will turn the car right, forward will move the car forward, and backward will more it backward. Some more options would be to implement different methods of control, such as a __smart glove__ and all that jazz. Setup is relatively easy, payoff is amazing. See the Car-Rpc repo for more.

## Design Decisions
 - A good database design decision was the `BaseDatabase` class, which was an abstract class which was generified for the Database Identifier (for pulling from mySQL), and the Database Entity Itself - which was returned on the `retrieve()` abstract function. You passed in the Entity Type (which inherited from a `BaseDatabaseEntity` class) to the generic. To use the BaseDatabase class you would need to directly inherit from it in your own database class, like `KnownCarDatabase`, but you would define a `KnownCarEntity` and `KnownCarIdentifier` to give the Generic Constructor. Those custom Entities and Identifiers would inherit from `BaseDatabaseEntity` and `BaseDatabaseIdentifier`. All in all, the way the java connector was designed was a good idea.
 - The layers of abstraction implemented in the application was crucial to reliable, fast development. The package structure : a good thing I realized about this project was that in a project of this scale, you would need to split everything up appropriately. So, the package structure and RIB (Router Interactor Builder) pattern that was used was extremely useful. For example, the class `ControlInteractor` was used only for controller-related communication, and that would be defined in the gRPC service definition implementation. The `ControlInteractor` contained an `Esp8266Interactor`, which had everything to do with the low-level socket communication (using protobuf), The `ControlInteractor` contained the database function calls too, which were organized well.
 - The Algorithm used to translate accelerometer positions to car velocity and wheel rotation was pretty useful. You Can find it in `CommandFactory#buildCommand`.
 - Code Patterns used : 
    - dependency injection
    - object pools
    - Factories and Builders
    - Base Generics and Interfaces


### Server Setup
 1) Clone Repositiory with command `git clone git@github.com:adiprerepa/Car-Rpc.git` - Needs to be in home directory.
 2) Do `cd ServerPlatform`. List out the contents with `ls`, you should see a `pom.xml`, `runPlatform.sh`, and a `src` directory.
 3) Run `./runServicePlatform.sh`, wait for the terminal output of the java program, you should see something like `Server Started on port <port>`.
#### MySQL Database Setup
 - You can easily install mysql with this link : https://support.rackspace.com/how-to/installing-mysql-server-on-ubuntu/
##### After Installation
 - run `sudo -i` on your computer - and enter the password.
 - run `mysql -u root -p` and do not put anything in for the password - you should automatically log in.
 - now run  : 
 ```mysql
GRANT ALL PRIVILEGES ON *.* TO 'username'@'localhost' IDENTIFIED BY 'password';
```
where you insert username and password at your discretion. Remember this username and password.
 - to create the car_rpc database : 
 ```mysql
CREATE DATABASE car_rpc;
```
 - Now you are done!
##### Repository Database Credentials setup
In order to stop from committing usernames and passwords to repository sources, make the file `database_credentials.json` , where you put the username, url, and password as follows(assuming that you run the database locally) : 
```json
 {
     "databaseUrl" : "jdbc:mysql://localhost/car_rpc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
     "databaseUsername" : "USERNAME!!!!", 
     "databasePassword" : "PASSWORD"
 }
```
Where you can insert the username and password from earlier. Thats it for the database setup - the program will automatically make tables for you.

When you initialize the class `VehicleNetwork`, you can input the *absolute* path of `database_credentials` through the `Path` Class.

Database Credentials and setup are not needed but are recommended.
##### Example Setup

```java
class Main {
  public static void main(String[] args) {
      VehicleNetwork vehicleNetwork = new VehicleNetwork();
      // Not required
      Path databaseCredentials = Path.of("PATH HERE");
      vehicleNetwork.start(databaseCredentialsPath, 525);
      vehicleNetwork.blockUntilShutdown();
  }
}
```
#### Prerequisites - Server Setup 
 - An Internet Connection (Setup - git&maven)
 - Maven Installed
 - Java 8 or Higher Installed


## Libraries
This project uses `protobuf`, `gRPC`, `mysql-connector-jdbc` for the API, `ESP8266WiFi` and `nanopb` for the esp8266, and `gRPC for the controller`.
 
# Author
 - Aditya Prerepa
