package quizzes.quiz3.q24;

public class Test {

    public static void convert(String s){
        if(s.length() == 0){
            // Dont need to declare or handle since it is an unchecked exception
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
    }

    public static void main(String[] args) {
        try{
            convert("");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
