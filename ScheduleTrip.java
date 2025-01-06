import java.util.ArrayList;
import java.util.List;

public class ScheduleTrip {
    String date;
    String time;
    int passengers;
    List<String> passengerList = new ArrayList<>();
    User user = new User();
    Trip trip = new Trip();
    Vehicle vehicle = new Vehicle();

    // Main method inside ScheduleTrip class
    public static void main(String[] args) {
        // Creating ScheduleTrip object
        ScheduleTrip schedule = new ScheduleTrip();

        // Setting up User details and requesting trip
        schedule.user.name = "Ahmed Khan";
        schedule.user.phone = "03001234567";
        schedule.user.requestTrip();

        // Setting up Trip details
        schedule.trip.tripID = 101;
        schedule.trip.date = "2025-01-15";
        schedule.trip.location = "CUI ATD";
        schedule.trip.calculateCost();

        // Setting up Vehicle details
        schedule.vehicle.vehicleID = 202;
        schedule.vehicle.capacity = 6; // Suitable for a group trip
        schedule.vehicle.status = "Available";
        schedule.vehicle.assignToTrip();

        // Scheduling the trip
        schedule.date = "2025-01-15";
        schedule.time = "11:00 AM";
        schedule.passengers = 4; // Group of friends
        schedule.addPassenger("Ali Raza");
        schedule.addPassenger("Sara Fatima");
        schedule.addPassenger("Bilal Sheikh");
        schedule.addPassenger("Ahmed Khan");
        schedule.createTrip();
        schedule.confirmTrip();
        schedule.assignVehicle();
    }

    void addPassenger(String name) {
        passengerList.add(name);
        System.out.println("Passenger " + name + " added.");
    }

    void createTrip() {
        System.out.println("Trip scheduled on " + date + " at " + time + " with " + passengers + " passengers.");
        System.out.println("Passenger List: " + passengerList);
    }

    void confirmTrip() {
        System.out.println("Trip confirmed.");
    }

    void assignVehicle() {
        System.out.println("Vehicle assigned to the trip.");
    }
}

// User class
class User {
    String name;
    String phone;

    void requestTrip() {
        System.out.println("User " + name + " (Phone: " + phone + ") requested a trip.");
    }

    void login() {
        System.out.println(name + " logged in.");
    }

    void logout() {
        System.out.println(name + " logged out.");
    }
}

// Trip class
class Trip {
    int tripID;
    String date;
    String location;

    void calculateCost() {
        // Simulating cost calculation for a trip in Pakistan
        int baseFare = 1000; // Base fare in PKR
        int distance = 10; // Distance in km (example)
        int costPerKm = 100; // Cost per km in PKR
        int totalCost = baseFare + (distance * costPerKm);
        System.out.println("Total cost for trip ID " + tripID + " to " + location + ": PKR " + totalCost);
    }
}

// Vehicle class
class Vehicle {
    int vehicleID;
    int capacity;
    String status;

    void assignToTrip() {
        System.out.println("Vehicle " + vehicleID + " (Capacity: " + capacity + ") assigned to a trip.");
    }
}

