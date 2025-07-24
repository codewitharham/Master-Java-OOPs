public class Student {
    String name;
    int age;
    String studentId;
    String major;



    public Student(Student other) {
        // Copy constructor to create a new Student object from an existing one
        // This constructor copies the attributes from the provided Student object
        // It can be used to create a new Student object with the same details as
        // another.
        // Example usage:
        // Student original = new Student("John Doe", 20, "S12345", "Computer Science");
        // Student copy = new Student(original);
        // This will create a copy of the original student with the same details.
        // The copy constructor is useful when you want to duplicate an object without
        // modifying the original.


        this.name = other.name;
        this.age = other.age;
        this.studentId = other.studentId;
        this.major = other.major;
    }


    public Student(){

        // No-argument constructor to create a Student object with default values
        this("Unknown", 0, "Not Assigned", "Undeclared");
        // Default constructor to create a Student object with default values
        // This constructor initializes the student's attributes to default values.
        // Example usage:
        // Student student = new Student();
        // This will create a Student object with default values: name "Unknown", age 0,
        // student ID "Not Assigned", and major "Undeclared".
        // This constructor can be used when you want to create a Student object without
        // providing specific details, allowing you to set the attributes later.
        // It is useful for creating a Student object that can be populated with data
       
    }

    public Student(String name, int age, String studentId, String major) {
        // Constructor with parameters to initialize the Student object
        // This constructor allows setting specific values for the student's attributes
        // It can be used to create a Student object with specific details.
        // Example usage:
        // Student student = new Student("John Doe", 20, "S12345", "Computer Science");
        // This will create a Student object with the name "John Doe", age 20, student
        // ID "S12345", and major "Computer Science".
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }

    public void updateMajor(String newMajor) {
        this.major = newMajor;
        System.out.println("Major updated to: " + newMajor);
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println("Happy Birthday! You are now " + age + " years old.");
    }

}
