package lessons.lesson7.assignments.employeeManagementSystem;

public class Intern extends Employee {

    public Intern(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateSalary() {
        this.salary = 500;
    }
    
}
