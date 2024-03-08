package lessons.last_lessons;

public class StringComparison {
    public static void main(String[] args) throws Exception {
        
        String str1 = new String("Java");
        String str2 = new String("Java");

        String str3 = "Java";
        String str4 = "Java";

        StringBuffer sbf1 = new StringBuffer(str1);
        StringBuffer sbf2 = new StringBuffer(str1);

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str1);

        // STRING CLASS

        // if(str1.equals(str2)){
        //     System.out.println("its the same");
        // }
        // else{
        //     System.out.println("its not the same");
        // }

        if(str1 == str2){
            System.out.println("its the same");
        }
        else{
            System.out.println("its not the same");
        }

        // STRING BUFFER CLASS

        // if(sbf1.equals(sbf2)){
        //     System.out.println("its the same");
        // }
        // else{
        //     System.out.println("its not the same");
        // }

        // if(sbf1 == sbf2){
        //     System.out.println("its the same");
        // }
        // else{
        //     System.out.println("its not the same");
        // }

        // STRING BUILDER

        // if(sb1.equals(sb2)){
        //     System.out.println("its the same");
        // }
        // else{
        //     System.out.println("its not the same");
        // }

        // if(sb1 == sb2){
        //     System.out.println("its the same");
        // }
        // else{
        //     System.out.println("its not the same");
        // }

        // str1.equals(str2)  // true 
        // str1 == str2       // false (different loc)

        // sbf1.equals(sbf2)  // false
        // sbf1 == sbf2       // false (different loc)

        // sb1.equals(sb2)    // false
        // sb1 == sb2         // false (different loc)
    }
}
