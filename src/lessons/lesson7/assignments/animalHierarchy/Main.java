package lessons.lesson7.assignments.animalHierarchy;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Bird", 10);
        Cat cat = new Cat("Cat", 9);
        Dog dog = new Dog("Dog", 2);

        System.out.println(bird);
        System.out.println(cat);
        System.out.println(dog);

        bird.sleep();
        cat.sleep();
        dog.sleep();

        bird.eat();
        cat.eat();
        dog.eat();

        bird.makeSound();
        cat.makeSound();
        dog.makeSound();

    }
    
}
