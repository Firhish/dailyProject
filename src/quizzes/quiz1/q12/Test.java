package quizzes.quiz1.q12;

public class Test {

    public static void main(String[] args) {
        
        String[] arr = {"L","I","V","E"}; 
        int i = -2;

        if(i++ == -1){          // here i = -2, since i++ iterate later  
            arr[-(--i)] = "F";  
        } else if(--i == -2){   // here i = -2 + 1 - 1 = -2, since it already iterate (+1) in line 10 and deduct (-1) in this line
            arr[-++i] = "O";    // here i = -1, since ++i iterate immediately, the index accessed is -(-1) = +1 which is "I" and value "O" assigned
        }

        for(String s: arr){
            System.out.println(s); // The output will be LOVE
        }
    }
    
}
