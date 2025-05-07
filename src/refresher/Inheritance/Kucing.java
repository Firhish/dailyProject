package refresher.Inheritance;

public class Kucing extends Haiwan implements Makhluk,Hamba{ 

    void bergerak(){
        System.err.println("berlari");
    }

    void mencakar(){
        System.out.println("cakar sofa");
    }

    public void mati() {
        System.out.println("kucing mati");
    }

    public void berzikir() {
        System.out.println("Alhamdulillah");
    }
}