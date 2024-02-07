package lessons.lesson3.operators.exec7;

import java.util.Scanner;

public class ScannerTest2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p: ");
        boolean p = sc.nextBoolean();

        System.out.print("Enter q: ");
        boolean q = sc.nextBoolean();

        sc.close();

        if(p && q){
            q = false;
        } else {

            if (!q) {
                System.out.println(p);
            }
            if(p == q){
                System.out.println(p||q);
            }
        }
        System.out.println(q);


    }

}
