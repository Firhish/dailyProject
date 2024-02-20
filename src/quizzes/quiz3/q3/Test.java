package quizzes.quiz3.q3;

class Currency{
    // this is super.notation
    String notation = "-";
    public String getNotation() {
        return notation;
    }
}

class USDollar extends Currency{
    String notation = "$";
    public String getNotation() {
        return notation;
    }
}

class Euro extends Currency{
    String notation = "@";
    public String getNotation() {
        return notation;
    }
}

public class Test {
    public static void main(String[] args) {
        Currency c1 = new USDollar();
        Currency c2 = new Euro();

        System.out.println(c1.notation + ":" + c1.getNotation());
        System.out.println(c2.notation + ":" + c2.getNotation());
    }
    
}
