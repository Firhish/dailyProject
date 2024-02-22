package quizzes.quiz3.q26;

public class Test {
    public static void main(String[] args) {
        String text = "ONE ";
        StringBuilder sb = new StringBuilder("ONE ");

        // .concat create a new object instead of updating the existing one (text)
        // Similar to ONE + ONE + ELEVEN
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());

        // .append update the sb var 
        // inner sb.append("ELEVEN") assigned sb value to "ONE ELEVEN"
        // outer sb.append assigned the updated value to "ONE ELEVEN ONE ELEVEN"
        sb.append(sb.append("ELEVEN "));
        System.out.println(sb);
    }
    
}
