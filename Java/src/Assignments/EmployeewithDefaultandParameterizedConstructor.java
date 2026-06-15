package Assignments;

public class EmployeewithDefaultandParameterizedConstructor {
    // EmployeewithDefaultandParameterizedConstructor.java


        String name;
        String designation;
        double salary;
        boolean isFullTime;

        // Default Constructor
        EmployeewithDefaultandParameterizedConstructor() {
            name = "Unknown";
            designation = "Trainee";
            salary = 20000;
            isFullTime = false;
        }

        // Parameterized Constructor
        EmployeewithDefaultandParameterizedConstructor(String name, String designation,
                                                       double salary, boolean isFullTime) {
            this.name = name;
            this.designation = designation;
            this.salary = salary;
            this.isFullTime = isFullTime;
        }

        // Method to display employee details
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
            System.out.println("Full Time: " + isFullTime);
            System.out.println();
        }

        // Main Method
        public static void main(String[] args) {

            // Object using default constructor
            EmployeewithDefaultandParameterizedConstructor emp1 =
                    new EmployeewithDefaultandParameterizedConstructor();

            // Object using parameterized constructor
            EmployeewithDefaultandParameterizedConstructor emp2 =
                    new EmployeewithDefaultandParameterizedConstructor(
                            "Reshma",
                            "Software Developer",
                            50000,
                            true
                    );

            System.out.println("Employee 1 Details:");
            emp1.displayInfo();

            System.out.println("Employee 2 Details:");
            emp2.displayInfo();
        }
    }
