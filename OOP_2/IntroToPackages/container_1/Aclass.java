package OOP_2.IntroToPackages.container_1;

public class Aclass {

    // This class can be used to demonstrate package usage
    // or to contain methods that interact with other classes in different packages.
    
    public void display() {
        System.out.println("This is Aclass in the OOP_2.IntroToPackages package.");
    }

   
    // Additional methods can be added as needed
    // You can also add methods that interact with classes from other packages
    public void interactWith_Bclass() {
        OOP_2.IntroToPackages.container_2.Bclass bClass = new OOP_2.IntroToPackages.container_2.Bclass();
        bClass.display();
    }

        


}


