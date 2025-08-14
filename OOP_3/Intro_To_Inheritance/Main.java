package OOP_3.Intro_To_Inheritance;

public class Main {
    
    public static void main(String[] args) {
        // Create a default box
        Box defaultBox = new Box();
        System.out.println("Default Box Dimensions: " + 
            defaultBox.getLength() + " x " + 
            defaultBox.getWidth() + " x " + 
            defaultBox.getHeight());

        // Create a cube with side length 3.0
        Box cube = new Box(3.0);
        System.out.println("Cube Dimensions: " + 
            cube.getLength() + " x " + 
            cube.getWidth() + " x " + 
            cube.getHeight());

        // Create a rectangular box with specific dimensions
        Box rectangularBox = new Box(2.0, 4.0, 6.0);
        System.out.println("Rectangular Box Dimensions: " + 
            rectangularBox.getLength() + " x " + 
            rectangularBox.getWidth() + " x " + 
            rectangularBox.getHeight());

        // Use the copy constructor
        Box copiedBox = new Box(rectangularBox);
        System.out.println("Copied Box Dimensions: " + 
            copiedBox.getLength() + " x " + 
            copiedBox.getWidth() + " x " + 
            copiedBox.getHeight());
    
    
        // Create a BoxWeight object using the default constructor
        BoxWeight defaultBoxWeight = new BoxWeight();
        System.out.println("Default BoxWeight Dimensions: " + 
            defaultBoxWeight.getLength() + " x " + 
            defaultBoxWeight.getWidth() + " x " + 
            defaultBoxWeight.getHeight() + 
            ", Weight: " + defaultBoxWeight.getWeight());

        // Create a BoxWeight object for a cube with weight
        BoxWeight cubeWeight = new BoxWeight(3.0, 5.0);
        System.out.println("Cube BoxWeight Dimensions: " + 
            cubeWeight.getLength() + " x " + 
            cubeWeight.getWidth() + " x " + 
            cubeWeight.getHeight() + 
            ", Weight: " + cubeWeight.getWeight());

        // Create a BoxWeight object for a rectangular box with weight
        BoxWeight rectangularBoxWeight = new BoxWeight(2.0, 4.0, 6.0, 10.0);
        System.out.println("Rectangular BoxWeight Dimensions: " + 
            rectangularBoxWeight.getLength() + " x " + 
            rectangularBoxWeight.getWidth() + " x " + 
            rectangularBoxWeight.getHeight() + 
            ", Weight: " + rectangularBoxWeight.getWeight());

        // Use the copy constructor for BoxWeight
        BoxWeight copiedBoxWeight = new BoxWeight(rectangularBoxWeight);
        System.out.println("Copied BoxWeight Dimensions: " + 
            copiedBoxWeight.getLength() + " x " + 
            copiedBoxWeight.getWidth() + " x " + 
            copiedBoxWeight.getHeight() + 
            ", Weight: " + copiedBoxWeight.getWeight());


        Box MagicBox = new BoxWeight(2.0, 3.0, 4.0, 5.0);
        // MagicBox.getWeight(); // This will cause a compile-time error since getWeight() is not defined in Box
        
        // To access weight, we need to cast MagicBox to BoxWeight
        if (MagicBox instanceof BoxWeight) {
            BoxWeight magicBoxWeight = (BoxWeight) MagicBox;
            System.out.println("Magic Box Weight: " + magicBoxWeight.getWeight());
        } else {
            System.out.println("MagicBox is not an instance of BoxWeight");
        }

        if (MagicBox instanceof Box) {
            System.out.println("MagicBox is an instance of Box");
        } else {
            System.out.println("MagicBox is not an instance of Box");
        }

        if ( MagicBox.equals(BoxWeight.class)) {
            System.out.println("MagicBox is equal to BoxWeight class");
        } else {
            System.out.println("MagicBox is not equal to BoxWeight class");
        }

        // MagicBox instanceof BoxWeight; // This will return true if MagicBox is an instance of BoxWeight


        // BoxWeight MagicReverseBox = new Box(2.0, 3.0, 4.0); 
        // This will cause a compile-time error since Box does not extend BoxWeight
       
        // BoxWeight magicReverseBox = (BoxWeight) MagicReverseBox;
       
        // System.out.println("Magic Reverse Box Weight: " + magicReverseBox.getWeight());
        
        // Note: The above line will throw a ClassCastException at runtime
        // To avoid this, we should not try to cast Box to BoxWeight
        // Instead, we should only cast if we are sure the object is of type BoxWeight 
        // or use instanceof to check the type before casting.
    
    }


    

}
