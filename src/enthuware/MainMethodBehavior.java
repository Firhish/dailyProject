package enthuware;

public class MainMethodBehavior {

    public static void m1(String[] args){
        System.out.println(args.length);
    }

    public static void main(String[] args) {
        String[] arr = new String[0];
        m1(arr);
        System.out.println(args.length);
    }
    
}
