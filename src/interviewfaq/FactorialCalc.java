package interviewfaq;

import java.util.Scanner;

public class FactorialCalc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Result (Iterative): " + calcIterative(num));
        System.out.println("Result (Recursive): " + calcRecursive(num));

    }

    static int calcIterative(int num){
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    static int calcRecursive(int num){
        if(num == 0){
            return 1;
        }
        return num * calcRecursive(num - 1);
    }
    
}
