package com.aleculator;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BeerCalc {

	public static void main(String[] args) {
		
		//declare variable for Original Specific Gravity as String for entry
		String text_og;
		//declare variable for Original Specific Gravity as a double
		double og;
		//declare variable for Final Specific Gravity as String for entry
		String text_fg;
		//declare variable for Final Specific Gravity as a double
		double fg;
		//set constant
		final double BEER_CONSTANT = 131.25;
		//declare variable for ABV
		double abv;
		
		//Accept entry for Original Specific Gravity
		text_og = JOptionPane.showInputDialog(null, "Enter the OG:", "Original Specific Gravity", JOptionPane.QUESTION_MESSAGE);
		og = Double.parseDouble(text_og);
		//Accept entry for Final Specific Gravity
		text_fg = JOptionPane.showInputDialog(null, "Enter the FG:", "Final Specific Gravity", JOptionPane.QUESTION_MESSAGE);
		fg = Double.parseDouble(text_fg);
		//Perform calculation for ABV
		abv = ((og - fg) * BEER_CONSTANT);
		DecimalFormat myDF = new DecimalFormat("#.##");
		String text_og_out = myDF.format(abv);
		
		JOptionPane.showMessageDialog(null, "The Alcohol Content of your beer is: " + text_og_out + "%", "Alcohol By Volume (ABV)", JOptionPane.INFORMATION_MESSAGE);
		
	}

}