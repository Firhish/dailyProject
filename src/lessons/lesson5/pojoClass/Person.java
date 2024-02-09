package lessons.lesson5.pojoClass;

// A POJO (Plain Old Java Object) class in Java is a simple Java class that only contains private fields,
// along with public getter and setter methods to access and modify those fields. POJO classes are used
// to represent data objects in the application. They are appropriate when you need to model data with
// attributes but do not require any specific functionality or behavior beyond accessing and modifying
// those attributes.

public class Person {

    private String name, email;
    private int age;

    public Person(String name, String email, int age){

        this.name = name;
        this.email = email;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

}
