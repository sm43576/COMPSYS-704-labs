
import java.io.IOException;

import com.systemj.netapi.TCPSender;


public class Exercise4{
	
	public static void main(String[] args) {
		while(true) {
		try {
		TCPSender s = new TCPSender("127.0.0.1", 4000);
		s.emit("A", 1000); // Emitting a String "val" for 2 seconds
		
		
		TCPSender s1 = new TCPSender("127.0.0.1", 4001);
		s1.emit("B", 1000); // Emitting a String "val" for 2 seconds
		
		TCPSender s2 = new TCPSender("127.0.0.1", 4002);
		s2.emit("R", 2000); // Emitting a String "val" for 2 seconds
		
		s.close(); // close when necessary
		s1.close(); // close when necessary
		s2.close(); // close when necessary
		
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}