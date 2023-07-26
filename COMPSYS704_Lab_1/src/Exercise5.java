import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {

		unoReverse number = new unoReverse(1938);
	
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		int myint = keyboard.nextInt();
		
		unoReverse scan = new unoReverse(myint);
		
	}
	
	static class unoReverse {
		private String n;

		public unoReverse(int n) {
			this.n = String.valueOf(n);
			reverseString();
		}//https://canvas.auckland.ac.nz/courses/86782/files/11266247?module_item_id=1906835#

		public void reverseString() {
			String originalStr = this.n;
			String reversedStr = "";	
			
			for (int i = 0; i < originalStr.length(); i++) {
				  reversedStr = originalStr.charAt(i) + reversedStr;
				}

				System.out.println("Reversed string: "+ reversedStr);
		}
}
}
