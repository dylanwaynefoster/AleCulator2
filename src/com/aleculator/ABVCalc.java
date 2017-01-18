//Rudimentary Alcohol By Volume (ABV) calculator for Ale and other beers

package com.aleculator;

import javax.swing.JFrame;

import com.aleculator.aframe.AleFrame;

public class ABVCalc {
	
	//Driver...
	public static void main(String[] args) {
		
		//Call frame to build UI
		JFrame.setDefaultLookAndFeelDecorated(true);
		AleFrame frame = new AleFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

}
