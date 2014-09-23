/*
 *********************************************************************************************
LEARN TO TYPE - Beginner
By: Andy Kwok
 *********************************************************************************************
 */

// The "Beginner" class.
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Beginner implements MouseListener, KeyListener
{
	JFrame beginnerFrame;  
	JLabel letterLabel, keyboardLabel, markerLabel, goLabel, correctLabel;
	JPanel beginnerPanel;
	JButton startButton, helpButton, exitButton;
	JLayeredPane layerPane = new JLayeredPane (); 	
	ImageIcon letterImage, keyboardImage, markerImage;
	RandomChar l; 
	char ch, input;
	int total, correct; 
	double percent;
	int markerX, markerY; 
	Action timesup;
	Timer t;
	Font f = new Font ("Calibri", Font.BOLD, 32);

	//Gets Input
	private class MyDispatcher implements KeyEventDispatcher
	{
		@ Override
		public boolean dispatchKeyEvent (KeyEvent e)
		{
			if (e.getID () == KeyEvent.KEY_TYPED)//senses if a key is pressed
			{

				correctLabel.setVisible (false);//hides previous correct label

				//sets input
				if (e.getKeyChar () == 'a')
					input = 'a';
				else if (e.getKeyChar () == 'b')
					input = 'b';
				else if (e.getKeyChar () == 'c')
					input = 'c';
				else if (e.getKeyChar () == 'd')
					input = 'd';
				else if (e.getKeyChar () == 'e')
					input = 'e';
				else if (e.getKeyChar () == 'f')
					input = 'f';
				else if (e.getKeyChar () == 'g')
					input = 'g';
				else if (e.getKeyChar () == 'h')
					input = 'h';
				else if (e.getKeyChar () == 'i')
					input = 'i';
				else if (e.getKeyChar () == 'j')
					input = 'j';
				else if (e.getKeyChar () == 'k')
					input = 'k';
				else if (e.getKeyChar () == 'l')
					input = 'l';
				else if (e.getKeyChar () == 'm')
					input = 'm';
				else if (e.getKeyChar () == 'n')
					input = 'n';
				else if (e.getKeyChar () == 'o')
					input = 'o';
				else if (e.getKeyChar () == 'p')
					input = 'p';
				else if (e.getKeyChar () == 'q')
					input = 'q';
				else if (e.getKeyChar () == 'r')
					input = 'r';
				else if (e.getKeyChar () == 's')
					input = 's';
				else if (e.getKeyChar () == 't')
					input = 't';
				else if (e.getKeyChar () == 'u')
					input = 'u';
				else if (e.getKeyChar () == 'v')
					input = 'v';
				else if (e.getKeyChar () == 'w')
					input = 'w';
				else if (e.getKeyChar () == 'x')
					input = 'x';
				else if (e.getKeyChar () == 'y')
					input = 'y';
				else if (e.getKeyChar () == 'z')				
					input = 'z';

				//Compares the input with letter
				if (input == ch)
				{
					correct++; //correct counter

					//Correct Label on the side
					correctLabel = new JLabel ("Correct!");//sets label
					correctLabel.setFont (f);//sets font
					correctLabel.setBounds (747, 35 , 500, 300);//sets position
					beginnerPanel.add (correctLabel); //display correct on right side
					correctLabel.setVisible (true);//displays label
				}		

				total++;//counter

				l = new RandomChar ();
				ch = l.randomchar ();//select random char
				//Selects images to display 
				if (ch == 'a')
				{
					letterImage = new ImageIcon (this.getClass().getResource("a.png"));//
					markerX = 148;//x position of marker
					markerY = 467;//y position of marker
				}
				else if (ch == 'b')
				{
					letterImage = new ImageIcon (this.getClass().getResource("b.png"));
					markerX = 377;
					markerY = 510;
				}
				else if (ch == 'c')
				{
					letterImage = new ImageIcon (this.getClass().getResource("c.png"));
					markerX = 275;
					markerY = 510;
				}
				else if (ch == 'd')
				{
					letterImage = new ImageIcon (this.getClass().getResource("d.png"));
					markerX = 250;
					markerY = 467;
				}
				else if (ch == 'e')
				{
					letterImage = new ImageIcon (this.getClass().getResource("e.png"));
					markerX = 236;
					markerY = 424;
				}
				else if (ch == 'f')
				{
					letterImage = new ImageIcon (this.getClass().getResource("f.png"));
					markerX = 301;
					markerY = 467;
				}
				else if (ch == 'g')
				{
					letterImage = new ImageIcon (this.getClass().getResource("g.png"));
					markerX = 352;
					markerY = 467;
				}
				else if (ch == 'h')
				{
					letterImage = new ImageIcon (this.getClass().getResource("h.png"));
					markerX = 403;
					markerY = 467;
				}
				else if (ch == 'i')
				{
					letterImage = new ImageIcon (this.getClass().getResource("i.png"));
					markerX = 491;
					markerY = 424;
				}
				else if (ch == 'j')
				{
					letterImage = new ImageIcon (this.getClass().getResource("j.png"));
					markerX = 454;
					markerY = 467;
				}
				else if (ch == 'k')
				{
					letterImage = new ImageIcon (this.getClass().getResource("k.png"));
					markerX = 505;
					markerY = 467;
				}
				else if (ch == 'l')
				{
					letterImage = new ImageIcon (this.getClass().getResource("l.png"));
					markerX = 556;
					markerY = 467;
				}
				else if (ch == 'm')
				{
					letterImage = new ImageIcon (this.getClass().getResource("m.png"));
					markerX = 479;
					markerY = 510;
				}
				else if (ch == 'n')
				{
					letterImage = new ImageIcon (this.getClass().getResource("n.png"));
					markerX = 428;
					markerY = 510;
				}
				else if (ch == 'o')
				{
					letterImage = new ImageIcon (this.getClass().getResource("o.png"));
					markerX = 593;
					markerY = 424;
				}				
				else if (ch == 'p')
				{
					letterImage = new ImageIcon (this.getClass().getResource("p.png"));
					markerX = 542;
					markerY = 424;
				}	
				else if (ch == 'q')
				{
					letterImage = new ImageIcon (this.getClass().getResource("q.png"));
					markerX = 134;
					markerY = 424;
				}
				else if (ch == 'r')
				{
					letterImage = new ImageIcon (this.getClass().getResource("r.png"));
					markerX = 287;
					markerY = 424;
				}
				else if (ch == 's')
				{
					letterImage = new ImageIcon (this.getClass().getResource("s.png"));
					markerX = 199;
					markerY = 467;
				}
				else if (ch == 't')
				{
					letterImage = new ImageIcon (this.getClass().getResource("t.png")); 
					markerX = 338;
					markerY = 424;
				}
				else if (ch == 'u')
				{
					letterImage = new ImageIcon (this.getClass().getResource("u.png"));
					markerX = 440;
					markerY = 424;
				}
				else if (ch == 'v')
				{
					letterImage = new ImageIcon (this.getClass().getResource("v.png"));
					markerX = 326;
					markerY = 510;
				}
				else if (ch == 'w')
				{
					letterImage = new ImageIcon (this.getClass().getResource("w.png"));
					markerX = 185;
					markerY = 424;
				}
				else if (ch == 'x')
				{
					letterImage = new ImageIcon (this.getClass().getResource("x.png"));
					markerX = 224;
					markerY = 510;
				}
				else if (ch == 'y')
				{
					letterImage = new ImageIcon (this.getClass().getResource("y.png"));
					markerX = 389;
					markerY = 424;
				}
				else if (ch == 'z')
				{
					letterImage = new ImageIcon (this.getClass().getResource("z.png"));
					markerX = 173;
					markerY = 510;
				}

				markerLabel.setVisible(false);//hides previous marker
				letterLabel.setVisible(false);//hides previous letter

				markerLabel.setBounds (markerX,markerY, 66, 66); 
				layerPane.add (markerLabel, new Integer(1), 0);//display over keyboard
				markerLabel.setVisible(true);//display new marker

				letterLabel = new JLabel (letterImage);//sets new letter
				letterLabel.setBounds (325, 15, 378, 352);
				beginnerPanel.add (letterLabel);
				letterLabel.setVisible(true);//display new letter

				SwingUtilities.updateComponentTreeUI(beginnerFrame); //Updates Frame in order to display new image
			}
			return false;
		}
	}

	public static void main (String[] args)
	{
		new Beginner ();
	} // main method


	public Beginner ()
	{
		beginnerFrame = new JFrame ();//the frame  
		beginnerFrame.setSize (900, 650);
		beginnerFrame.setLocation (100, 100);
		beginnerFrame.setTitle ("Learn to Type! Beginner");
		beginnerFrame.setResizable (false);

		beginnerPanel = new JPanel (); //main panel, fits whole frame
		beginnerPanel.setLayout (null); 
		beginnerFrame.add (beginnerPanel);

		layerPane.setBounds(0,0, 900,650); //layeredPane, fits whole frame, for keyboard and marker
		beginnerPanel.add (layerPane); 

		letterImage = new ImageIcon (this.getClass().getResource("blank.png"));
		letterLabel = new JLabel (letterImage);//displays starting image
		letterLabel.setBounds (325, 15, 378, 352);
		beginnerPanel.add (letterLabel);

		keyboardImage = new ImageIcon (this.getClass().getResource("Keyboard Image.png"));//keyboard
		keyboardLabel = new JLabel (keyboardImage);
		keyboardLabel.setBounds (0,350, 900, 300);
		layerPane.add(keyboardLabel, new Integer(0), 0);//add keyboard to bottom of layeredPane

		markerImage = new ImageIcon (this.getClass().getResource("Marker.png"));//marker image
		markerLabel = new JLabel (markerImage);//uses markerImage and sets label

		goLabel = new JLabel ("GO!");//go label when start is pressed
		goLabel.setFont (f);
		goLabel.setBounds(255,73,100,100);
		beginnerPanel.add (goLabel);
		goLabel.setVisible(false);//invisible at first

		startButton = new JButton ("Start");//start button
		startButton.setBounds (80,100, 160, 35); 
		beginnerPanel.add(startButton);
		startButton.addMouseListener (this);

		helpButton = new JButton ("Help");//help button
		helpButton.setBounds (80,175, 160, 35);  
		beginnerPanel.add(helpButton);
		helpButton.addMouseListener (this);

		exitButton = new JButton ("Close (Back to Menu)"); //exit button
		exitButton.setBounds (80,250, 160, 35);  
		beginnerPanel.add (exitButton);
		exitButton.addMouseListener (this);

		correctLabel = new JLabel ("");//declare correct label

		timesup = new AbstractAction() //what happens when time is up
		{
			public void actionPerformed(ActionEvent e)
			{
				t.stop();
				goLabel.setVisible(false);
				if (total == 0)
					JOptionPane.showMessageDialog(null, "Time Is Up!\nYou did not press any keys. The objective is to press the displayed letter on your keyboard.\nPress Start to try again.");
				else {
					percent = 100 * correct/total; 				
					JOptionPane.showMessageDialog(null, "Time Is Up!\nTotal Keys Pressed: " + total + "\nCorrect Keys Pressed: " + correct + "\nAccuracy: " + percent + "%\nPress Start to Play Again");	
				}
			}
		};

		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager ();
		manager.addKeyEventDispatcher (new MyDispatcher ());//for input

		beginnerFrame.setVisible (true);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource ().equals (startButton))//starts time, resets counter, displays GO!
		{
			t = new Timer(30000, timesup); //declares new Timer
			t.start();
			total = 0;
			correct = 0; 			
			goLabel.setVisible(true);//show GO label 

		}

		if (e.getSource ().equals (helpButton))//shows help menu
		{
			JOptionPane.showMessageDialog(null, "Press the corresponding key on your keyboard with the letter displayed.\nFamiliarize yourself with the keyboard.\n\nFor a challenge, press the Start button.\nThis begins a 30 second timer. In the 30 seconds, type as many letters as possible.\nThe word GO! will be displayed indicating timing is ticking.\nBe careful! Your accuracy will be recorded. GOOD LUCK!");
		}

		if (e.getSource ().equals (exitButton)) //Back to Main Menu (Close Window)
		{
			beginnerFrame.dispose (); //exits window
		}
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
} // Beginner class


