package fibonacci;

public class FibonacciGenerator {
	private int f1 = 1;
	private int f2 = 0;
	
	public void reset(){
		f1 = 1;
		f2 = 0;
	}
	public int current(){
		return f2;
	}
	public int getNext(){
		int t = f2;
		f2 = f2 + f1;
		f1 = t;
		return f2;
	}
	
	// main method for testing the generator by itself.
	public static void main(String[] args){
		FibonacciGenerator f = new FibonacciGenerator();
		while(true){
			System.out.println(f.getNext());
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
			}
		}
	}
}
