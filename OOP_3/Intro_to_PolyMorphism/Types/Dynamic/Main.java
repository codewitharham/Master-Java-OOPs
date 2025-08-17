package OOP_3.Intro_to_PolyMorphism.Types.Dynamic;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Shapes
        Shapes shape = new Shapes();
        
        // Calling the draw method
        shape.draw();
        
        // Demonstrating dynamic polymorphism by overriding in subclasses
        Circle circle = new Circle();
        circle.draw();
        
        Square square = new Square();
        square.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();


        // Demonstrating dynamic polymorphism with a reference of type Shapes
        Shapes shape1 = new Circle();
        shape1.draw(); // Calls Circle's draw method

        Shapes shape2 = new Square();
        shape2.draw(); // Calls Square's draw method    

        Shapes shape3 = new Rectangle();
        shape3.draw(); // Calls Rectangle's draw method

        // Demonstrating dynamic polymorphism with an array of Shapes
        Shapes[] shapesArray = {new Circle(), new Square(), new Rectangle()};

        for (Shapes s : shapesArray) {
            s.draw(); // Calls the appropriate draw method based on the actual object type
        }

        // Dynamic Method Dispatch:
        
        // A reference of type Shapes can point to any subclass object
        // Here, we are upcasting Circle to Shapes
        // This allows us to call the overridden method in Circle/Square/Rectangle
        // A mechanism where the method to be called is determined at runtime
        // This is known as dynamic method dispatch or late binding
        // Java decides which method to call at runtime based on the actual object type
        // This is a key feature of polymorphism in Java
        // Superclass reference can point to subclass objects
        // java decides subclass method to call at runtime
        
            // SUPER IMPORTANT:
                // The method that gets executed is determined by the actual object type, not the reference type
                // This allows for flexibility and extensibility in code design
                // It enables the use of polymorphic behavior, where a single interface can represent different underlying forms (data types).
                // This is a fundamental concept in object-oriented programming, allowing for dynamic method resolution.

        // Example of dynamic method dispatch
        
        
        Shapes dynamicShape = new Circle(); // Upcasting
        dynamicShape.draw(); // Calls Circle's draw method

            
    }
    
}
