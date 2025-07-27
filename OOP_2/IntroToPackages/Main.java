package OOP_2.IntroToPackages;

import OOP_2.IntroToPackages.container_1.Aclass;
import OOP_2.IntroToPackages.container_2.Bclass;
import OOP_2.IntroToPackages.container_3.Line;
import OOP_2.IntroToPackages.container_3.Point;


public class Main {
    public static void main(String[] args) {
        // Create instances of Aclass and Bclass
        Aclass aClass = new Aclass();
        Bclass bClass = new Bclass();

        // Call methods to demonstrate package usage
        aClass.display();
        bClass.display();

        // Interact between classes in different packages
        aClass.interactWith_Bclass();
        bClass.interactWith_Aclass();

        // Create points and a line to demonstrate the Line class
        Point startPoint = new Point(1, 2);
        Point endPoint = new Point(4, 6);
        Line line = new Line(startPoint, endPoint);

        // Display the line and its length
        System.out.println(line);
        System.out.println("Length of the line: " + line.length());
        // You can also add more functionality or classes as needed
        // This is just a basic structure to demonstrate package usage in Java.

        // Additional functionality can be added here
        // For example, you could create more classes in different packages
        // or add methods to interact with existing classes.
        // This structure allows for easy expansion and organization of code
        // as your project grows.

        // Example of creating more points and lines
        Point anotherStart = new Point(3, 5);
        Point anotherEnd = new Point(7, 8);
        Line anotherLine = new Line(anotherStart, anotherEnd);
        System.out.println(anotherLine);
        System.out.println("Length of the another line: " + anotherLine.length());

        // You can continue to expand this main method with more examples
        // or functionalities as needed to demonstrate the use of packages in Java.

        
    
}

}