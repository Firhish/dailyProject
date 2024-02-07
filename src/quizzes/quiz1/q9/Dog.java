package quizzes.quiz1.q9;

public class Dog extends Animal implements Moveable {

    //Inherit move() method from Animal class
    
    //Must create one public move() to follow the interface, this function override the inherited function
    public void move(){
        System.out.println("DOG MOVING");
    }
    
}
