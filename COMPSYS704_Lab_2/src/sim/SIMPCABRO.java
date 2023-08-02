package sim;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SIMPCABRO implements ActionListener {
	volatile static ObjectOutputStream sA;
	volatile static ObjectOutputStream sB;
	volatile static ObjectOutputStream sR;
	volatile static ObjectOutputStream sA2;
	volatile static ObjectOutputStream sB2;
	volatile static ObjectOutputStream sR2;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, InterruptedException, IOException {
		JFrame gui = new JFrame("ABRO interface panel");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLayout(new GridLayout(2,3));

		SIMPCABRO listener = new SIMPCABRO();

		JButton A = new JButton("Signal PABRO A1");
		A.setActionCommand("PABROA");
		A.addActionListener(listener);
		A.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(A);

		JButton B = new JButton("Signal PABRO B1");
		B.setActionCommand("PABROB");
		B.addActionListener(listener);
		B.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(B);

		JButton R = new JButton("Signal PABRO R1");
		R.setActionCommand("PABROR");
		R.addActionListener(listener);
		R.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(R);
		
		
		JButton A2 = new JButton("Signal CABRO A2");
		A2.setActionCommand("CABROA");
		A2.addActionListener(listener);
		A2.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(A2);

		JButton B2 = new JButton("Signal CABRO B2");
		B2.setActionCommand("CABROB");
		B2.addActionListener(listener);
		B2.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(B2);

		JButton R2 = new JButton("Signal CABRO R2");
		R2.setActionCommand("CABROR");
		R2.addActionListener(listener);
		R2.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(R2);

		gui.pack();
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if("PABROA".equals(e.getActionCommand())){
				if(sA == null)
					sA = new ObjectOutputStream(new Socket("127.0.0.1", 4444).getOutputStream());
				sA.writeObject(new Object[]{true});
				Thread.sleep(50);
				sA.writeObject(new Object[]{false});
			}
			else if("PABROB".equals(e.getActionCommand())){
				if(sB == null)
					sB = new ObjectOutputStream(new Socket("127.0.0.1", 4445).getOutputStream());
				sB.writeObject(new Object[]{true});
				Thread.sleep(50);
				sB.writeObject(new Object[]{false});
			}
			else if("PABROR".equals(e.getActionCommand())){
				if(sR == null)
					sR = new ObjectOutputStream(new Socket("127.0.0.1", 4446).getOutputStream());
				sR.writeObject(new Object[]{true});
				Thread.sleep(50);
				sR.writeObject(new Object[]{false});
			}
			else if("CABROA".equals(e.getActionCommand())){
				if(sA2 == null)
					sA2 = new ObjectOutputStream(new Socket("127.0.0.1", 4454).getOutputStream());
				sA2.writeObject(new Object[]{true});
				Thread.sleep(50);
				sA2.writeObject(new Object[]{false});
			}
			else if("CABROB".equals(e.getActionCommand())){
				if(sB2 == null)
					sB2 = new ObjectOutputStream(new Socket("127.0.0.1", 4455).getOutputStream());
				sB2.writeObject(new Object[]{true});
				Thread.sleep(50);
				sB2.writeObject(new Object[]{false});
			}
			else if("CABROR".equals(e.getActionCommand())){
				if(sR2 == null)
					sR2 = new ObjectOutputStream(new Socket("127.0.0.1", 4456).getOutputStream());
				sR2.writeObject(new Object[]{true});
				Thread.sleep(50);
				sR2.writeObject(new Object[]{false});
			}
		}catch(IOException | InterruptedException aa){}
	}
}
