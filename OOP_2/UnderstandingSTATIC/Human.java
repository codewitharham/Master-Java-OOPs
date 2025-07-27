package OOP_2.UnderstandingSTATIC;

public class Human {
    String name;
    int age;
    boolean isAlive;
    static int population = 0; // Static variable to keep track of population
    static int totalAge = 0; // Static variable to keep track of total age
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAlive = true;
        population++;
        totalAge += age; // Update total age when a new human is created
    }

    

}
