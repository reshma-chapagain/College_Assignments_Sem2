package employee;

public class EmployeeSalary {

    public double calculateSalary(EmployeeDetails emp) {
        double deduction = (emp.monthlySalary / 30) * emp.numberOfAbsentInMonth;
        return emp.monthlySalary - deduction;
    }

    public static void main(String[] args) {
        EmployeeDetails ram = new EmployeeDetails();
        ram.name = "Ram";
        ram.monthlySalary = 50000;
        ram.numberOfAbsentInMonth = 2;

        EmployeeSalary salary = new EmployeeSalary();

        System.out.println("Employee:   " + ram.name);
        System.out.println("Net Salary: " + salary.calculateSalary(ram));
    }
}