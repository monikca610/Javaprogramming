Vehicle Management using Method Overriding:

// Java program to demonstrate method overriding

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {

    // Overriding the run() method
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();

        vehicle.run();
        car.run();
    }
}

OUTPUT:
Vehicle is running
Car is running
