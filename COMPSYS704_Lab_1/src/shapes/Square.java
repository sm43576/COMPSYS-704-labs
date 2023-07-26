package shapes;

public class Square extends Shape {
	// TODO: Implement as per the UML
	private String string;
	private int i;
	private double area;
	
	public Square(String string, int i) {
		// TODO Auto-generated constructor stub
		
		this.string= string;
		this.i=i;
	}
	// TODO: Implement as per the UML
	
	
	public String calculateArea() {

		this.area =i*i;
		return String.valueOf(this.area);
	
	}


	public String getName() {
		// TODO Auto-generated method stub
		return this.string;
	}	
}
