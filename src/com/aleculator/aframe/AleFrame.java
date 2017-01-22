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
	JPanel panelThree = new JPanel();
	JPanel panelFour = new JPanel();
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
	//JLabel otherCalcMessage = new JLabel("Stay Tuned For Other Helpful Homebrewing Calculations!\nComing Soon!");
	JLabel tempConversionMessage = new JLabel("<html>Enter the temperature you know into the corresponding box and press Calculate!<br>The other box will give you your result.<br></html>");
	JLabel askDegreesC = new JLabel("Degrees Celcius: ");
	JTextField degreesC = new JTextField(10);
	JButton submit = new JButton("Calculate!");
	JLabel askDegreesF = new JLabel("Degrees Farenheit: ");
	JTextField degreesF = new JTextField(10);
	JButton myRefresh = new JButton("Refresh!");
	//****************************************************************
	//Dry Measure Input...
	JLabel ounceGramMess = new JLabel("<html>Enter the measurement you know into the corresponding box and press Calculate!<br>The other box will give you your result.<br></html>");
	JLabel dryOunces = new JLabel("Dry Ounces: ");
	JTextField getDryOz = new JTextField(10);
	JLabel grams = new JLabel("Grams: ");
	JTextField getGrams = new JTextField(10);
	JButton weightSubmit = new JButton("Calculate!");
	//****************************************************************
	//Liquid Measure Input...
	JLabel gallonLiterMess = new JLabel("<html>Enter the measurement you know into the corresponding box and press Calculate!<br>The other box will give you your result.<br><br></html>");
	JLabel gallons = new JLabel("      Gallons: ");
	JTextField getGallons = new JTextField(10);
	JLabel liters = new JLabel("Liters: ");
	JTextField getLiters = new JTextField(10);
	JButton wetSubmit = new JButton("Calculate!");
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
	JMenuItem about = new JMenuItem("About Me");
	JMenuItem exit = new JMenuItem("Leave - now!");
	JMenuItem otherCalcItems = new JMenuItem("Coming Soon!");
	JMenuItem tempConversion = new JMenuItem("Temperature Conversion");
	JMenuItem abvDo = new JMenuItem("Alcohol Content (ABV)");
	JMenu dryMeas = new JMenu("Dry Measures");
	JMenuItem oz2Grams = new JMenuItem("Ounces/Grams");
	JMenu liqMeas = new JMenu("Liquid Measures");
	JMenuItem gal2Lit = new JMenuItem("Gallons/Liters");
				
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
		otherCalc.add(dryMeas);
		dryMeas.add(oz2Grams);
		otherCalc.add(liqMeas);
		liqMeas.add(gal2Lit);
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
				//Remove top layer...makes it seem instant
				khan.remove(panelZero);
				khan.remove(panelOne);
				khan.remove(panelThree);
				khan.remove(panelFour);
				
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
				JOptionPane.showMessageDialog(null, "Stay Tuned For Other Helpful Homebrewing Calculations!\nBittering Units\nBoth IBU and HBU", "Coming Soon!", JOptionPane.INFORMATION_MESSAGE);
				

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

				//Remove top layer...makes it seem instant...removing the other panels at the same time to allow for choosing whichever method you want first...
				khan.remove(panelZero);
				khan.remove(panelTwo);
				khan.remove(panelThree);
				khan.remove(panelFour);
			}
		});
		
		oz2Grams.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent abvDoEvent){
				
				khan.setLayout(xCards);
				add("panelThree", panelThree);
				panelThree.setSize(WIDTH, HEIGHT);
				panelThree.add(ounceGramMess);
				panelThree.add(dryOunces);
				panelThree.add(getDryOz);
				panelThree.add(grams);
				panelThree.add(getGrams);
				panelThree.add(weightSubmit);
				panelThree.add(myRefresh);
				panelThree.getRootPane().setDefaultButton(weightSubmit);
				
				//*********************************************************
				//I know someone is going to give me shit about nesting action listeners...but hey! It works!!!
				//I was able to reuse the object...
				myRefresh.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent refreshEvent) {
						getDryOz.setText("");
						getGrams.setText("");
			        }
				});

				//Remove top layer...makes it seem instant...removing the other panels at the same time to allow for choosing whichever method you want first...
				khan.remove(panelZero);
				khan.remove(panelOne);
				khan.remove(panelTwo);
				khan.remove(panelFour);
			}
		});

		weightSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent weightConversion_Event) {
				
				String ounces = getDryOz.getText();
				String grams = getGrams.getText();
				CalcMethods showMe = new CalcMethods();
				if (grams.isEmpty())
				{
					double ounceNum = showMe.getDryOz(ounces);
					grams = showMe.weightConversion_Oz_To_Grams(ounceNum);
					getGrams.setText(grams);
				}
				else
				{
					double gramNum = showMe.getGrams(grams);
					ounces = showMe.weightConversion_Grams_To_Ounces(gramNum);
					getDryOz.setText(ounces);
				}

			}

		});

		
		gal2Lit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent abvDoEvent){
				
				khan.setLayout(xCards);
				add("panelFour", panelFour);
				panelFour.setSize(WIDTH, HEIGHT);
				panelFour.add(gallonLiterMess);
				panelFour.add(gallons);
				panelFour.add(getGallons);
				panelFour.add(liters);
				panelFour.add(getLiters);
				panelFour.add(wetSubmit);
				panelFour.add(myRefresh);
				panelFour.getRootPane().setDefaultButton(wetSubmit);
				
				//*********************************************************
				//I know someone is going to give me shit about nesting action listeners...but hey! It works!!!
				//I was able to reuse the object...
				myRefresh.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent refreshEvent) {
						getGallons.setText("");
						getLiters.setText("");
			        }
				});

				//Remove top layer...makes it seem instant...removing the other panels at the same time to allow for choosing whichever method you want first...
				khan.remove(panelZero);
				khan.remove(panelOne);
				khan.remove(panelTwo);
				khan.remove(panelThree);
			}
		});
		
		wetSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent wetWeightConversion_Event) {
				
				String gallons = getGallons.getText();
				String liters = getLiters.getText();
				CalcMethods showMe = new CalcMethods();
				if (liters.isEmpty())
				{
					double gallonNum = showMe.getGallons(gallons);
					liters = showMe.liquidConvGallonsToLiters(gallonNum);
					getLiters.setText(liters);
				}
				else
				{
					double literNum = showMe.getLit(liters);
					gallons = showMe.liquidConvLitersToGallons(literNum);
					getGallons.setText(gallons);
				}

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
