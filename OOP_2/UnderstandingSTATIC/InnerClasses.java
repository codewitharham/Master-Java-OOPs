package OOP_2.UnderstandingSTATIC;

class A {

    A() {
        System.out.println("Constructor of class A");
    }
    void display() {
        System.out.println("Display method of class A");
    }
    

}

public class InnerClasses {
    // Inner classes can be used to logically group classes that are only used in one place
    // They can access the members of the outer class, including private members

    class Inner {
        void display() {
            System.out.println("This is an inner class method.");
        }
    }

    static class StaticInner {

        String message;
        
        StaticInner(String message) {
            this.message = message;  

            System.out.println("Static Inner Class Constructor: " + message);
        }
        
        static void display() {
            System.out.println("This is a static inner class method.");
        }
    }

    class B {
        
        B() {
            System.out.println("Constructor of class B");
        }
        
        void display() {
            System.out.println("This is an inner class inside another inner class.");
        }
    }
    
    
    public static void main(String[] args) {
        InnerClasses outer = new InnerClasses();
        InnerClasses.Inner inner = outer.new Inner(); // Creating an instance of the inner class
        inner.display(); // Calling the inner class method

        StaticInner staticInner = new StaticInner("Hello from Static Inner Class");
        StaticInner.display(); // Calling the static inner class method

        A a = new A(); // Creating an instance of class A
        a.display(); // Calling the display method of class A

        InnerClasses.B b = outer.new B(); // Creating an instance of the inner class B
        b.display(); // Calling the display method of class B
    }



}
