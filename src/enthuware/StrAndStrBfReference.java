package enthuware;

public class StrAndStrBfReference {

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = s1;
        s1 += " apiz";

        System.out.printf("s1: %s\ts2: %s\n",s1,s2);

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;

        sb1.append(" awak");

        System.out.printf("sb1: %s\tsb2: %s",sb1,sb2);

    }

}
