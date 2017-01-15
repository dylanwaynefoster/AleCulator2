//Growing weary of varying layouts in Java... *sigh*...
//I copped some stuff from here...tried to make it my own...typed instead of copy/paste...
//https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/TabbedPaneDemoProject/src/components/TabbedPaneDemo.java

package com.aleculator.aframe;

import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class TryTabbedLayout extends JPanel {

	public TryTabbedLayout(){
		super(new GridLayout(1, 1));
		
		JTabbedPane myTabPane = new JTabbedPane();
		ImageIcon icon = new ImageIcon("beerMug.PNG");
		
		JComponent panel1 = makeMyPanel("Number One...");
		panel1.setBackground(Color.BLUE);
		myTabPane.addTab("This is a tab!", icon, panel1, "Not so much done...");
		myTabPane.setMnemonicAt(0, KeyEvent.VK_2);
		
		JComponent panel2 = makeMyPanel("Make it so!!!");
		panel2.setBackground(Color.GREEN);
		myTabPane.addTab("So is this!!!", icon, panel2, "Even more not done...");
		myTabPane.setMnemonicAt(0, KeyEvent.VK_2);
		
		//Add the tabbed pane...
		add(myTabPane);
		
		//For scrolling...
		myTabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	
	protected JComponent makeMyPanel(String x){
		JPanel aNewPanel = new JPanel(false);
		JLabel fillThis = new JLabel(x);
		fillThis.setHorizontalAlignment(JLabel.LEFT);
		aNewPanel.setLayout(new GridLayout(1, 1));
		aNewPanel.add(fillThis);
		this.setSize(550, 550);
		return aNewPanel;
	}
	
	private static void showItToMe(){
		//Create and set up the window...
        JFrame thisFrame = new JFrame("Tabs Please!!!");
        thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add content to the window...
        thisFrame.add(new TryTabbedLayout(), BorderLayout.CENTER);
        //Display...
        thisFrame.pack();
        thisFrame.setSize(550, 550);
        thisFrame.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		//Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        showItToMe();
            }
        });

	}

}
