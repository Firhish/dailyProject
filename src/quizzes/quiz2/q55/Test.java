package quizzes.quiz2.q55;

public class Test {
    public String name;
    public void Test(){                        // this is a void method, not constructor, a method can have the same name as the class but it is not the best practice
        name = "James";
    }

    public static void main(String[] args) {
        Test obj = new Test();                // invoke default Test(){} constructor, hence name remains null
        System.out.println(obj.name);         // print null since no value assigned to obj.name
        
        obj.Test();                           // assign obj.name to "James" (basically just setter method for name attributes, but different name)
        System.out.println(obj.name);         // print "James"
    }
}
