package lessons.lesson3.operators.exec8;

import java.util.Scanner;

public class FlowExercise {

    public static void main(String[] args) {
        
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("Enter c: ");
        c = sc.nextInt();

        sc.close();
        
        System.out.printf("maximum = %d", bloC(a,b,c));
    }

    static int bloC(int _a, int _b, int _c){

        int a = _a;
        int b = _b;
        int c = _c;
        int m = Integer.MIN_VALUE;

        if(a <= b){
            m = b;
        } else{
            m = a;
        }
        
        if(m <= c){
            m = c;
        }
        
        return m;

    }
    
}
