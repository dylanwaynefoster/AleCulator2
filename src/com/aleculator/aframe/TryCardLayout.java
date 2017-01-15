package com.aleculator.aframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class TryCardLayout extends JFrame {
	
	private CardLayout xCards = new CardLayout();
	private Container khan = getContentPane();
	final int WIDTH = 550;
	final int HEIGHT = 550;
	private JPanel panel = new JPanel();
	JMenuBar mainBar = new JMenuBar();
	JMenu go = new JMenu("Go!");
	JMenuItem doIT = new JMenuItem("Do It!");
	JLabel otherCalcMessage = new JLabel("TEST Other Calculation Message!");
	
	public TryCardLayout(){
		
		khan.setLayout(xCards);
		
		//Set up Menu Bar...
		setJMenuBar(mainBar);
		mainBar.add(go);
		go.add(doIT);
		
		khan.setBackground(Color.RED);
		khan.setSize(WIDTH, HEIGHT);
		add("panel", panel);
		panel.setBackground(Color.GREEN);
		panel.setSize(WIDTH, HEIGHT);
		panel.add(otherCalcMessage);
		this.setSize(WIDTH, HEIGHT);
		setVisible(true);
		
		doIT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent javaLayoutManagersSuck){
				khan.remove(panel);;				
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		//*******************************************
		//JFrame.setDefaultLookAndFeelDecorated(true);
		TryCardLayout switchMe = new TryCardLayout();
		switchMe.setVisible(true);
		
	}
	
}
