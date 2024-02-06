package assignments.a1;

public class Assignment1 {
    public static void main(String[] args) {

        //passing arguments to main method

        //display amount of arguments passed
        System.out.println("\nThere are " + args.length + " arguments");

        // display all arguments one by one using for loop
        for(int i = 0; i < args.length; i++){
            System.out.printf("Argument number %d: %s\n",i + 1, args[i]);
        }   

        //declaring variables using different data types
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello, Dunia!";

        //displaying all declared variables
        System.out.println("\nInteger Number: " + integerNumber); 
        System.out.println("Double Number: " + doubleNumber); 
        System.out.println("Boolean Value: " + boolValue); 
        System.out.println("Character Value: " + charValue); 
        System.out.println("String Value: " + stringValue); 
    }
    
}
