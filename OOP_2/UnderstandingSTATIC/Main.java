package OOP_2.UnderstandingSTATIC;

public class Main {
    public static void main(String[] args) {
        // Create instances of Human
        Human human1 = new Human("Alice", 30);
        Human human2 = new Human("Bob", 25);
        
        // Display population and total age
        System.out.println("Population: " + Human.population);
        System.out.println("Total Age: " + Human.totalAge);
        
        // Create more humans to see the static variables update
        Human human3 = new Human("Charlie", 20);
        
        // Display updated population and total age
        System.out.println("Updated Population: " + Human.population);
        System.out.println("Updated Total Age: " + Human.totalAge);
    
        // greet(); 
        
        // error: static method call without class name
        // To fix the error, you can call the static method using the class name: 
        // Main.greet(); // Uncomment this line to call the static method correctly
        // Alternatively, you can make the greet method static:
    
        Main obj = new Main();
        obj.greet(); // Calling the non-static method using an instance of Main


        // Calling the static method fun() from the main method
        fun(); // This will call the static method fun() defined below
        
        // Calling the non-static method fun2() from the main method
        obj.fun2(); // This will call the non-static method fun2() defined below
        // You can also call the static method fun() using the class name
        // Main.fun(); // This will also call the static method fun() defined below

        
    }

    static void fun() {
        // This is a static method
        // It can be called without an instance of the class
        
        // greet(); // error: non-static method greet() cannot be referenced from a static context
        // To fix the error, you can call the greet method using an instance of the class

        Main obMain = new Main(); // Calling the static method using the class name
        obMain.greet(); // Calling the non-static method using an instance of Main
    }


    void greet() {
        // we know that non static methods can be called using an instance of the class
        // but static methods can be called without an instance of the class
        // This method can be static or non-static
        // Here, we are calling it as a non-static method
        // This is a non-static method
        // It can be called using an instance of the class
        System.out.println("Hello from Main class!");
    }

    void fun2() {
        // This is a non-static method
        // It can be called using an instance of the class
        // You can call static methods from non-static methods
        fun(); // Calling the static method fun() from a non-static method
        greet(); // Calling the non-static method greet() from a non-static method
    }

}
