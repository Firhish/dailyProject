package lessons.lesson3.operators.exec13;

public class SwitchCaseTest {

    public static void main(String[] args) {
        
        int day = 1;

        switch (day) {
            case 1: case 2: case 3:                   //multiple case, 1 action
                System.out.println("Monday");
                break;
            
            case 4:
                System.out.println("Tuesday");
                break;
            
            case 5:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid days");
                break;
        }
    }
    
}
