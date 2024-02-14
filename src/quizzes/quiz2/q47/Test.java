package quizzes.quiz2.q47;

public class Test {

    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                switch (arr[i][j]) {
                    case "2":
                    case "4":
                    case "6":
                        break;                   // this is break for switch statements, not loop
                    default:
                        continue;                // continue iterates the inner array
                }
                System.out.println(arr[i][j]);   // only print 2,4,6. Since the switch case only breaks when it encounters those values
            }
        }

    }

}
