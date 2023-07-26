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
		}
		public void printList() {
			// TODO: Print the sequence
		}
	}
}
