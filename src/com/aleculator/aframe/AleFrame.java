//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;

import com.aleculator.CalcMethods;

import java.awt.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class AleFrame extends JFrame implements ActionListener {
	
	final int WIDTH = 550;
	final int HEIGHT = 550;
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
	JMenuBar mainBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu otherCalc = new JMenu("Calculations");
	JMenuItem exit = new JMenuItem("Leave this place!");
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
		//Setting up a GridBagLayout...
		setLayout(new GridBagLayout());
		//Set up Menu Bar...
		setJMenuBar(mainBar);
		mainBar.add(file);
		mainBar.add(otherCalc);
		file.add(exit);
		//****************************************************************
		//Set constraints...
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(myMessage, c);
		GridBagConstraints p = new GridBagConstraints();
		p.fill = GridBagConstraints.HORIZONTAL;
		p.gridx = 0;
		p.gridy = 1;
		add(ogMessage, p);
		GridBagConstraints q = new GridBagConstraints();
		q.gridx = 1;
		q.gridy = 1;
		add(getOG, q);
		//add(pressOG);
		GridBagConstraints r = new GridBagConstraints();
		r.fill = GridBagConstraints.HORIZONTAL;
		r.gridx = 0;
		r.gridy = 2;
		add(fgMessage, r);
		GridBagConstraints a = new GridBagConstraints();
		a.gridx = 1;
		a.gridy = 2;
		add(getFG, a);
		GridBagConstraints x = new GridBagConstraints();
		x.gridx = 0;
		x.gridy = 3;
		add(abvMessage, x);
		GridBagConstraints y = new GridBagConstraints();
		y.gridx = 1;
		y.gridy = 3;
		add(showABV, y);
		GridBagConstraints b = new GridBagConstraints();
		b.gridx = 1;
		b.gridy = 4;
		add(pressSubmit, b);
		
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
