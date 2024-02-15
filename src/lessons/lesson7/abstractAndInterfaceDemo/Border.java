package lessons.lesson7.abstractAndInterfaceDemo;

public abstract class Border {

    private final double border = 2 ;

    public double getBorder() {
        return border;
    }

    // overrides String test() from Shape interface 
    public String test(){
        return "hoho";
    }
    
}
