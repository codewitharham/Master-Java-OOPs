package OOP_3.Intro_To_Inheritance;

public class BoxWeight extends Box {
    
    private double weight;

    // Default constructor
    public BoxWeight() {
        // We cannot directly access the private fields of the parent class Box
         
        // this.length = 1.0; // error: length is private in Box
        // this.width = 1.0;  // error: width is private in Box    
        // this.height = 1.0; // error: height is private in Box
        
        // Instead, we should call the parent class constructor
        super(); // Call the parent class default constructor
        this.weight = 1.0; // Set default weight
        
    }

    // Constructor for a cube with weight
    public BoxWeight(double side, double weight) {
        super(side); // Call the parent class constructor
        this.weight = weight;
    }

    // Constructor for a box with weight
    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); // Call the parent class constructor
        this.weight = weight;
    }

    // Copy constructor
    public BoxWeight(BoxWeight other) {
        super(other); // Call the parent class copy constructor
        this.weight = other.weight;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
