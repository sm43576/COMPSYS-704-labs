package shapes;

public class Circle extends Shape {

	public Circle(String string, int i) {
		super(string, i);
		// TODO Auto-generated constructor stub
		this.i = i;
	}


	private String string;
	private int i;
	private double area;
	
	
	// TODO: Implement as per the UML
	
	
	public String calculateArea() {
		double pi = 3.1415;
		this.area = Math.pow(i,2)*pi;
		
		return String.valueOf(this.area);
	}	
	

}
