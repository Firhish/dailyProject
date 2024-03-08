package enthuware;

public class StringBuilderBlooper {

    

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("blooper");

        // the 'start' argument is where the substring start
        sb.append(sb.substring(4));

        // the 'end' argument is not included, it is more like a boundary
        sb.delete(3, 5);

        System.out.println(sb);

        // System.out.println(sb.append(sb.substring(4)).delete(3, 5)); // will not delete end
        
    }
    
}
