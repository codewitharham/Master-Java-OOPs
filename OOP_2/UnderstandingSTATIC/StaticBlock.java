package OOP_2.UnderstandingSTATIC;


// this is to show that the static block is executed before the main method
// Static block to initialize static variables or perform static initialization
// Static block is executed when the class is loaded
// Static block can be used to initialize static variables or perform static initialization
// Static block is executed only once when the class is loaded
// Static block is executed before the main method

public class StaticBlock {
    
    static int a = 10;
    static int b;


    // will only be executed once when the class is loaded first time when the first object is created
    static {
        // Static block to initialize static variables
        b = a * 2; // b is initialized to double the value of a
        System.out.println("Static block executed: b = " + b);
    }

    public static void main(String[] args) {
        // This is the main method
        // It is the entry point of the program
        System.out.println("Main method executed: a = " + a + ", b = " + b);
        
        StaticBlock obj = new StaticBlock();
        System.out.println("Object created: a = " + obj.a + ", b = " + obj.b);

        StaticBlock.b = a + 5; // Modifying static variable b
        System.out.println("Modified static variable b: " + StaticBlock.b);

        // Creating another object to show that static block is executed only once

        StaticBlock obj2 = new StaticBlock();
        System.out.println("Second object created: a = " + obj2.a + ", b = " + obj2.b);

        
    }

}
