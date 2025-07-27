package OOP_2.IntroToPackages.container_2;

import OOP_2.IntroToPackages.container_1.Aclass; // Importing Aclass from container_1

public class Bclass {

    // This class can be used to demonstrate package usage
    // or to contain methods that interact with other classes in different packages.
    
    public void display() {
        System.out.println("This is Bclass in the OOP_2.IntroToPackages.container_2 package.");
    }

    // Additional methods can be added as needed

        // You can also add methods that interact with classes from other packages
    public void interactWith_Aclass() {
        Aclass aClass = new Aclass();
        aClass.display();
    }

    

}

