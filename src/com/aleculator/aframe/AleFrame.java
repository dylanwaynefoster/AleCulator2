//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

@SuppressWarnings("serial")
public class AleFrame extends JFrame {
	
	final int WIDTH = 550;
	final int HEIGHT = 550;
	//****************************************************************
	ImageIcon mug = new ImageIcon("beerMug.png");
	//****************************************************************
	JLabel myMessage = new JLabel("Welcome to AleCulator!");
	JLabel spacer = new JLabel(" ");
	JLabel ogMessage = new JLabel("Enter the Original Specific Gravity:");
	JLabel fgMessage = new JLabel("Enter the Final Specific Gravity:");
	//****************************************************************
	JTextField getOG = new JTextField(10);
	JTextField getFG = new JTextField(10);
	//****************************************************************
	JButton pressOG = new JButton("Enter OG");
	JButton pressFG = new JButton("Enter FG");
	//****************************************************************
	JPanel firstPanel = new JPanel(new GridLayout(2, 1));
	JPanel secondPanel = new JPanel(new FlowLayout());
	JPanel thirdPanel = new JPanel(new GridLayout(1, 1));
	JPanel fourthPanel = new JPanel(new FlowLayout());
	//****************************************************************
	
	public AleFrame()
	
	{
		
		super("AleCulator2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		this.getContentPane().setBackground(Color.BLACK);
		//setLayout(new FlowLayout());
		
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
		
		setLayout(new BorderLayout());
		add(firstPanel, BorderLayout.NORTH);
		add(secondPanel, BorderLayout.WEST);
		add(thirdPanel, BorderLayout.CENTER);
		add(fourthPanel, BorderLayout.PAGE_END);
		//********************************************************
		firstPanel.add(myMessage);
		firstPanel.add(ogMessage);
		secondPanel.add(getOG);
		secondPanel.add(pressOG);
		thirdPanel.add(fgMessage);
		fourthPanel.add(getFG);
		fourthPanel.add(pressFG);
		setIconImage(mug.getImage());
		
	}
}
