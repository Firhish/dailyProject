package quizzes.quiz2.q57;

class Vehicle{
    public int getRegistrationNumber(){
        return 1;
    }
}

class Car{
    public int getRegistrationNumber(){
        return 2;
    }
}

public class Test {
    public static void main(String[] args) {
        // Vehicle obj = new Car();                          // Car is not an extend to Vehicle class
        // System.out.println(obj.getRegistrationNumber());
    }
}
