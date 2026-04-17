        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", 5000));
        employees.add(new Employee("Anna", "Smith", 6500));
        employees.add(new Employee("Mike", "Brown", 4500));

        // Function to format employee card
        java.util.function.Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        // Method reference to get salary
        java.util.function.Function<Employee, Double> salaryPicker = Employee::getSalary;

        System.out.println("\nEmployee Info:");
        for (Employee e : employees) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary only: $" + salaryPicker.apply(e));
        }
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}