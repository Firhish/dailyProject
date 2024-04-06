package enthuware;

public class yEqn {

    private int m;
    private int c;

    yEqn(int m, int c){
        this.m = m;
        this.c = c;
    }

    double calcY(double x){
        return m * x + c;
    }

    public static void main(String[] args) {

        yEqn obj1 = new yEqn(2,3);
        yEqn obj2 = new yEqn(4,5);

        System.out.println(obj1.calcY(2));

    }
    
}
