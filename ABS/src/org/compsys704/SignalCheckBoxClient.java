package org.compsys704;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SignalCheckBoxClient extends SignalClient implements ItemListener{

	public SignalCheckBoxClient(int p, String dest) {
		super(p, dest);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
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
			if(e.getStateChange() == ItemEvent.SELECTED)
				oos.writeObject(new Object[]{true});
			else if(e.getStateChange() == ItemEvent.DESELECTED)
				oos.writeObject(new Object[]{false});
		}
		catch (IOException ee) {
			try {s.close();} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}

}
