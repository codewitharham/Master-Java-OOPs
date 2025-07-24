public class Main {
    public static void main(String[] args) {
        VehicleClass myCar = new VehicleClass(
            "Car", "Toyota", "Camry", 2023, "Blue", 
            40.5f, 0, 180, false, 4, 5, 
            "ABC-123", "John Doe", "REG-456", "VIN12345", 
            "Petrol", "Automatic", "V4", "Sedan", 
            "2024-06-15", "2025-06-15", "0300-1234567", 
            "john.doe@example.com", "Active"
        );

        System.out.println("--- Initial State ---");
        myCar.displayInfo();

        System.out.println("\n--- Actions ---");
        myCar.start();
        myCar.accelerate(50);
        myCar.checkFuel();
        myCar.refuel(10.0f);
        myCar.decelerate(20);
        myCar.stop();
        myCar.serviceVehicle("2025-07-01");
        myCar.scheduleNextService("2026-07-01");
        myCar.updateOwnerInfo("Jane Smith", "0300-9876543", "jane.smith@example.com");
        myCar.updateVehicleStatus("Under Maintenance");


        System.out.println("\n--- Final State ---");
        myCar.displayInfo();


        

        // Example of using the no-argument constructor
        Student studentWithDefaults = new Student();
        System.out.println("\n--- Student with Default Values ---");
        studentWithDefaults.displayInfo();

        // Example of using the parameterized constructor
        Student studentWithParams = new Student("Bob", 21, "S67890", "Mathematics");
        System.out.println("\n--- Student with Parameters ---");
        studentWithParams.displayInfo();

        // Example of using the copy constructor
        Student studentCopy = new Student(studentWithParams);
        System.out.println("\n--- Student Copy from Parameterized Constructor ---");
        studentCopy.displayInfo();

        // Example of using the no-argument constructor to create a student with default values
        
    }
}