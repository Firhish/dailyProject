package refresher.Algorithm;

import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number to start: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(IterativeCalc(num));



    }

    static int IterativeCalc(int num){

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        return res;
    }
    
}
