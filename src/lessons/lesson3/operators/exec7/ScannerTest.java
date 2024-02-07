package lessons.lesson3.operators.exec7;
import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        if(x!=y){
            System.out.println("1");
        }
        if (x>y) {
            System.out.println("2");
        }
        if (x%y == 0) {
            System.out.println("3");
        }

        sc.close();
        
    }

    //answer
    // i. 1
    // ii. 3
    // iii. 1 2
    // iv. 1 2 3

    
}
