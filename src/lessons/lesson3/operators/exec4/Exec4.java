package lessons.lesson3.operators.exec4;

public class Exec4 {
    public static void main(String[] args) {
        double d = 0;

        System.out.printf("Original d = %f \n",d);
        for(int i = 0; i < 10; i++){
            System.out.printf("d + %d increments = %f\n",(i+1),d + ((i+1)/10.00));
        }
    }
}
