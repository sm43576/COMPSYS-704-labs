package org.compsys704;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

import javax.swing.JPanel;

public class SignalRadioClient extends SignalClient {

	protected Component[] comp;
	
	public SignalRadioClient(int p, String dest) {
		super(p, dest);
	}
	
	public void setCheckBoxComponent(JPanel panel){
		comp = panel.getComponents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("0")){
			for(Component c : comp)
				c.setEnabled(false);
		}
		else if(e.getActionCommand().equals("1")){
			for(Component c : comp)
				c.setEnabled(true);
		}
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
			oos.writeObject(new Object[]{true, Integer.valueOf(e.getActionCommand())});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}
}
