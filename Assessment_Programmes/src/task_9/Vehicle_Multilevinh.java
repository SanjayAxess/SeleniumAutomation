package task_9;

		// Base class
		class Vehicle {
		    String brand;

		    // Constructor
		    Vehicle(String brand) {
		        this.brand = brand;
		    }

		    // Method to display brand
		    void displayBrand() {
		        System.out.println("Brand: " + brand);
		    }
		}

		// Subclass of Vehicle
		class Car extends Vehicle {
		    String model;

		    // Constructor
		    Car(String brand, String model) {
		        super(brand); // Call parent class constructor
		        this.model = model;
		    }

		    // Method to display model
		    void displayModel() {
		        System.out.println("Model: " + model);
		    }
		}

		// Subclass of Car
		class ElectricCar extends Car {
		    int batteryCapacity; // in kWh

		    // Constructor
		    ElectricCar(String brand, String model, int batteryCapacity) {
		        super(brand, model); // Call parent class constructor
		        this.batteryCapacity = batteryCapacity;
		    }

		    // Method to display battery capacity
		    void displayBatteryCapacity() {
		        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
		    }
		}

		// Main class
		public class Vehicle_Multilevinh {
		    public static void main(String[] args) {
		        // Create an ElectricCar object
		        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 100);

		        // Display all properties
		        tesla.displayBrand();
		        tesla.displayModel();
		        tesla.displayBatteryCapacity();
		    }
		}


