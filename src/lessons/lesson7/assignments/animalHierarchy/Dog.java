package lessons.lesson7.assignments.animalHierarchy;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("Eat...");
    }

    @Override
    void sleep() {
        System.out.println("Sleep...");
    }

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}