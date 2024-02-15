package lessons.lesson7.assignments.animalHierarchy;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    abstract void eat();
    abstract void sleep();
    abstract void makeSound();

    @Override
    public String toString() {
        return String.format("name: %s, age: %d", name,age);
    }
}
