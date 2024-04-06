package enthuware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaamSiemens {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        String[][] m = new String[][]{{"Mount Elbert","Mount Blanc","745","Mount Apo"},
                                      {"4123","7415","677","756"},
                                      {"3657","Mount Everest","3142","125"},
                                      {"788","677","Mount Kinabalu","Mount Fuji"}};
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Integer val;
                try {
                    val = Integer.parseInt(m[i][j]);
                    list.add(val);
                } catch (Exception e) {
                    continue;
                }
            }
        }

        Collections.sort(list);

        int highest = list.get(list.size()-1);
        int lowest = list.get(0);
        
        System.out.printf("highest: %d; lowest: %d; difference: %d",highest,lowest,highest-lowest);
                                    
        

    }
    
}
