//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;

import com.aleculator.CalcMethods;

import java.awt.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class AleFrame extends JFrame implements ActionListener {
	
	CardLayout xCards = new CardLayout();
	Container khan = getContentPane();
	JPanel panelZero = new JPanel();
	JPanel panelOne = new JPanel();
	JPanel panelTwo = new JPanel();
	final int WIDTH = 550;
	final int HEIGHT = 550;
	//****************************************************************
	ImageIcon mug = new ImageIcon("beerMug.png");
	//****************************************************************
	//Initial Greeting screen...
	JLabel myMessage = new JLabel("<html><h2>Welcome to AleCulator!</h2><br></html>");
	JLabel myOtherMessage = new JLabel("<html><p>Here you will find an ABV calculator as well as other helpful brewing calculations.</p><br></html>");
	JLabel instruct = new JLabel("<html><p><b>Make a selection from the menu to begin...</b></p><br></html>");
	JLabel spacerX = new JLabel("<html><br></html>");
	//Initial ABV input screen...
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
	JButton myRefresh = new JButton("Refresh!");
	//****************************************************************
	//ABV calculation input...
	JTextField getOG = new JTextField(10);
	JTextField getFG = new JTextField(10);
	JTextField showABV = new JTextField(10);
	//****************************************************************
	JButton pressOG = new JButton("Enter OG");
	JButton pressSubmit = new JButton("Calculate!");
	//****************************************************************
	JMenuBar mainBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu otherCalc = new JMenu("Calculators");
	JMenuItem about = new JMenuItem("About");
	JMenuItem exit = new JMenuItem("Leave - now!");
	JMenuItem otherCalcItems = new JMenuItem("Coming Soon!");
	JMenuItem tempConversion = new JMenuItem("Temperature Conversion");
	JMenuItem abvDo = new JMenuItem("Alcohol Content (ABV)");
				
	//****************************************************************
	
	public AleFrame()
	
	{
		
		super("AleCulator2");
		khan.setLayout(xCards);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		khan.setSize(WIDTH, HEIGHT);
		add("panelZero", panelZero);
		panelZero.setSize(WIDTH, HEIGHT);
		this.setSize(WIDTH, HEIGHT);
		
		//****************************************************************
		
		//Generating initial greeting screen...
		panelZero.add(myMessage);
		panelZero.add(myOtherMessage);
		panelZero.add(instruct);
				
		//****************************************************************
		
		setVisible(true);
		
		//****************************************************************
		
		myMessage.setFont(new Font("Courier New", Font.ITALIC, 20));
				
		//****************************************************************
		
		//Set up Menu Bar...
		setJMenuBar(mainBar);
		//mainBar.setBackground(Color.BLACK);
		//mainBar.setForeground(Color.WHITE);
		mainBar.add(file);
		mainBar.add(otherCalc);
		file.add(about);
		file.add(exit);
		otherCalc.add(abvDo);
		otherCalc.add(tempConversion);
		otherCalc.add(otherCalcItems);
				
		//****************************************************************
		
		setIconImage(mug.getImage());
		pressSubmit.addActionListener(this);
						
		//****************************************************************
		
		//Set menu action listeners...
		tempConversion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent javaLayoutManagersSuck){
				
				khan.setLayout(xCards);
				add("panelTwo", panelTwo);
				panelTwo.setSize(WIDTH, HEIGHT);
				panelTwo.add(tempConversionMessage);
				panelTwo.add(spacerX);
				panelTwo.add(askDegreesC);
				panelTwo.add(degreesC);
				panelTwo.add(spacerX);
				panelTwo.add(askDegreesF);
				panelTwo.add(degreesF);
				panelTwo.add(submit);
				panelTwo.add(myRefresh);
				submit.addActionListener(this);
				panelTwo.getRootPane().setDefaultButton(submit);
				
				//*********************************************************
				//I know someone is going to give me shit about nesting action listeners...but hey! It works!!!
				myRefresh.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent refreshEvent) {
						degreesC.setText("");;
						degreesF.setText("");
			        }
				});
				
				//*********************************************************
				//Actually show the panel...
				panelTwo.setVisible(true);
				//Remove top layer...makes it seem instant
				khan.remove(panelZero);
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
		
		abvDo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent abvDoEvent){
				
				khan.setLayout(xCards);
				add("panelOne", panelOne);
				panelOne.setSize(WIDTH, HEIGHT);
				panelOne.add(ogMessage);
				panelOne.add(getOG);
				panelOne.add(fgMessage);
				panelOne.add(getFG);
				panelOne.add(abvMessage);
				panelOne.add(showABV);
				panelOne.add(pressSubmit);
				panelOne.add(myRefresh);
				panelOne.getRootPane().setDefaultButton(pressSubmit);
				
				//*********************************************************
				//I know someone is going to give me shit about nesting action listeners...but hey! It works!!!
				//I was able to reuse the object...
				myRefresh.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent refreshEvent) {
						getOG.setText("");
						getFG.setText("");
						showABV.setText("");
			        }
				});
				
				//Actually show the panel...
				panelTwo.setVisible(true);
				//Remove top layer...makes it seem instant...removing the other 2 panels at the same time to allow for choosing whichever method you want first...
				khan.remove(panelZero);
				khan.remove(panelTwo);
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
