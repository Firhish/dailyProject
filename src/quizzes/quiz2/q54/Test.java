package quizzes.quiz2.q54;

public class Test {
    // declare it as private is not wrong since it is used inside the same class 
    // m1() throws Exception (checked) and it declares to throw it, so no issues with method m1()
    private static void m1() throws Exception{  
        throw new Exception();
    }

    // main() method neither provides catch handler nor throws clause and hence main method gives Compilation error
    // Handle or Declare rule should be followed for checked exception if you are not re-throwing it.
    public static void main(String[] args){
        // must have catch clause since the m1() expected to throw an exception
        try{
            // m1();                   
        } finally{
            System.out.println("A");
        }
    }
    
}
