package org.compsys704;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class SignalServer <T extends Worker> implements Runnable {
	private int SERVER_PORT;
	public static final String IP = "127.0.0.1";
	private Class<T> clz;

	public SignalServer(int p, Class<T> c){
		SERVER_PORT = p;
		clz = c;
	}
	
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(SERVER_PORT, 50, InetAddress.getByName(IP));
			while(true){
				Socket s = ss.accept();
				try{
					ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
					String signame = ((String)ois.readObject()).split("\\.")[1];
					T w = (T) clz.newInstance();
					if(w.hasSignal(signame))
						s.getOutputStream().write(0);
					else{
						s.close();
						continue;
					}
					w.setSignalName(signame);
					w.setObjectInputStream(ois);
					w.setSocket(s);
					new Thread(w).start();
				}
				catch(java.io.EOFException e){}
				catch (InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
					System.exit(1);;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);;
		}
	}

}
