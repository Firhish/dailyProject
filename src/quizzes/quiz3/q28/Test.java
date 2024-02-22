package quizzes.quiz3.q28;

import java.sql.SQLException;

public class Test {

    // need to declares that this method may throw SQLException since it is a checked exception
    private static void getData() throws Exception{
        try{
            throw new SQLException();
        } catch(SQLException e){
            // attempt to reassign a new instance of SQLException to the variable e.
            // reassignment is not allowed because e is effectively final within the catch block. You cannot reassign a new value to it
            // e = new SQLException();
        
            System.out.println(e.getClass().getName());
            // throw general exception
            throw (Exception)e;
        }
    }
    public static void main(String[] args) {
        try {
            getData();
        }
        // always throw more specific type of exception
        catch(SQLException e){
            System.out.println("SQL");
        }
         catch (Exception e) {
            System.out.println("Exception");
        }
        
    }
    
}
