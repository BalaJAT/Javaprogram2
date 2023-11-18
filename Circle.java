package learning.java;

public class Circle {
	
	  // Data member
    private double radius;

    // No-argument constructor
    public Circle() {
        radius = 0.0;
    }

    // Two-argument constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Example usage
        Circle circle1 = new Circle(); // Using no-argument constructor
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(5.0); // Using two-argument constructor
        System.out.println("\nCircle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());

        // Changing the radius of circle1
        circle1.setRadius(3.0);
        System.out.println("\nCircle 1 - Updated Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Updated Circumference: " + circle1.calculateCircumference());
    }

}
