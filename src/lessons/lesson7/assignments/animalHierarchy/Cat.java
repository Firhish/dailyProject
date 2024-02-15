package lessons.lesson7.assignments.animalHierarchy;

public class Cat extends Animal {
    public Cat(String name, int age) {
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
        System.out.println("Meow!");
    }
}
