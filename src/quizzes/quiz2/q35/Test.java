package quizzes.quiz2.q35;

public class Test {
    public static void main(String[] args) {
        String[][] fruits = {{"apple","mango"},{"orange","grape"}};
        
        // INSERT
        for(int i = 0; i < fruits.length; i++){
            for(int j = 0; j < fruits[i].length; j++){
                System.out.print(fruits[i][j] + " ");
            }
        }

        // for(String[] arr : fruits){
        //     for(String fruit : arr){
        //         System.out.print(fruit + " ");
        //     }
        // }

        // DONT INSERT
        // for(int i = 1; i < fruits.length; i++){            // Only print fruits[1][1] which is grape
        //     for(int j = 1; j < fruits[i].length; j++){
        //         System.out.print(fruits[i][j] + " ");
        //     }
        // }

        // for(int i = 1; i < fruits.length; i++){            // ArrayIndexOutOfBoundsException since it will in "j <= fruits[i].length" condition
        //     for(int j = 1; j <= fruits[i].length; j++){
        //         System.out.print(fruits[i][j] + " ");
        //     }
        // }



    }
    
}
