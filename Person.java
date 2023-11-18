package learning.java;

public class Person {
	 private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	        // Example usage:
	        // Create an instance of the Person class
	        Person person1 = new Person("bala", 25);

	        // Access attributes using getter methods
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());
	    }
	}
