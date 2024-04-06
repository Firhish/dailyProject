package enthuware;

public class DanglingElse {


    public static void main(String[] args) {
        
        String info[] = new String[]{"Malaysian"};
        testDangle(info);
        
    }

    static void testDangle(String[] strArr){

        if(strArr[0].equals("Japanese"))
            if(strArr[1].equals("girl"))
                System.out.println("Konichiwa");
        else System.out.println("Go away " + strArr[1]);

    }
    
}
