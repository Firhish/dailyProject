package enthuware;

class ArgsLength {
    public static void main(String[] args) {
        // out of bound since there is no args pass to main
        if (args.length != 0 & !args[0].isEmpty()) {
            System.out.println("Parameter one has content");
        } else {
            System.out.println("Invocation without parameters");
        }
    }
}
