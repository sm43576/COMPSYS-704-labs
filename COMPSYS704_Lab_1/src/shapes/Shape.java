package shapes;

public abstract class Shape {
	// TODO: Implement as per the UML
	private String string;
	private int i;
	public int area;
	
	public Shape(String string, int i) {
		// TODO Auto-generated constructor stub
		
		this.string= string;
		this.i=i;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.string;
	}	
}
