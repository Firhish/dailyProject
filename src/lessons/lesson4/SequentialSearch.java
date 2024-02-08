package lessons.lesson4;

public class SequentialSearch {

    public static void main(String[] args) {

        String[] a = new String[] { "kiwi", "orange", "apple" };
        String k = "orange"; // for k is found
        // String k = "banana"; // for k is not found

        int index = 0;

        while (index < a.length) {

            if (a[index].equals(k)) {

                break;

            }

            index++;

        }

        if (index >= a.length) {

            index = -1;
            System.out.printf("k is not found, index is %d", index); // k is not found

        } else {

            System.out.printf("k is found at index %d, ", index); // k is found

        }

    }

}
