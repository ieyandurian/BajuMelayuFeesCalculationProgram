package controller;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.CalculateFees;

public class DetailsAll {
	{
		// Create a JTextArea
		JTextArea textArea = new JTextArea(20, 20);
		textArea.setText(CalculateFees.output);
		textArea.setEditable(false);
		// Wrap a scrollpane around it
		JScrollPane scrollPane = new JScrollPane(textArea);
		// Display them in a message dialog
		JOptionPane.showMessageDialog(null, scrollPane,
				"Baju Melayu Fees Calculation Results",
				JOptionPane.PLAIN_MESSAGE);
	}
}
