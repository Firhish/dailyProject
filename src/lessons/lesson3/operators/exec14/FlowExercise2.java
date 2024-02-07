package lessons.lesson3.operators.exec14;

import java.util.Scanner;

public class FlowExercise2 {

    public static void main(String[] args) {

        int i, n, nFact;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        sc.close();
        
        i = 1;
        nFact = 1;

        while (i<=n) {
            nFact *= i;
            i += 1;
        }

        System.out.printf("n! = %d",nFact);
        
    }
    
}
