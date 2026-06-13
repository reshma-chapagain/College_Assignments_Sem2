package Unit4;

public class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void Raise() {
        salary = salary + (salary*0.10);
    }

    void display() {
        System.out.println("Name" + name);
        System.out.println("Employee Id" + employeeId);
        System.out.println("Salary with bonus" + salary);
    }

    public static void main(String[] args) {

       Employee e1 = new Employee("Jack", 10, 500);
       e1.display();
       e1.Raise();
    }
}
