package interviewfaq;

import java.util.Arrays;

public class BInarySearch {

    public static void main(String[] args) {
        int[] arr = {10,15,20,25,30,35};
        int start = 0;
        int end = arr.length - 1; // kena dgn concept put
        int target = 25;

        System.out.println("Result (recursive): " + recursiveSearch(arr, start, end, target));
        System.out.println("Result (iterative): " + iterativeSearch(arr, start, end, target));
        System.out.println("Result (using Arrays API): " + usingLibSearch(arr, target));
    }

    static int recursiveSearch(int[] arr,int start,int end,int target){
        
        if(end >= start){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                return recursiveSearch(arr, start, mid - 1, target);
            }

            if(arr[mid] < target){
                return recursiveSearch(arr, mid + 1, end, target);
            }

        }

        return -1;
    }

    static int iterativeSearch(int[] arr,int start,int end,int target){

        while(end >= start){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }
        }

        return -1;
    }

    static int usingLibSearch(int[] arr, int target){
        return Arrays.binarySearch(arr, target);
    }
    
}
