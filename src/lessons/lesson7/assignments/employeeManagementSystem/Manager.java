package lessons.lesson7.assignments.employeeManagementSystem;

public class Manager extends Employee {

    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateSalary() {
        this.salary = 10000;
    }
    
}