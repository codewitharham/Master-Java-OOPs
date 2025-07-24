public class VehicleClass {

    // Attributes (Fields/Variables)
    String typeOfVehicle;
    String brand;
    String model;
    int year;
    String color;
    float CurrentFuelInLiters;
    int speed;
    int maxSpeed;
    boolean isRunning;
    int numberOfWheels;
    int numberOfSeats;
    String licensePlate;
    String ownerName;
    String registrationNumber;
    String vin; // Vehicle Identification Number
    String fuelType; // e.g., Petrol, Diesel, Electric
    String transmissionType; // e.g., Manual, Automatic
    String engineType; // e.g., V6, Electric Motor
    String vehicleCategory; // e.g., Sedan, SUV, Truck, Motorcycle
    String lastServiceDate; // Date of the last service
    String nextServiceDueDate; // Date when the next service is due
    String ownerContactNumber; // Contact number of the vehicle owner
    String ownerEmail; // Email address of the vehicle owner
    String vehicleStatus; // e.g., Active, Inactive, Under Maintenance
     
    // Constructor      
    
    public VehicleClass(String typeOfVehicle, String brand, String model, int year, String color, 
                   float currentFuelInLiters, int speed, int maxSpeed, boolean isRunning, 
                   int numberOfWheels, int numberOfSeats, String licensePlate, 
                   String ownerName, String registrationNumber, String vin, 
                   String fuelType, String transmissionType, String engineType, 
                   String vehicleCategory, String lastServiceDate, 
                   String nextServiceDueDate, String ownerContactNumber, 
                   String ownerEmail, String vehicleStatus) {
        this.typeOfVehicle = typeOfVehicle;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.CurrentFuelInLiters = currentFuelInLiters;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isRunning = isRunning;
        this.numberOfWheels = numberOfWheels;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vin = vin;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineType = engineType;
        this.vehicleCategory = vehicleCategory;
        this.lastServiceDate = lastServiceDate;
        this.nextServiceDueDate = nextServiceDueDate;
        this.ownerContactNumber = ownerContactNumber;
        this.ownerEmail = ownerEmail;
        this.vehicleStatus = vehicleStatus;
    }
    
    
    // Methods/Functions    
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The vehicle has started.");
        } else {
            System.out.println("The vehicle is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0; // Reset speed when stopped
            System.out.println("The vehicle has stopped.");
        } else {
            System.out.println("The vehicle is already stopped.");
        }
    }

    public void accelerate(int increment) {
        if (isRunning) {
            speed += increment;
            if (speed > maxSpeed) {
                speed = maxSpeed; // Ensure speed does not exceed maxSpeed
            }
            System.out.println("The vehicle has accelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate. The vehicle is not running.");
        }
    }


    public void decelerate(int decrement) {
        if (isRunning) {
            speed -= decrement;
            if (speed < 0) {
                speed = 0; // Ensure speed does not go below 0
            }
            System.out.println("The vehicle has decelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot decelerate. The vehicle is not running.");
        }
    }

    public void refuel(float liters) {
        if (liters > 0) {
            CurrentFuelInLiters += liters;
            System.out.println("The vehicle has been refueled. Current fuel: " + CurrentFuelInLiters + " liters");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    public void checkFuel() {
        if (CurrentFuelInLiters <= 0) {
            System.out.println("The vehicle is out of fuel. Please refuel.");
        } else {
            System.out.println("Current fuel level: " + CurrentFuelInLiters + " liters");
        }
    }

    public void serviceVehicle(String serviceDate) {
        lastServiceDate = serviceDate;
        System.out.println("The vehicle has been serviced on " + lastServiceDate);
    }

    public void scheduleNextService(String nextServiceDate) {
        nextServiceDueDate = nextServiceDate;
        System.out.println("The next service is scheduled for " + nextServiceDueDate);
    }

    public void updateOwnerInfo(String newOwnerName, String newContactNumber, String newEmail) {
        ownerName = newOwnerName;
        ownerContactNumber = newContactNumber;
        ownerEmail = newEmail;
        System.out.println("Owner information updated.");
    }

    public void updateVehicleStatus(String newStatus) {
        vehicleStatus = newStatus;
        System.out.println("Vehicle status updated to: " + vehicleStatus);
    }

    
    // Method to display vehicle information
    
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Type: " + typeOfVehicle);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current Fuel: " + CurrentFuelInLiters + " liters");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Is Running: " + isRunning);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("VIN: " + vin);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Vehicle Category: " + vehicleCategory);
        System.out.println("Last Service Date: " + lastServiceDate);
        System.out.println("Next Service Due Date: " + nextServiceDueDate);
        System.out.println("Owner Contact Number: " + ownerContactNumber);
        System.out.println("Owner Email: " + ownerEmail);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }


    
}
