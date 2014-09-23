/*
*********************************************************************************************
LEARN TO TYPE - Advanced
By: Andy Kwok
*********************************************************************************************
*/

// The "Advanced" class.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Advanced implements MouseListener, KeyListener
{
	JFrame advancedFrame;
	JPanel advancedPanel;
	JLabel wordLabel,correctLabel, attemptLabel;
	JButton exitButton, nextButton, helpButton;
	JTextField inputField;
	String input;
	Words wd;
	String w;
	Font f;
	int correct = 0;
	int total = 0;

	public static void main (String[] args)
	{
		new Advanced ();
	} // main method


	public Advanced ()
	{
		advancedFrame = new JFrame (); //window
		advancedFrame.setSize (900, 650);
		advancedFrame.setLocation (100, 100);
		advancedFrame.setTitle ("Learn to Type! Advanced");
		advancedFrame.setResizable (false);

		//Full Screen Panel
		advancedPanel = new JPanel (); //main panel
		advancedPanel.setBounds(0,0,900,650);
		advancedPanel.setLayout (null);
		advancedFrame.add (advancedPanel);

		wd = new Words ();
		w = wd.randomword ();//select random word
		//Displays Word
		f = new Font ("Calibri", Font.BOLD, 100);
		wordLabel = new JLabel (w);
		wordLabel.setFont (f);
		wordLabel.setBounds (350, 50 , 900, 300);
		advancedPanel.add (wordLabel); //display random word

		//Input Field
		inputField = new JTextField();
		inputField.setBounds(200, 400, 400, 45);
		advancedPanel.add(inputField);//display input text field

		//Displays # Correct 
		f = new Font ("Calibri", Font.BOLD, 30);
		correctLabel = new JLabel ("Number of Correct in Words in a Row: " + correct);
		correctLabel.setFont (f);
		correctLabel.setBounds (200, 420 , 550, 200);
		advancedPanel.add (correctLabel); //display random word
		
		//Next Button
		nextButton = new JButton ("Next Word");
		nextButton.setBounds(605, 401, 100, 43);
		advancedPanel.add (nextButton);
		nextButton.addMouseListener (this);

		//Help Button
		helpButton = new JButton ("Help");
		helpButton.setBounds(100, 130, 180, 43);
		advancedPanel.add (helpButton);
		helpButton.addMouseListener (this);
		
		//Exit Button
		exitButton = new JButton ("Close (Back to Menu)");
		exitButton.setBounds(100, 210, 180, 43);
		advancedPanel.add (exitButton);
		exitButton.addMouseListener (this);

		advancedFrame.setVisible (true); //makes everything visible
	} // Advanced class


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource ().equals (nextButton))
		{
			input = inputField.getText(); //convert data inside text field to variable

			if (input.equals(w))
			{
				correct++;
				correctLabel.setVisible(false);
				f = new Font ("Calibri", Font.BOLD, 30);
				correctLabel = new JLabel ("Number of Correct in Words in a Row: " + correct);
				correctLabel.setFont (f);
				correctLabel.setBounds (200, 420 , 550, 200);
				advancedPanel.add (correctLabel); 
				correctLabel.setVisible(true);

				wordLabel.setVisible(false); //hides previous word
				
				w = wd.randomword ();//select new word
				f = new Font ("Calibri", Font.BOLD, 100);
				wordLabel = new JLabel (w);
				wordLabel.setFont (f);
				wordLabel.setBounds (350, 50 , 900, 300);
				advancedPanel.add (wordLabel);
				
				wordLabel.setVisible(true);//display new word
				
				inputField.setText(""); //clear field
			}
			else
			{
				correct=0;
				correctLabel.setVisible(false);
				f = new Font ("Calibri", Font.BOLD, 30);
				correctLabel = new JLabel ("Number of Correct in Words in a Row: " + correct);
				correctLabel.setFont (f);
				correctLabel.setBounds (200, 420 , 550, 200);
				advancedPanel.add (correctLabel);
				correctLabel.setVisible(true);
				inputField.setText(""); //clear field
				JOptionPane.showMessageDialog(null, "Incorrect, please try again");//displays when incorrect
			}
				
		}
		if (e.getSource ().equals (helpButton)) //Help Pop Up
			JOptionPane.showMessageDialog(null, "The Advanced Mode is designed to help you practise typing full words.\nType the displayed word in the field. Click Next Word when finished.\nIf you are correct, a new word will be displayed.\n\nThe number of words you type without a mistake is shown at the bottom.");
		if (e.getSource ().equals (exitButton)) //Back to Main Menu (Close Window)
			advancedFrame.dispose (); //exits window

	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
