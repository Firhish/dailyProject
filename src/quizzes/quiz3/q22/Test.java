package quizzes.quiz3.q22;

class MyClass implements GetSetGo{

    // The only method which compulsory to be implemented
    @Override
    public void abstractMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abstractMethod'");
    }

}

public class Test {
    public static void main(String[] args) {
        GetSetGo[] arr = new GetSetGo[5];
        for(GetSetGo obj : arr){
            // count variable is static and final
            // it only can be called statically
            // it cant be updated
            // obj.count++;
        }
    }
}
