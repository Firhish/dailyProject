package quizzes.quiz3.q21;

public class Test{
    public static void main(String[] args) {
        int elements = 0;
        Object[] arr = {"A","E","I",new Object(), "O","U"}; // n1
        for(Object obj : arr){ // n2
            if(obj instanceof String){
                //  continue; will take the control to Line n2
                continue;
            } else{
                // break; will exit the loop and will take the control to Line n4
                break;
            }
            //  Line n3 as unreachable, which causes compilation error.
            // elements++;  // n3
        }
        System.out.println(elements); // n4
    }

}