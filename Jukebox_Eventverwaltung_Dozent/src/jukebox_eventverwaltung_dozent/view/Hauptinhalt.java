package jukebox_eventverwaltung_dozent.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Hauptinhalt extends JPanel{
	private HauptButtonBar hauptbuttonbar = new HauptButtonBar();

	public HauptButtonBar getHauptbuttonbar() {
		return hauptbuttonbar;
	}

	public Hauptinhalt() {
		setLayout(new BorderLayout());
		setBackground(new Color(204, 204, 204));
		
		add(hauptbuttonbar, BorderLayout.SOUTH);
	}
}
