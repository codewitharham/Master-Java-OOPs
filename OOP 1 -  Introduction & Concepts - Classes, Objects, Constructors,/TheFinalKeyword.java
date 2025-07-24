public class TheFinalKeyword {

    public static void main(String[] args) {
        // Example of using the final keyword with a variable
        final int MAX_SPEED = 120;
        System.out.println("Maximum Speed: " + MAX_SPEED);

        // Uncommenting the next line will cause a compilation error
        // MAX_SPEED = 150; // CORRECT: This line would cause an error because MAX_SPEED
        // is final (cannot reassign primitive value)

        // Example of using the final keyword with a method (and a final instance
        // variable)
        FinalClass finalObject = new FinalClass(); // Creates a FinalClass object with message = "Hello, World!"

        finalObject.displayMessage(); // Output: Message: Hello, World!

        // this.message = newMessage; in changeMessage() method is an attempt to
        // reassign it.
            // CORRECT: This line would cause a compilation error.
            // The 'message' field in FinalClass is declared as 'final'.
            // You can only assign a value to a final field once, either at declaration or
            // in the constructor.

      
        
        // finalObject.changeMessage("New Message");

        // The line above (finalObject.changeMessage("New Message");) will cause a
        // compilation error
        // because the 'message' field is final and cannot be reassigned after
        // construction.
        // Therefore, the next line will never be reached if the above is uncommented
        // and causes an error.
        // If the 'changeMessage' method were removed or modified to not reassign
        // 'message',
        // then the following 'displayMessage' would print "Hello, World!"
        // finalObject.displayMessage();

        // CORRECT: This line would cause a compilation error.
        // The 'message' field in FinalClass is declared as 'final'.
        // You cannot directly reassign its value from outside the class either.
        // finalObject.message = "Another Message";

        // CORRECT: This line is perfectly fine.
        // 'finalObject' itself is not declared as 'final'.
        // It's a non-final reference variable. So, it can be reassigned to point to a
        // new object.
        finalObject = new FinalClass("New Object");

        finalObject.displayMessage(); // Output: Message: New Object
    }

    // Example of a class with a final method and a final instance variable
    static class FinalClass {
        final String message; // This instance variable is final

        public FinalClass(String message) {
            this.message = message; // Valid: Assigning to final field in the constructor
        }

        public FinalClass() {
            this("Hello, World!"); // Valid: Calls the other constructor, which assigns to the final field
        }

        public final void displayMessage() { // This method is final, meaning it cannot be overridden by subclasses
            System.out.println("Message: " + message);
        }

        public void changeMessage(String newMessage) {
            // CORRECT: This line will cause a compilation error.
            // 'this.message' is a final field and cannot be reassigned after its initial
            // assignment in the constructor.
            this.message = newMessage; // Compilation error here!
            // The method itself is NOT final, but the attempt to modify a final field
            // within it causes the error.
        }
    }
}