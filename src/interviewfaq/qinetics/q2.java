package interviewfaq.qinetics;

public class q2 {

    static String[] arrQ2 = getCompleteArr();

    private static char addNumber(int inc) {
        char c = '\u0030';
        c += inc;
        return c;
    }

    private static char addAlphabet(int inc) {
        char c = '\u0061';
        c += inc;
        return c;
    }

    private static String[] getCompleteArr() {
        boolean toggle = true;
        int numInc = 0;
        int alphInc = 0;
        String[] temp = new String[200];
        int indexArrQ1 = 0;

        for (int i = 0; i < 200; i++) {
            if (i == 0) {
                temp[i] = "" + addNumber(numInc);
                numInc++;
            }
            if (i % 2 == 0) {

                if (toggle) {

                    temp[i] = "" + addNumber(numInc);
                    numInc++;
                    if (numInc > 9) {
                        numInc = 0;
                    }

                    toggle = !toggle;

                } else {
                    temp[i] = "" + addAlphabet(alphInc);
                    alphInc++;
                    if (alphInc > 19) {
                        alphInc = 0;
                    }

                    toggle = !toggle;
                }

            } else{
                temp[i] = q1.arrQ1[indexArrQ1];
                indexArrQ1++;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        for (String string : arrQ2) {
            System.out.println(string);
        }
    }

}
