package assignments.a1;

public class Test {

    public static void main(String[] args) {


        //cara passing arguments dalam main
        // display number of arguments
        System.out.println("There are " + args.length + " arguments");

        for(int i = 0; i < args.length; i++){
            System.out.println((i + 1) + ". " + args[i]);
        }

        //declare n display
        // declare
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello, Dunia!";

        //display
        System.out.printf("Integer Number: %d\n",integerNumber);
        System.out.printf("Double Number: %f\n",doubleNumber);
        System.out.printf("Bool Value: %b\n",boolValue);
        System.out.printf("Char Value: %c\n",charValue);
        System.out.printf("String Value: %s\n",stringValue);

    }

    
    
}
