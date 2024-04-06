package enthuware;

public class Siemens {
    
    public static void main(String[] args) {

        Object[][] arr = {{"Mount Elbert","Mount Blanc", new Integer(745),"Mount Apo"},
                          {new Integer(4123),new Integer(7415),new Integer(677),new Integer(756)},
                          {new Integer(3657),"Mount Everest",new Integer(3142),new Integer(125)},
                          {new Integer(788),new Integer(677),"Mount Kinabalu","Mount Fuji"}};
        
        getResult(arr);
        
    }

    static void getResult(Object[][] arr){
        int highest = getHighest(arr);
        int lowest = getLowest(arr);
        System.out.printf("highest: %d;lowest: %d;difference: %d",highest,lowest,highest-lowest);
    }

    static int getHighest(Object[][] arr){
        int highest = Integer.MIN_VALUE;

        for (Object[] objects : arr) {
            for (Object object : objects) {
                if(object instanceof Integer){
                    if(highest < (Integer)object){
                        highest = (Integer)object;
                    }
                }
            }
        }

        return highest;
    }

    static int getLowest(Object[][] arr){
        int lowest = Integer.MAX_VALUE;

        for (Object[] objects : arr) {
            for (Object object : objects) {
                if(object instanceof Integer){
                    if(lowest > (Integer)object){
                        lowest = (Integer)object;
                    }
                }
            }
        }

        return lowest;
    }

}
