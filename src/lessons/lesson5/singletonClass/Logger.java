package lessons.lesson5.singletonClass;

import java.time.LocalDateTime;

// A Singleton class in Java is a class that allows only one instance of itself to be created
// and provides a way to access that instance from anywhere in the program. Singleton classes
// are appropriate when you want to ensure that there's only one instance of a class throughout
// the entire application, such as logging, configuration settings, database connections, etc.

public class Logger {

    private static Logger instance = null;
    
    // Private to avoid instantiation
    private Logger(){}

    public static Logger getInstance() {

        if(instance == null){

            instance = new Logger();
        }

        return instance;

    }

    public void log(String msg){

        LocalDateTime curTime = LocalDateTime.now();
        System.out.println(msg + " " + curTime);
    }
    
}
