package lessons.lesson7.assignments.employeeManagementSystem;

public class Developer extends Employee {

    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    void calculateSalary() {
        this.salary = 3000;
    }
    
}
