package refresher.Static;

public class RefresherPlayground {
    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        obj1.helloObject();
        Test1.helloClass();

        new Test1("ayam","itik").helloObject();
        
    }
}
