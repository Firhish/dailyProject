package enthuware;

public class ElidapizSiemens {

    private static int getHighest(String m[][]){

        int highest = 0;
        for (String[] row : m){
            for (String element : row){
                int x;

                try {
                    x = Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    continue;
                }

                if(x > highest){
                    highest = x;
                }
            }
        }

        return highest;
    }

    private static int getLowest(String m[][]){

        int lowest = Integer.MAX_VALUE;
        for (String[] row : m){
            for (String element : row){
                int x;

                try {
                    x = Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    continue;
                }

                if(x < lowest){
                    lowest = x;
                }
            }
        }

        return lowest;
    }

    private static void getResult(String m[][]){

        int highest = getHighest(m);
        int lowest = getLowest(m);

        System.out.printf("highest: %d; lowest: %d; difference: %d",highest,lowest,highest-lowest);

    }

    public static void main(String[] args) {
        
        String[][] m = new String[][]{{"Mount Elbert","Mount Blanc","745","Mount Apo"},
                                      {"4123","7415","677","756"},
                                      {"3657","Mount Everest","3142","125"},
                                      {"788","677","Mount Kinabalu","Mount Fuji"}};
        
        getResult(m);

        

    }
    
}
