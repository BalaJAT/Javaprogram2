package learning.java;

public class Tea1 {
	
	 public String type;
	    public boolean milk;
	    public boolean sugar;

	    public Tea1(String type) {
	        this.type = type;
	        this.milk = false;
	        this.sugar = false;
	    }

	    public void prepareTea() {
	        System.out.println("Preparing a basic tea with hot water and tea leaves.");
	    }

	    public void addMilk() {
	        this.milk = true;
	        System.out.println("Adding milk to the tea.");
	    }

	    public void addSugar() {
	        this.sugar = true;
	        System.out.println("Adding sugar to the tea.");
	    }
	}

	// Subclass BlackTea
	class BlackTea extends Tea1 {
	    public BlackTea() {
	        super("Black");
	    }

	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Black tea with hot water, black tea leaves, and optionally adding milk and sugar.");
	    }
	}

	// Subclass GreenTea
	class GreenTea extends Tea1 {
	    public GreenTea() {
	        super("Green");
	    }

	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Green tea with hot water, green tea leaves, and optionally adding honey.");
	    }
	}

	// Subclass HerbalTea
	class HerbalTea extends Tea1 {
	    public HerbalTea() {
	        super("Herbal");
	    }

	    @Override
	    public void prepareTea() {
	        System.out.println("Preparing Herbal tea with hot water, herbal tea blend, and optionally adding lemon and honey.");
	    }
	}

	// Main class for testing
	public class TeaTest {
	    public static void main(String[] args) {
	        // Example usage
	        Tea1 blackTea = new BlackTea();
	        blackTea.prepareTea();
	        blackTea.addMilk();
	        blackTea.addSugar();

	        System.out.println();

	        Tea1 greenTea = new GreenTea();
	        greenTea.prepareTea();
	        greenTea.addMilk(); // Green tea might not traditionally have milk, but it's optional here.
	        greenTea.addSugar();

	        System.out.println();

	        Tea1 herbalTea = new HerbalTea();
	        herbalTea.prepareTea();
	        herbalTea.addMilk(); // Herbal tea might not traditionally have milk, but it's optional here.
	        herbalTea.addSugar();
	    }
	
	

}
