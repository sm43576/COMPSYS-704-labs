public class Exercise2 {
	public static void main(String[] args) {
		Fibonacci list1 = new Fibonacci(10);
		Fibonacci list2 = new Fibonacci(20);
		list1.printList();
		list2.printList();
	}

	static class Fibonacci {
		private int n;

		public Fibonacci(int n) {
			this.n = n;
		}//https://canvas.auckland.ac.nz/courses/86782/files/11266247?module_item_id=1906835#

		public void printList() {
			// TODO: Print the sequence
			int x1=1; 
			int x2=1;
			int state = 1;
			System.out.println("1 1");
			
			for(int i=0;i<n-2;i++) {
				
				if (state==0) {
					x1=x1+x2;
					System.out.println(x1);
					state=1;
				}
				
				if (state==1) {
					x2=x1+x2;
					System.out.println(x2);
					state=0;
				}
				
			}
			
		}
	}
}
