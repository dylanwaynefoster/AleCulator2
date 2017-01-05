//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

@SuppressWarnings("serial")
public class AleFrame extends JFrame {
	
	final int WIDTH = 300;
	final int HEIGHT = 200;
	//private Container x = getContentPane();
	ImageIcon mug = new ImageIcon("beerMug.png");
	JLabel myMessage = new JLabel("Welcome to AleCulator!");
	JLabel ogMessage = new JLabel("Enter the Original Specific Gravity:");
	JTextField getOG = new JTextField(10);
	JButton pressOG = new JButton("Enter OG");
	JLabel fgMessage = new JLabel("Enter the Final Specific Gravity:");
	JTextField getFG = new JTextField(10);
	JButton pressFG = new JButton("Enter FG");
	
	public AleFrame()
	
	{
		
		super("AleCulator2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		this.getContentPane().setBackground(Color.BLACK);
		setLayout(new FlowLayout());
		//x.setLayout(new BorderLayout());
		myMessage.setFont(new Font("Courier New", Font.ITALIC, 20));
		myMessage.setBackground(Color.BLACK);
		myMessage.setForeground(Color.GREEN);
		myMessage.setOpaque(true);
		ogMessage.setFont(new Font("Courier New", Font.BOLD, 12));
		ogMessage.setBackground(Color.BLACK);
		ogMessage.setForeground(Color.GREEN);
		fgMessage.setFont(new Font("Courier New", Font.BOLD, 12));
		fgMessage.setBackground(Color.BLACK);
		fgMessage.setForeground(Color.GREEN);
		//x.add(myMessage, BorderLayout.NORTH);
		add(myMessage);
		add(ogMessage);
		add(getOG);
		add(pressOG);
		add(fgMessage);
		add(getFG);
		add(pressFG);
		setIconImage(mug.getImage());
		
	}
}
