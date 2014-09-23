/*
*********************************************************************************************
LEARN TO TYPE - Main Menu
By: Andy Kwok
*********************************************************************************************
*/

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Font;

public class MainMenu implements MouseListener
{
	public static MainMenu window;
	JButton instructionButton, beginnerButton, advancedButton, exitButton, homeButton;
	JPanel mainPanel, titlePanel, instructionPanel, instructiondiagramPanel;
	JFrame myFrame;
	JLabel welcomeLabel, nameLabel, diagramLabel, instructionsLabel, instructionLabel;
	JTextField letterTextField;
	Font f;
	Advanced a;
	Beginner b;
	
	public MainMenu ()
	{
		//Main Window (Frame)
		myFrame = new JFrame ();
		myFrame.setSize (900, 650);
		myFrame.setLocation (100, 100);
		myFrame.setTitle ("Learn to Type!");
		myFrame.setResizable (false);

		// Main Menu Panel
		mainPanel = new JPanel (); //main panel (full screen)
		mainPanel.setLayout (new BorderLayout ());
		myFrame.getContentPane ().add (mainPanel, BorderLayout.CENTER);

		//Welcome Title
		titlePanel = new JPanel ();
		titlePanel.setLayout (new BoxLayout (titlePanel, BoxLayout.X_AXIS));//sets top section to boxlayout
		mainPanel.add (titlePanel, BorderLayout.NORTH);
		
		f = new Font ("Calibri", Font.BOLD, 40);
		welcomeLabel = new JLabel ("   Welcome to  ");//welcome text
		welcomeLabel.setFont (f);
		titlePanel.add (welcomeLabel);
		
		nameLabel = new JLabel ("LEARN TO TYPE");//main title text
		f = new Font ("Calibri", Font.BOLD, 72);
		nameLabel.setFont (f);
		titlePanel.add (nameLabel);

		//Buttons
		ImageIcon instructionImage = new ImageIcon (this.getClass().getResource("InstructionsWText.png")); //Images on Buttons
		ImageIcon beginnerImage = new ImageIcon (this.getClass().getResource ("BeginnerWText.png"));
		ImageIcon advancedImage = new ImageIcon (this.getClass().getResource ("AdvancedWText.png"));

		instructionButton = new JButton (instructionImage);
		mainPanel.add (instructionButton, BorderLayout.WEST);
		instructionButton.addMouseListener (this);

		beginnerButton = new JButton (beginnerImage);
		mainPanel.add (beginnerButton, BorderLayout.CENTER);
		beginnerButton.addMouseListener (this);

		advancedButton = new JButton (advancedImage);
		mainPanel.add (advancedButton, BorderLayout.EAST);
		advancedButton.addMouseListener (this);

		exitButton = new JButton ("Exit");
		mainPanel.add (exitButton, BorderLayout.SOUTH);
		exitButton.addMouseListener (this);

		//Instruction Page
		instructionPanel = new JPanel ();
		instructionPanel.setLayout (new BorderLayout ());

		f = new Font ("Calibri", Font.BOLD, 100);
		instructionLabel = new JLabel (" Instructions"); //Title
		instructionLabel.setFont (f);
		instructionPanel.add (instructionLabel, BorderLayout.NORTH);
		
		ImageIcon allInstructions = new ImageIcon (this.getClass().getResource ("Instructions.png"));//instructions image
		instructionsLabel  = new JLabel (allInstructions);
		instructionPanel.add (instructionsLabel , BorderLayout.CENTER);
		
		homeButton = new JButton ("Back to Main Menu");//return to main menu
		instructionPanel.add (homeButton, BorderLayout.SOUTH);
		homeButton.addMouseListener (this);
		
		//Make the whole window visible
		myFrame.setVisible (true); 
	}

	//Run
	public static void main (String[] args)
	{
		window = new MainMenu ();
	}

	public void mouseClicked (MouseEvent e)
	{ // use this method to respond to mouse clicks
		if (e.getSource ().equals (instructionButton)) //Main Menu Button
		{
			mainPanel.setVisible (false);//hides main menu
			myFrame.getContentPane ().add (instructionPanel);
			instructionPanel.setVisible (true);//displays instruction page
		}

		if (e.getSource ().equals (beginnerButton)) //Beginner Menu Button
		{
			window.b = new Beginner ();
		}

		if (e.getSource ().equals (advancedButton)) //Advanced Menu Button
		{
			window.a = new Advanced ();
		}

		if (e.getSource ().equals (homeButton)) //Instruction Panel Button
		{
			mainPanel.setVisible (true);
			instructionPanel.setVisible (false);
		}

		if (e.getSource ().equals (exitButton)) //Closes all windows
		{
			System.exit (0);
		}
	}




	public void mouseEntered (MouseEvent e)
	{
		// TODO Auto-generated method stub


	}




	public void mouseExited (MouseEvent arg0)
	{
		// TODO Auto-generated method stub


	}




	public void mousePressed (MouseEvent arg0)
	{
		// TODO Auto-generated method stub


	}




	public void mouseReleased (MouseEvent arg0)
	{
		// TODO Auto-generated method stub


	}

}


