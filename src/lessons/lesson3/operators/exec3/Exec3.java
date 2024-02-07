package lessons.lesson3.operators.exec3;

public class Exec3 {
    public static void main(String[] args) {
        double x1,y1,z1,x2,y2,z2,d;
        double xDiff, yDiff, zDiff;
        x1 = 2.0; y1 = 1.0; z1 = 3.0;
        x2 = 0.0; y2 = 0.0; z2 = 6.0;

        xDiff = x1 - x2;
        yDiff = y1 - y2;
        zDiff = z1 - z2;

        d = Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
        System.out.println("The distance between");
        System.out.printf("(%f, %f, %f) and ",x1,y1,z1);
        System.out.printf("(%f, %f, %f) is %f ",x2,y2,z2,d);


    }
}
