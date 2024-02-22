package quizzes.quiz3.q54;

import java.sql.SQLException;

public class Test {

    private static void getReport() throws SQLException{
        try{
            throw new SQLException();
        } catch(Exception e){
            // will cause Runtime (NullPointerException) if not handle properly
            throw null;
        }
    }

    public static void main(String[] args) {
        try {
            // Throw null instead of SQLException
            getReport();
        }
        // will not catch anything here (catch Runtime Exception instead)
        catch (SQLException e) {
            System.out.println("REPORT ERROR");
        } 
    }
    
}
