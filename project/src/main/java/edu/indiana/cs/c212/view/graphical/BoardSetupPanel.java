package edu.indiana.cs.c212.view.graphical;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;



public class BoardSetupPanel extends JPanel {

private static final long serialVersionUID = 1L;
//private static final long serialVersionUID = 8393060993272898000L;
private static int DEFAULT_BOARD_SIZE = 7;
private static int MAX_SUPPORTED_BOARD_SIZE = 99;
private static int MIN_SUPPORTED_BOARD_SIZE = 1;
private JSpinner spinner;
private SpinnerNumberModel spinnerModel;
private JLabel sizeLabel;


public BoardSetupPanel(){
	spinnerModel = new SpinnerNumberModel(DEFAULT_BOARD_SIZE, MIN_SUPPORTED_BOARD_SIZE, MAX_SUPPORTED_BOARD_SIZE, 1);
	spinner = new JSpinner(spinnerModel);
	JSpinner.NumberEditor editor = new JSpinner.NumberEditor(spinner);
	spinner.setEditor(editor);
	sizeLabel = new JLabel("Board Size");
	
	//add spinner + label
	this.add(spinner);
	this.add(sizeLabel);
}

public Integer getBoardSize(){
	// return desired board size - chosen by user
	return (Integer) spinner.getValue();
}

}


