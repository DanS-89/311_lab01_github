package org.example;

//Create Vehicle class with instructed attributes and their respective properties
class Vehicle {
    public int numberOfWheels;
    public String color;
    public float engineSize;
    public String fuelType;

    //Create constructor for Vehicle class
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    //Create getters and setters for each attribute
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    //Create displayInfo() method for the Vehicle class
    public void displayInfo() {
        System.out.println("Vehicle Information: ");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }
}

//Create Car class that extends Vehicle with additional brand attribute
class Car extends Vehicle {
    private String brand;

    //Create a constructor for Car class
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //Create getter and setter for brand attribute
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Create method for honk()
    public void honk() {
        System.out.println("Honk, honk!");
    }

    //Create displayInfo() method for Car that overrides the same method in Vehicle class to include brand attribute
    @Override
    public void displayInfo() {
        System.out.println("Car Information: ");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {

        //Instantiate a Vehicle object
        Vehicle myVehicle = new Vehicle(2, "Red", 2.00F, "Gasoline");

        //Test Vehicle displayInfo() method
        myVehicle.displayInfo();

        //Extra line for readability
        System.out.println();

        //Instantiate a Car object
        Car myCar = new Car(4,"Blue", 4.80F, "Gasoline", "Honda");

        //Test Car displayInfo() method
        myCar.displayInfo();

        //Extra line for readability
        System.out.println();

        //Test Car honk() method
        myCar.honk();
    }
}