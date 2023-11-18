package learning.java;

	public class Tea {

	    public String type;
	    public boolean milk;
	    public boolean sugar;

	    public Tea(String type) {
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


	    public static void main(String[] args) {
	        Tea tea = new Tea("black");
	        tea.prepareTea();
	        tea.addMilk();
	        tea.addSugar();
	      
	    }
}
