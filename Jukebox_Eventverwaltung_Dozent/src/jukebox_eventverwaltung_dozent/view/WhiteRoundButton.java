package jukebox_eventverwaltung_dozent.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class WhiteRoundButton extends JButton{
	
	public WhiteRoundButton(String text) {
		super(text);
		setBackground(Color.WHITE);
		/*
		 * createCompoundBorder(outerBorder, innerBorder)
		 *  	- erstellt einen zusammengesetzen Border
		 */
		setBorder(	BorderFactory.createCompoundBorder(
						BorderFactory.createRaisedBevelBorder(), 
						BorderFactory.createEmptyBorder(5, 25, 5, 25)
					)
		);
	}
	
}
