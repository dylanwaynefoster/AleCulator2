package com.aleculator;

import java.text.DecimalFormat;

//import javax.swing.JOptionPane;

public class CalcMethods {

	public double getOG(String textOG) {
		
		double myOG = Double.parseDouble(textOG);
		return myOG;
		
	}
	
	public double getFG(String textFG) {
				
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
	
	//*************************************************************
	//Temperature Conversion Methods
	
	public double getC(String textC) {
		
		double myC = Double.parseDouble(textC);
		return myC;
		
	}
	
	public double getF(String textF) {
		
		double myF = Double.parseDouble(textF);
		return myF;
		
	}
	
	public String tempConversionCalcCToF(double C){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double F = 0;
		String textF = "";
		F = ((C * 1.8) + 32);
		textF = myDF.format(F);
		return textF;
						
	}
	
public String tempConversionCalc_FToC(double F){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double C = 0;
		String textC = "";
		C = ((F - 32) * .5556);
		textC = myDF.format(C);
		return textC;
						
	}
}
