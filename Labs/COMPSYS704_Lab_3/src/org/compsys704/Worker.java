package org.compsys704;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Arrays;

public abstract class Worker implements Runnable {
	String signame = null;
	Socket socket = null;
	ObjectInputStream ois = null;

	public abstract void setSignal(boolean status);

	public abstract boolean hasSignal(String sn);

	public void setSocket(Socket s) {
		socket = s;
	}

	public void setObjectInputStream(ObjectInputStream o) {
		ois = o;
	}

	public void setSignalName(String n) {
		signame = n;
	}
	
	long startTime = System.currentTimeMillis();
	boolean elapsed = false;
	
	public boolean initTimeElapsed(){
		if(!elapsed){
			if(System.currentTimeMillis() - startTime > 500){
				elapsed = true;
			}
		}
		return elapsed;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Object[] o = (Object[]) ois.readObject();
				if(initTimeElapsed())
					setSignal((Boolean) o[0]);
			}
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.exit(1);
			}
		}
	}
}
