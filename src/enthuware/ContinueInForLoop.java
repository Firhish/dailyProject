package enthuware;

public class ContinueInForLoop {

    public static void main(String[] args) throws Exception {
        String[] sa = { "a", "b", "c" };
        for (String s : sa) {
            if ("b".equals(s))
                continue;                    // continue means proceed to the next iteration, dont bother the code that comes after
            System.out.println(s);
            if ("b".equals(s))
                break;                       // break from the loop
            System.out.println(s + " again");
        }
    }

}
