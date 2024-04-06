package enthuware;

public class BitWise {
    public static void main(String[] args) {

        // Integer ()
        System.out.println(8|7);
        System.out.println(4&7);

        // Boolean
        System.out.println(true|false);
        System.out.println(false|false);

        boolean b = 9<8|1>0 ? false : true;
        System.out.println(b);
    }
}
