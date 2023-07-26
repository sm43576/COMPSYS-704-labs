package shapes;

public class Square extends Shape {
	private String string;
	private int i;
	private double area;
	
	
	public Square(String string, int i) {
		super(string, i);
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	
	public String calculateArea() {

		this.area =i*i;
		return String.valueOf(this.area);
	
	}



}
