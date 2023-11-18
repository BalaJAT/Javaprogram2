package learning.java;

public class TeaTestPolymorphism {
	
	public static void main(String[] args) {
        // Creating an array of Tea objects
        Tea[] teas = new Tea[3];
        
        // Creating instances of Tea and its subclasses
        teas[0] = new Tea("Generic");
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();

        // Using polymorphism to call prepareTea method on each object
        for (Tea tea : teas) {
            System.out.println("Preparing " + tea.type + " tea:");
            tea.prepareTea();
            System.out.println("--------------------------");
        }
    }

}
