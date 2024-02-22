package quizzes.quiz3.q34;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base{
    // It is legal for the constructors to have throws clause.
    Base() throws IOException{
        System.out.println(1);
    }
}

// Java compiler adds super(); as the first statement inside Derived class's constructor:
// As super(); invokes the constructor of Base class (which declares to throw IOException),
// compiler complains as Derived class no-argument constructor doesn't declare to throw IOException
//  It declares to throw FileNotFoundException (subclass of IOException), which is not enough for the instances of IOException

class Derived extends Base{
    // Derived() throws FileNotFoundException{}  // FileNotFound is subclass of IOExceptions
    Derived() throws IOException{
        System.out.println(2);
    }
}

public class Test {
    
}
