package quizzes.quiz3.q14;

interface Blogger{
    default void blog() throws Exception{
        System.out.println("GENERIC");
    }
}

// TravelBlogger class correctly overrides the default method blog() of Blogger interface
class TravelBlogger implements Blogger{
    public void blog(){
        System.out.println("TRAVEL");
    }
}

public class Test {
    public static void main(String[] args){
        // Create object with Blogger(interface) data types
        Blogger blogger =  new TravelBlogger();
        // Cast into TravelBlogger types
        ((TravelBlogger)blogger).blog();
    }
}
