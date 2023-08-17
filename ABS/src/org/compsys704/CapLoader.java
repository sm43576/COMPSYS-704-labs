package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CapLoader extends JFrame {
	private JPanel panel;
	
	public CapLoader() {

		panel = new Canvas();
		panel.setPreferredSize(new Dimension(700, 400));
		panel.setBackground(Color.WHITE);
		JButton enable = new JButton("enable");
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ENABLE_SIGNAL));

		JPanel ss = new JPanel();
		ss.add(enable);

		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);
		
		// Radio buttons
		SignalRadioClient src = new SignalRadioClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_Mode);
		
		

		// Checkboxes
		JRadioButton c1 = new JRadioButton("c1"); // state 1
		c1.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIGNAL_CONVEYOR_IDLE));

		JRadioButton c2 = new JRadioButton("c2"); //state 2
		c2.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.CONVEYOR_ACTIVE));
		
		JRadioButton c3 = new JRadioButton("c3"); // state 3
		c3.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.CONVEYOR_DELIVERED));
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(c1);
		bg.add(c2);
		bg.add(c3);
		
		
		JPanel pan2 = new JPanel(new GridLayout(1, 0));
		pan2.add(c1);
		pan2.add(c2);
		pan2.add(c3);

		pan2.setBorder(BorderFactory.createTitledBorder("Manual control"));
		src.setCheckBoxComponent(pan2);


		c.gridx = 0;
		c.gridy = 2;
		this.add(pan2,c);
		
		this.setTitle("Cap Loader");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		new Thread(server).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
