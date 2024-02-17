package quizzes.quiz2.q66;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[" + name +", " + age +"]";
    }

    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student stud = (Student)obj;
            if (this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}



public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        // remove(Object) method removes the first occurrence of matching object
        students.remove(new Student("James", 25));

        for(Student stud : students){
            System.out.println(stud);
        }
    }
    
}
