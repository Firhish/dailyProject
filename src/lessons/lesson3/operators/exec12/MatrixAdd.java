package lessons.lesson3.operators.exec12;

import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your last value to sum: ");
        int n = sc.nextInt();
        System.out.println(matrix(n));
        sc.close();

    }

    static int matrix(int n){
        return ((n/2)*(n+1));
    }
    
}
