// Static Polymorphism: 

// Static polymorphism is achieved through method overloading.
// In static polymorphism, the method to be executed is determined at compile time.
// This is done by defining multiple methods with the same name but different parameter lists.

// Example:

// Static Polymorphism in Java using Method Overloading
// This code demonstrates static polymorphism through method overloading and constructor overloading.
// It includes a class `Number` with multiple constructors and overloaded methods for summation.
// The main method creates instances of the class and calls the overloaded methods.



package OOP_3.Intro_to_PolyMorphism.Types.Static;

public class Number {
    
    // Constructor with one parameter
    public Number(int num) {
        System.out.println("Number is: " + num);
    }

    // Constructor with two parameters
    public Number(int num1, int num2) {
        System.out.println("Numbers are: " + num1 + " and " + num2);
    }

    // Constructor with three parameters
    public Number(int num1, int num2, int num3) {
        System.out.println("Numbers are: " + num1 + ", " + num2 + ", and " + num3);
    }


    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Number num1 = new Number(5);
        Number num2 = new Number(3, 7);
        Number num3 = new Number(1, 2, 3);

        // Demonstrating method overloading
        System.out.println("Sum of two integers: " + num1.sum(10, 20));
        System.out.println("Sum of two doubles: " + num1.sum(10.5, 20.5));
        System.out.println("Concatenation of two strings: " + num1.sum("Hello, ", "World!"));
        System.out.println("Sum of three integers: " + num1.sum(1, 2, 3));
    }


}
