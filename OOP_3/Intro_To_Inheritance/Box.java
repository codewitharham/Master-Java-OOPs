package OOP_3.Intro_To_Inheritance;

public class Box {
    
    private double length;
    private double width;
    private double height;

    // Default constructor
    public Box() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor for a cube
    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // Constructor for a rectangular box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Box(Box other) { 
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    // Getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }   

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    // Methods to calculate volume and surface area

    public double getVolume() {
        return length * width * height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public String DisplayInfo() {
        return "Box with dimensions: " + length + " x " + width + " x " + height;
    }

}
