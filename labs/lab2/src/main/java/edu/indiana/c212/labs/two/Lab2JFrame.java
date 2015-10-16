package edu.indiana.c212.labs.two;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab2JFrame {
   static JFrame mainFrame;
   static JLabel messageOne;
   static JPanel controlPanel;
   static JButton button;
      
   public static void main(String[] args){
	   showFirstScreen();
	   addComponents();
   }

    static void  showFirstScreen(){
      mainFrame = new JFrame("Java Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      messageOne = new JLabel("Lab C212",JLabel.CENTER);    

      messageOne.setSize(350,100);
      button = new JButton("Change Message Two");
      button.setPreferredSize(new Dimension(50, 50));
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	messageOne.setText("This is Lab 2");
            mainFrame.setVisible(true);
         }
      });
    }
    
    static void addComponents(){
    	controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(controlPanel);
        mainFrame.add(messageOne);
        mainFrame.add(button);
        mainFrame.setVisible(true);  

    }
   


}