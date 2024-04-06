package enthuware;

public class BreakConcept {

    // Loop concept
    // 1. Type of loops (do-while, while, for)
    // 2. Component of loop (1.Initialization 2.Condition 3.Update)
    // 3. for loop fundamental
    // 4. Nested looping fundamental
    // 5. Label & continue/break (loop vs if else)

    public static void main(String[] args) {

        int x = 1;

        loop: for (int j = 0; j < 1; j++) {

            switch (x) {
                case 1:
                    if (x < 10) {break loop;}
                default:
                    System.out.println("default");
                    break;
            }

            System.out.println("inside loop");
        }

        System.out.println("outside loop");

    }
    
}
