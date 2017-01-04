//Creating the JFrame I want for my user interface...

package com.aleculator.aframe;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class AleFrame extends JFrame {
	
	final int WIDTH = 550;
	final int HEIGHT = 550;
	
	public AleFrame()
	
	{
		
		super("AleCulator2");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(new FlowLayout());
		JLabel myMessage = new JLabel("Welcome to AleCulator!");
		myMessage.setFont(new Font("Courier New", Font.ITALIC, 16));
		myMessage.setBackground(Color.BLACK);
		myMessage.setOpaque(true);
		add(myMessage);
		
	}
}
