package edu.indiana.cs.c212;
//we need these libraries in order to work with JFrames, JPanels, and Action Listeners (the code that makes the button click do something)
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameExample {
	
	public static void main(String[] args) {
		// Our top level window needs to be a JFrame
		JFrame frame = frameMaker();
		// We use JPanels inside of JFrames (and other JPanels) to group components together
		// This gives us control over their arrangement within the JFrame because JPanels
		// allow for layouts while JFrames do not.
		panelMaker(frame);
	}

	public static JFrame frameMaker() {
		// 1. Create the frame
		JFrame frame = new JFrame("My First GUI");
		// 2. Set what happens when the frame closes
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// 3. Set default size of the frame. Note: this can be overridden
		//    by frame.pack() depending on the default size of 
		//    the JFrame and the size of any components attached to the
		//    the JFrame and their layout managers.
		frame.setSize(400, 300);
		// 4. Create additional components to be added to the frame
		JLabel label = new JLabel("Frame");
		// 5. Add created components to the frame
		frame.getContentPane().add(label);
		// 6. pack the frame, especially if you didn't manually size the frame previously
		// (experiment with the difference in outcome by commenting out frame.pack() lines
		// and recompiling)
		frame.pack();
		// 7. Set the frame to be visible so you can actually see it on the
		// screen
		frame.setVisible(true);
		// here we're just returning the frame so that we can use it in other
		// places if we need to
		return frame;
	}

	public static void panelMaker(JFrame frame) {
		// 1. Create the JPanel, specify what layout you want to use as an
		// argument to the JPanel constructor, default is FlowLayout
		JPanel panel = new JPanel(new FlowLayout());
		// 2. Create components to add to the JPanel
		JLabel labelButton = new JLabel("Go on, push the button:");
		JButton button = new JButton("On Button");
		button.setBackground(Color.GREEN);
		// 3. This code makes it so that when you push the button, it actually
		//    does something
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// e.getSource will return our button
				JButton actionButton = (JButton) e.getSource();
				// if the button was on when clicked, change it to off
				if (actionButton.getText().equals("On Button")) {
					actionButton.setText("Off Button");
					actionButton.setBackground(Color.RED);
				}
				// otherwise the button was off when clicked, change it to on
				else {
					actionButton.setText("On Button");
					actionButton.setBackground(Color.GREEN);
				}
			}
		});
		// 4. Add the created components (label and button) to the JPanel,
		//    notice that the order in which components are added matters!
		panel.add(labelButton);
		panel.add(button);
		// 5. Add the JPanel to the frame
		frame.add(panel);
		// 6. Pack the frame so things are aligned
		frame.pack();
		// 7. Set the frame to be visible
		frame.setVisible(true);
	}
}