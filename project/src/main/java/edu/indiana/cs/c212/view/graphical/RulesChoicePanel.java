package edu.indiana.cs.c212.view.graphical;

import javax.swing.JPanel;
import edu.indiana.cs.c212.gameMechanics.GameRunner;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class RulesChoicePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private String name;
	private JComboBox<String> rulesBox;
	private JLabel panelLabel;

		
		public RulesChoicePanel(String name){
			this.name = name;
			panelLabel = new JLabel(this.name);
			this.add(panelLabel);
			this.rulesBox = new JComboBox();
			for(String s: GameRunner.getRuleSets()){
				this.rulesBox.addItem(s);
			}
			this.add(rulesBox);
		}
		
		
	   // return string representing chosen ruleSet
		public String getRulesType(){
			return (String) rulesBox.getSelectedItem();
		}

	}


