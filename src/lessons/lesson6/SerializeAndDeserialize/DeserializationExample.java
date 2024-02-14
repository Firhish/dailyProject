package lessons.lesson6.SerializeAndDeserialize;

import java.io.*;

// Deserialization is the process of reconstructing an object from a serialized form, typically a byte stream
public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;

        try (FileInputStream fis = new FileInputStream("employee.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            employee = (Employee) ois.readObject();
            System.out.println("Employee object deserialized successfully");
            System.out.println("Name: " + employee.name);
            System.out.println("Age: " + employee.age);
            System.out.println("Address: " + employee.address);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
