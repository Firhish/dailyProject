package quizzes.quiz3.q36;

public class Aeroplane implements Flyable{

    @Override
    public void land() {
        // can put dash to make the value negative
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees.");
    }

    public static void main(String[] args) {
        new Aeroplane().fly();
        new Aeroplane().land();
    }
    
}
