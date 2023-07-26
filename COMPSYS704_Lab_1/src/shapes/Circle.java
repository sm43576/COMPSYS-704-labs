package shapes;

public class Circle extends Shape {

	private String string;
	private int i;
	private double area;
	
	public Circle(String string, int i) {
		// TODO Auto-generated constructor stub
		
		this.string= string;
		this.i=i;
	}
	// TODO: Implement as per the UML
	
	
	public String calculateArea() {
		double pi = 3.1415;
		this.area = Math.pow(i,2)*pi;
		
		return String.valueOf(this.area);
	}	
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.string;
	}	
}
