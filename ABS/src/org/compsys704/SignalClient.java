package org.compsys704;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;


public class SignalClient implements ActionListener{

	Socket s = new Socket();
	ObjectOutputStream oos = null;
	int port;
	final String ip = "127.0.0.1";
	
	String dest;
	
	public SignalClient(int p, String dest){
		this.dest = dest;
		port = p;
		try {
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(s.isClosed()){
				s = new Socket();
				s.connect(new InetSocketAddress(ip, port), 10);
				oos = new ObjectOutputStream(s.getOutputStream());
				oos.writeObject(dest);
				int resp = s.getInputStream().read();
				if(resp < 0)
					throw new ConnectException("Not thru");
			}
			oos.writeObject(new Object[]{true});
			Thread.sleep(50);
			oos.writeObject(new Object[]{false});
		}
		catch (IOException | InterruptedException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
		
	}
}
