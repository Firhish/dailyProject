package lessons.lesson3.operators.exec9;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println(getFactorial(num));
        sc.close();

    }

    static int getFactorial(int _num){

        int num = _num;
        int res = 1;
        for(int i = 1; i <= num; i++){
            res *= i;
        }
        return res;

    }
}
