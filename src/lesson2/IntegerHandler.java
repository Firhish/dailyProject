package lesson2;

public class IntegerHandler {

    private int x;
    private int[] a = new int[]{1,2,3};

    public IntegerHandler(int x, int[] a){

        this.x = x;
        this.a = a;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    //private because i only using this in the class
    private int getVolume(){
        return a[0] * a[1] * a[2];
    }

    public int getTotalVolume(){
        return x * getVolume();
    }

}
