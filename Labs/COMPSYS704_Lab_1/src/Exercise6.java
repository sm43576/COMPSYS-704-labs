import java.time.Month;
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {

		dateF number = new dateF("05/23/1945");
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string   

		dateF scan = new dateF(str);
	}
	
	
	static class dateF{
		private String month;
		private String day;
		private String year;

		public dateF(String s) {
			
			String parts[] = s.split("/");
	        this.month= parts[0];
	        this.day= parts[1];
	        this.year= parts[2];
	        
	        convertDate();
		}	
//		 
		public void convertDate() {
		
		Month month = Month.of(Integer.valueOf(this.month));
		
		System.out.println(this.day + " " + String.valueOf(month) + " "+ this.year );
			//23 May 1945. 
			
	}

	
}
}





/*Exercise 6: Dates are printed in several common formats.
 *  Two of the more common formats are (a) 05/23/1945 and (b) 23 May
1945. 
Write a Java application that reads a date
 from keyboard in format (a) and prints it in format (b). */









