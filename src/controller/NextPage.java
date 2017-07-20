package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.FeesCalculation;
import view.UserType;

public class NextPage {
	public int choice = 4;
	public NextPage(int c) {
		if (c != 4) {
			choice = c;
			FeesCalculation f1 = new FeesCalculation(choice);
			f1.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Please choose user type.");
			// Call the object of FeesCalculation and set visible true
			UserType f1 = new UserType();
			f1.setVisible(true);
		}
	}
}
