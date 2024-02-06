import lesson2.IntegerHandler;
import lesson2.StringHandler;
import lesson1.AnotherClass;

public class App {
    public static void main(String[] args) {
        // lesson1();
        lesson2();
    }

    public static void lesson1(){
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.second();
        AnotherClass.third();
    }

    public static void lesson2(){
        StringHandler stringHandler = new StringHandler("Heslooo");
        System.out.println(stringHandler.toString());

        int numberOfVessels = 15;
        int[] dimension = {2,4,7};
        int totalVolume;
        IntegerHandler integerHandler = new IntegerHandler(numberOfVessels, dimension);
        totalVolume = integerHandler.getTotalVolume();
        System.out.printf("%d",totalVolume);
    }
}
