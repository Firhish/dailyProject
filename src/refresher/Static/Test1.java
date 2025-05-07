package refresher.Static;

public class Test1 {

    private String strPrivate;
    public String strPublic;

    Test1(){}

    Test1(String str1,String str2){

        strPrivate = str1;
        strPublic = str2;

    }

    void helloObject(){
        System.out.println("hello " + strPrivate + " and " + strPublic + " println");
        System.out.printf("hello %s and %s printf",strPrivate,strPublic);
    }
    
    static void helloClass(){
        System.out.println("\nHello put");
    }



}
