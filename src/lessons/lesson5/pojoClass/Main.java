package lessons.lesson5.pojoClass;

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person("Firdaus", "firdaushishamudin238@gmail.com", 24);

        System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println(person.getAge());
    }
    
}



