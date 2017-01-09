package com.aleculator;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalcMethods {

	public double getOG() {
		
		String textOG = JOptionPane.showInputDialog(null, "Enter the OG:", "Original Specific Gravity", JOptionPane.QUESTION_MESSAGE);
		double myOG = Double.parseDouble(textOG);
		return myOG;
		
	}
	
	public double getFG() {
		
		String textFG = JOptionPane.showInputDialog(null, "Enter the FG:", "Final Specific Gravity", JOptionPane.QUESTION_MESSAGE);
		double myFG = Double.parseDouble(textFG);
		return myFG;
		
	}
	
	public String getABV(double og, double fg) {
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		final double BEER_CONSTANT = 131.25;
		double abv = 0.00;
		String textABV = "";
		
		abv = ((og - fg) * BEER_CONSTANT);
		textABV = myDF.format(abv);
		
		return textABV;
	}
	
}
