//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;

import com.aleculator.CalcMethods;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class AleFrame extends JFrame implements ActionListener {
	
	final int WIDTH = 300;
	final int HEIGHT = 250;
	//****************************************************************
	ImageIcon mug = new ImageIcon("beerMug.png");
	//****************************************************************
	JLabel myMessage = new JLabel("Welcome to AleCulator!");
	JLabel spacer = new JLabel(" ");
	JLabel ogMessage = new JLabel("Enter the Original Specific Gravity (ex. 1.056):");
	JLabel fgMessage = new JLabel("Enter the Final Specific Gravity (ex. 1.018):");
	JLabel abvMessage = new JLabel("The Alcohol by Volume percentage of you beer is:");
	//****************************************************************
	JTextField getOG = new JTextField(10);
	JTextField getFG = new JTextField(10);
	JTextField showABV = new JTextField(10);
	//****************************************************************
	JButton pressOG = new JButton("Enter OG");
	JButton pressSubmit = new JButton("Calculate!");
	//****************************************************************
	
	public AleFrame()
	
	{
		
		super("AleCulator2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		//****************************************************************
		//this.getContentPane().setBackground(Color.BLACK);
		//setLayout(new FlowLayout());
		
		/*myMessage.setFont(new Font("Courier New", Font.ITALIC, 20));
		myMessage.setBackground(Color.BLACK);
		myMessage.setForeground(Color.GREEN);
		myMessage.setOpaque(true);
		ogMessage.setFont(new Font("Courier New", Font.BOLD, 12));
		ogMessage.setBackground(Color.BLACK);
		ogMessage.setForeground(Color.GREEN);
		fgMessage.setFont(new Font("Courier New", Font.BOLD, 12));
		fgMessage.setBackground(Color.BLACK);
		fgMessage.setForeground(Color.GREEN);*/
		
		//****************************************************************		
		setLayout(new FlowLayout());
		add(myMessage);
		add(ogMessage);
		add(getOG);
		//add(pressOG);
		add(fgMessage);
		add(getFG);
		add(pressSubmit);
		add(abvMessage);
		add(showABV);
		
		setIconImage(mug.getImage());
		pressSubmit.addActionListener(this);
		
	}
	//****************************************************************
	//Event Handler...
	@Override
	public void actionPerformed(ActionEvent submissionEvent) {
		String og = getOG.getText();
		String fg = getFG.getText();
		String myABV = "";
		CalcMethods showMe = new CalcMethods();
		double ogNum = showMe.getOG(og);
		double fgNum = showMe.getFG(fg);
		myABV = showMe.getABV(ogNum, fgNum);
		showABV.setText(myABV);

	}
}
