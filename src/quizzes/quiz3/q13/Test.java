package quizzes.quiz3.q13;

interface Rideable{
    void ride(String name);
}

class Animal{}

class Horse extends Animal implements Rideable{

    // This method is override from Rideable interface
    // Animal (Base class) dont have access to this method
    @Override
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();

        // Correct
        ((Horse)horse).ride("Emma");             // casted to Horse type
        ((Rideable)horse).ride("emma");          // casted to Rideable
        ((Rideable)(Horse)horse).ride("EMMA");   // casted to Horse and then Rideable
        ((Horse)(Rideable)horse).ride("emma");   // casted to Rideable and then Horse

        // Incorrect
        // horse.ride("EMMA");                    // horse is Animal type, cant access .ride() 
        // (Horse)horse.ride("EMMA");             // dot (.) operator has higher precedence than cast
        // (Rideable)horse.ride("emma");          // dot (.) operator has higher precedence than cast
        // (Horse)(Rideable)horse.ride("EMMA");   // dot (.) operator has higher precedence than cast
    }
}
