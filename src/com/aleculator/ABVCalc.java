//Rudimentary Alcohol By Volume (ABV) calculator for Ale and other beers

package com.aleculator;

import javax.swing.JFrame;

import com.aleculator.aframe.AleFrame;


public class ABVCalc {
	
	//Declare variables...
	String abvOut = "";
	double og = 0.00;
	double fg = 0.00;
	
	public String getAbvOut() {
		return abvOut;
	}

	public void setAbvOut(String abvOut) {
		this.abvOut = abvOut;
	}

	public double getOg() {
		return og;
	}

	public void setOg(double og) {
		this.og = og;
	}

	public double getFg() {
		return fg;
	}

	public void setFg(double fg) {
		this.fg = fg;
	}

	//Driver...
	public static void main(String[] args) {
		
		//Call frame to build UI
		JFrame.setDefaultLookAndFeelDecorated(true);
		AleFrame frame = new AleFrame();
		frame.setVisible(true);

		//Set variables...
		
		//Display Alcohol by Volume...
		//System.out.println(abvOut);
	}

}
