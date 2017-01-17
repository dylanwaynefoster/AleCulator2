//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;

import com.aleculator.CalcMethods;

import java.awt.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class AleFrame extends JFrame implements ActionListener {
	
	private CardLayout xCards = new CardLayout();
	private Container khan = getContentPane();
	private JPanel panelOne = new JPanel();
	private JPanel panelTwo = new JPanel();
	final int WIDTH = 550;
	final int HEIGHT = 550;
	//****************************************************************
	ImageIcon mug = new ImageIcon("beerMug.png");
	//****************************************************************
	//Initial ABV calculation input...
	JLabel myMessage = new JLabel("<html>Welcome to AleCulator!<br></html>");
	JLabel spacer = new JLabel("                                             ");
	JLabel spacerX = new JLabel("<html><br></html>");
	JLabel spacerX2 = new JLabel("<html><br></html>");
	JLabel ogMessage = new JLabel("Enter the Original Specific Gravity (ex. 1.056):");
	JLabel fgMessage = new JLabel("Enter the Final Specific Gravity (ex. 1.018):");
	JLabel abvMessage = new JLabel("The Alcohol by Volume percentage of you beer is: ");
	//
	//****************************************************************
	//Additional calculation input...
	JLabel otherCalcMessage = new JLabel("<html>Stay Tuned For Other Helpful Homebrewing Calculations!<br>Coming Soon!<br></html>");
	JLabel tempConversionMessage = new JLabel("<html>Enter the temperature you know into the corresponding box and press Calculate!<br>The other box will give you your result.<br></html>");
	JLabel askDegreesC = new JLabel("Degrees Celcius: ");
	JTextField degreesC = new JTextField(10);
	JButton submit = new JButton("Calculate!");
	JLabel askDegreesF = new JLabel("Degrees Farenheit: ");
	JTextField degreesF = new JTextField(10);
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
	JMenu otherCalc = new JMenu("Other Helpful Calculations");
	JMenuItem about = new JMenuItem("About");
	JMenuItem exit = new JMenuItem("Leave this place - now!");
	JMenuItem otherCalcItems = new JMenuItem("Coming Soon!");
	JMenuItem tempConversion = new JMenuItem("Temperature Conversion");
				
	//****************************************************************
	public AleFrame()
	
	{
		
		super("AleCulator2");
		khan.setLayout(xCards);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		khan.setSize(WIDTH, HEIGHT);
		add("panelOne", panelOne);
		panelOne.setSize(WIDTH, HEIGHT);
		this.setSize(WIDTH, HEIGHT);
		//****************************************************************
		panelOne.add(myMessage);
		panelOne.add(spacer);
		panelOne.add(ogMessage);
		panelOne.add(getOG);
		panelOne.add(fgMessage);
		panelOne.add(getFG);
		panelOne.add(abvMessage);
		panelOne.add(showABV);
		panelOne.add(pressSubmit);
		panelOne.getRootPane().setDefaultButton(pressSubmit);
		//****************************************************************
		setVisible(true);
		//****************************************************************
		
		//this.getContentPane().setBackground(Color.BLACK);
		//setLayout(new FlowLayout());
		
		myMessage.setFont(new Font("Courier New", Font.ITALIC, 20));
		/*
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
		//setLayout(new GridBagLayout());
		
		//****************************************************************
		//Set up Menu Bar...
		setJMenuBar(mainBar);
		mainBar.add(file);
		mainBar.add(otherCalc);
		file.add(about);
		file.add(exit);
		otherCalc.add(tempConversion);
		otherCalc.add(otherCalcItems);
		/*
		//****************************************************************
		//Set constraints...
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 1;
		c.weightx = 1;
		c.gridx = 0;
		c.gridy = 0;
		add(myMessage, c);
		GridBagConstraints p = new GridBagConstraints();
		p.fill = GridBagConstraints.HORIZONTAL;
		
		p.gridx = 0;
		p.gridy = 1;
		add(ogMessage, p);
		GridBagConstraints q = new GridBagConstraints();
		q.fill = GridBagConstraints.HORIZONTAL;
		
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
		
*/		setIconImage(mug.getImage());
		pressSubmit.addActionListener(this);
		
		
		//****************************************************************
		/*otherCalcItems.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent javaLayoutManagersSuck){
				
				khan.setLayout(xCards);
				add("panelTwo", panelTwo);
				panelTwo.setSize(WIDTH, HEIGHT);
				panelTwo.add(otherCalcMessage);
				panelTwo.setVisible(true);
				khan.remove(panelOne);
				;				
			}
		});*/
		
		tempConversion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent javaLayoutManagersSuck){
				
				khan.setLayout(xCards);
				add("panelTwo", panelTwo);
				panelTwo.setSize(WIDTH, HEIGHT);
				panelTwo.add(tempConversionMessage);
				panelTwo.add(spacerX);
				panelTwo.add(askDegreesC);
				panelTwo.add(degreesC);
				panelTwo.add(spacerX2);
				panelTwo.add(askDegreesF);
				panelTwo.add(degreesF);
				panelTwo.add(submit);
								//Actually show the panel...
				panelTwo.setVisible(true);
				//Remove top layer...makes it seem instant
				khan.remove(panelOne);
				
				;				
			}
		});
		
		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent cToF_Event) {
				
				String c = degreesC.getText();
				String f = degreesF.getText();
				CalcMethods showMe = new CalcMethods();
				if (f.isEmpty())
				{
					double cNum = showMe.getC(c);
					f = showMe.tempConversionCalcCToF(cNum);
					degreesF.setText(f);
				}
				else
				{
					double fNum = showMe.getF(f);
					c = showMe.tempConversionCalc_FToC(fNum);
					degreesC.setText(c);
				}

			}

		});
		//Set menu action listeners...
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent exitEvent) {
	            System.exit(0);
	        }
		});

		otherCalcItems.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent otherCalcEvent){
				JOptionPane.showMessageDialog(null, "Stay Tuned For Other Helpful Homebrewing Calculations!\n", "Coming Soon!", JOptionPane.INFORMATION_MESSAGE);
				

			}
		});
				
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent aboutEvent){
				JOptionPane.showMessageDialog(null, "Copyright (c) 2017 Dylan Wayne Foster\nHi! I'm Dylan. I live and work in North Carolina.\nI am a 2011 Summa Cum Laude Graduate of Belmont Abbey College in beautiful Belmont, NC.\nThanks for checking out my work!\n", "Your Friendly Neighborhood Java Programmer", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
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
