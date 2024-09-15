public class Employee {
    // Fields for the Employee class
    private String name;
    private int id;
    private Department department;

    // Constructor to initialize Employee details
    public Employee(String name, int id, String departmentName, String location) {
        this.name = name;
        this.id = id;
        this.department = new Department(departmentName, location);
    }

    // Method to get the employee details
    public String getEmployeeDetails() {
        return String.format("Employee Name: %s, ID: %d, Department: %s, Location: %s",
                name, id, department.getDepartmentName(), department.getLocation());
    }

    // Inner class Department
    private class Department {
        private String departmentName;
        private String location;

        // Constructor for the Department class
        public Department(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }

        // Getter for department name
        public String getDepartmentName() {
            return departmentName;
        }

        // Getter for location
        public String getLocation() {
            return location;
        }
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Test Case 1
        Employee employee1 = new Employee("Alice", 101, "HR", "New York");
        System.out.println(employee1.getEmployeeDetails()); // Expected: Employee Name: Alice, ID: 101, Department: HR, Location: New York

        // Test Case 2
        Employee employee2 = new Employee("Bob", 102, "IT", "San Francisco");
        System.out.println(employee2.getEmployeeDetails()); // Expected: Employee Name: Bob, ID: 102, Department: IT, Location: San Francisco

        // Test Case 3
        Employee employee3 = new Employee("Charlie", 103, "Finance", "Chicago");
        System.out.println(employee3.getEmployeeDetails()); // Expected: Employee Name: Charlie, ID: 103, Department: Finance, Location: Chicago
    }
    Scanner.close();
}
