package lessons.lesson6.SerializeAndDeserialize;
import java.io.*;

// serialization refers to the process of converting an object into a byte stream, which can then be saved to a file or transmitted over a network
public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 32;
        employee.address = "1234 Main Street";

        try (FileOutputStream fos = new FileOutputStream("employee.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employee);
            System.out.println("Employee object serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


