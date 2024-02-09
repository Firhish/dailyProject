package assignments.a3.Encapsulation;

public class TestStudent {

    public static void main(String[] args) {
        
        Student student = new Student();

        student.setName("Fidaus");
        student.setAge(24);
        student.setRollNumber(1);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
    
}
