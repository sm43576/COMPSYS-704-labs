import shapes.*;

// TODO: Implement the classes in their files
//          src/shapes/Shape.java
//          src/shapes/Circle.java
//          src/shapes/Square.java

public class Exercise3 {
	public static void main(String[] args) {
		Circle circle1 = new Circle("Circle 1", 3);
		Square square1 = new Square("Square 1", 3);
		System.out.println(circle1.getName() + "'s area is: " + circle1.calculateArea());
		System.out.println(square1.getName() + "'s area is: " + square1.calculateArea());
	}
}
