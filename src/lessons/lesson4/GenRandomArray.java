package lessons.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class GenRandomArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.print("Enter length: ");
        int len = sc.nextInt();

        sc.close();

        displayNumber(start,end,len);
        
    }

    public static void displayNumber(int start, int end, int len){

        ArrayList<Integer> numArr = new ArrayList<>();

        
        for(int i = 0; i < len; i++){
            
            // justification
            // Math.random() will generate a number within (0 - 1). eg. 0.624...
            // (end - start) to get biggest number to be multiply by the generated value to get results that falls within the range.
            // (+1) to make the "end" value achievable, without it the max result will be (end - 1).
            // (+start) to ensure the result minimum value to "start" value.

            numArr.add((int)(Math.random() * (end - start + 1) + start));

        }

        System.out.print(numArr.toString());

    }
    
}
