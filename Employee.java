package learning.java;

public class Employee {

	
	private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
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

    // Additional methods
    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12; // Assuming monthly salary, calculate annual salary
    }

    // Setter method
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public String raiseSalary(double percentage) {
        salary += (salary * percentage) / 100;
        return "Salary raised by " + percentage + "%. New salary: " + salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee e1 = new Employee(8, "Bala", "manikandan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalary(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}
