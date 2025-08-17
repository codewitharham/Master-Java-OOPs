package OOP_3.Intro_to_PolyMorphism.Types.Dynamic;

public class Rectangle extends Shapes {
    
    @Override // this annotation indicates that this method overrides a method in the superclass
    // if the method does not override any method, the compiler will throw an error
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    
}
