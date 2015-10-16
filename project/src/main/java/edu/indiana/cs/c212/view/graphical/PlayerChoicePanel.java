package edu.indiana.cs.c212.view.graphical;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import edu.indiana.cs.c212.gameMechanics.GameRunner;


public class PlayerChoicePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private String name;
	private JComboBox<String> playerBox;
	private JLabel panelLabel;

	
	public PlayerChoicePanel(String name){
		this.name = name;
		panelLabel = new JLabel(this.name);
		this.add(panelLabel);
		this.playerBox = new JComboBox();
		for(String s: GameRunner.getPlayersList()){
			this.playerBox.addItem(s);
		}
		this.add(playerBox);
	}
	
	public String getPlayerType(){
		// return string representing chosen player
		return (String) playerBox.getSelectedItem();
	}

}
