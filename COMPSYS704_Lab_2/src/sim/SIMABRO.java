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

public class SIMABRO implements ActionListener {
	volatile static ObjectOutputStream sA;
	volatile static ObjectOutputStream sB;
	volatile static ObjectOutputStream sR;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, InterruptedException, IOException {
		JFrame gui = new JFrame("ABRO interface panel");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLayout(new GridLayout(3,1));

		SIMABRO listener = new SIMABRO();

		JButton A = new JButton("Signal A");
		A.setActionCommand("A");
		A.addActionListener(listener);
		A.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(A);

		JButton B = new JButton("Signal B");
		B.setActionCommand("B");
		B.addActionListener(listener);
		B.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(B);

		JButton R = new JButton("Signal R");
		R.setActionCommand("R");
		R.addActionListener(listener);
		R.setPreferredSize(new Dimension(300, 50));
		gui.getContentPane().add(R);

		gui.pack();
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if("A".equals(e.getActionCommand())){
				if(sA == null)
					sA = new ObjectOutputStream(new Socket("127.0.0.1", 4000).getOutputStream());
				sA.writeObject(new Object[]{true});
				Thread.sleep(100);
				sA.writeObject(new Object[]{false});
			}
			else if("B".equals(e.getActionCommand())){
				if(sB == null)
					sB = new ObjectOutputStream(new Socket("127.0.0.1", 4001).getOutputStream());
				sB.writeObject(new Object[]{true});
				Thread.sleep(100);
				sB.writeObject(new Object[]{false});
			}
			else if("R".equals(e.getActionCommand())){
				if(sR == null)
					sR = new ObjectOutputStream(new Socket("127.0.0.1", 4002).getOutputStream());
				sR.writeObject(new Object[]{true});
				Thread.sleep(100);
				sR.writeObject(new Object[]{false});
			}
		}catch(IOException | InterruptedException aa){}
	}
}
