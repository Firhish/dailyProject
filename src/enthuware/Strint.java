package enthuware;

class StrintClass {

    int[] value;
    int length;

    StrintClass(int[] value) {
        this.value = value;
        this.length = value.length;
    }

    int intAt(int index) {
        return value[index];
    }

    public String test() {
        String temp = "";
        for (int i = 0; i < value.length; i++) {
            if (i == (value.length - 1)) {
                temp += value[i];
                break;
            }
            temp += value[i] + ", ";
        }
        return temp;
    }

    @Override
    public String toString() {
        return "[" + test() + "]";
    }

}

public class Strint {

    public static void main(String[] args) {

        StrintClass str = new StrintClass(new int[] { 1, 2, 3, 4, 5, 6, 7 });
        // System.out.println(str.length);
        // System.out.println(str.intAt(1));

        System.out.println(str);

    }
}