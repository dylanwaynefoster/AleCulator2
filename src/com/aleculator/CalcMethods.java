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

	//*************************************************************
	//Dry Weight Conversion Methods

	public double getDryOz(String textOz){
		
		double numOz = Double.parseDouble(textOz);
		return numOz;
		
	}
	
	public double getGrams(String textGrams){
		
		double numGrams = Double.parseDouble(textGrams);
		return numGrams;
		
	}
	
	public String weightConversion_Oz_To_Grams(double oz){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double g;
		String textG;
		g = (oz * 28.34952);
		textG = myDF.format(g);
		return textG;
		
	}
	
	public String weightConversion_Grams_To_Ounces(double grams){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double ounces;
		String textOunces;
		ounces = (grams/28.34952);
		textOunces = myDF.format(ounces);
		return textOunces;
		
	}
	
	public double getPounds(String thesePounds){
		
		double numPounds = Double.parseDouble(thesePounds);
		return numPounds;
		
	}
	
	public double getKilos(String theseKilograms){
		
		double numKilos = Double.parseDouble(theseKilograms);
		return numKilos;
		
	}
	
	public String weightConversion_Pounds_To_Kilograms(double pounds){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double kilos;
		String textKilos;
		kilos = (pounds * .45359237);
		textKilos = myDF.format(kilos);
		return textKilos;
		
	}
	
	public String weightConversion_Kilos_To_Pounds(double kilograms){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double pounds;
		String textPounds;
		pounds = (kilograms/.45359237);
		textPounds = myDF.format(pounds);
		return textPounds;
		
	}
	
	//*************************************************************
	//Liquid Weight Conversion Methods
	
	public double getGallons(String gal){
		
		double myGallons = Double.parseDouble(gal);
		return myGallons;
	}
	
	public double getLit(String lit){
		
		double myLiters = Double.parseDouble(lit);
		return myLiters;
	}
	
	public String liquidConvGallonsToLiters(double gallons){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double liters;
		String textLiters;
		liters = (gallons * 3.785411784);
		textLiters = myDF.format(liters);
		return textLiters;
		
	}

	public String liquidConvLitersToGallons(double liters){
		
		DecimalFormat myDF = new DecimalFormat("#.##");
		double gallons;
		String textGallons;
		gallons = (liters/3.785411784);
		textGallons = myDF.format(gallons);
		return textGallons;
		
	}
	
}
