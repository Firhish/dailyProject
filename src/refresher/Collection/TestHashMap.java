package refresher.Collection;
import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap <String,String[][]> classMap = new HashMap<>();

        classMap.put("5 Bestari", new String[][]{{"ainur","puteri"},{"daus","apiz"}});
        classMap.put("5 Cerdik", new String[][]{{"haikal","amirul"},{"nasreen","dina"}});

        for (String className : classMap.keySet()) {
            
            System.out.printf("\nSeating arrangment for %s:",className);
            
            for (int i = 0; i < classMap.get(className).length;i++) {
                
                System.out.printf("\n   Row %d: ", i + 1);

                for(int j = 0; j < classMap.get(className)[i].length; j++ ){

                    // Mine
                    if(j < classMap.get(className)[i].length - 1){
                        System.out.printf("%s, ",classMap.get(className)[i][j]);
                    }else{
                        System.out.printf("%s ",classMap.get(className)[i][j]);
                    }

                    // Ida
                    // String comma = ",";
                    // if(j == classMap.get(className)[i].length - 1){
                    //     comma = "";
                    // }
                    // System.out.printf("%s%s ",classMap.get(className)[i][j],comma);
                    
                }

            }
        }

        
        
    }

}
