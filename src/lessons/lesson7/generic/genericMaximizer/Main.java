package lessons.lesson7.generic.genericMaximizer;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = new Integer[]{4,3,5,7,1};
        Character[] arrChar = new Character[]{'q','w','e','r','t','y'};
        String[] arrString = new String[]{"a","abcd","abc","ab"};

        Maximizer<Integer> testArrInt = new Maximizer<>(arrInt);
        Maximizer<Character> testArrChar = new Maximizer<>(arrChar);
        Maximizer<String> testArrString = new Maximizer<>(arrString);

        // Add compare method from Object data type Class
        System.out.println(testArrInt.findMax(Integer::compare));
        System.out.println(testArrChar.findMax(Character::compare));
        System.out.println(testArrString.findMax(String::compareTo));
        

    }
    
}
