package view;

import javax.swing.*;

import java.awt.*;

import javax.swing.border.*;

import java.awt.event.*;
import java.text.*;

import javax.swing.ImageIcon;

import controller.CalculateFees;
import controller.ClearAll;
import controller.DetailsAll;
import controller.NextPage;

/**
 * The FeesCalculation class is responsible to provide the graphical user
 * interface when called by MainApp
 *
 * @author Azizul and Hafiz
 * @version 1.0
 * @since 2015-11-01
 */
public class UserType extends JFrame implements ActionListener {

	private JPanel contentPane;

	private static JButton btnStudent;
	private static JButton btnSenior;
	private static JButton btnOther;
	private static JButton btnBack;
	private static JButton btnExit;

	private JLabel lblNewLabel;

	public static void main(String[] args) {
		/*
		 * It posts an event (Runnable)at the end of Swings event list and is
		 * processed after all other GUI events are processed.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				// try - catch block
				try {
					// Create object of OldWindow
					UserType frame = new UserType();
					// set frame visible true
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	public UserType() {
		setTitle("Merlimau’s Baju Melayu Sdn Bhd - Baju Melayu Fees Calculation Program");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		;

		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(UserType.class
				.getResource("/com/icon/logo-b.png")));
		lblNewLabel.setBounds(0, 0, 695, 90);
		contentPane.add(lblNewLabel);

		btnExit = new JButton("Exit");
		btnExit.setBounds(380, 414, 89, 30);
		contentPane.add(btnExit);
		btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnExit.setBackground(Color.LIGHT_GRAY);
				btnExit.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnExit.setBackground(UIManager.getColor("control"));
				btnExit.setForeground(UIManager.getColor("textText"));
			}
		});
		btnExit.addActionListener(this);

		btnBack = new JButton("Back");
		btnBack.setBounds(214, 414, 89, 30);
		contentPane.add(btnBack);
		btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnBack.setBackground(Color.LIGHT_GRAY);
				btnBack.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnBack.setBackground(UIManager.getColor("control"));
				btnBack.setForeground(UIManager.getColor("textText"));
			}
		});
		btnBack.addActionListener(this);

		btnStudent = new JButton("");
		btnStudent.setToolTipText("Click Here");
		btnStudent.setIcon(new ImageIcon(UserType.class
				.getResource("/com/icon/student.png")));
		btnStudent.setBounds(100, 166, 130, 130);
		btnStudent.setBackground(Color.white);
		contentPane.add(btnStudent);
		btnStudent.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnStudent.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnStudent.setBackground(Color.white);
			}
		});
		btnStudent.addActionListener(this);

		btnSenior = new JButton("");
		btnSenior.setToolTipText("Click Here");
		btnSenior.setIcon(new ImageIcon(UserType.class
				.getResource("/com/icon/senior.png")));
		btnSenior.setBounds(278, 166, 130, 130);
		btnSenior.setBackground(Color.white);
		contentPane.add(btnSenior);
		btnSenior.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnSenior.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnSenior.setBackground(Color.white);
			}
		});
		btnSenior.addActionListener(this);

		btnOther = new JButton("");
		btnOther.setToolTipText("Click Here");
		btnOther.setIcon(new ImageIcon(UserType.class
				.getResource("/com/icon/other.png")));
		btnOther.setBounds(455, 166, 130, 130);
		btnOther.setBackground(Color.white);
		contentPane.add(btnOther);
		btnOther.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnOther.setBackground(Color.LIGHT_GRAY);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnOther.setBackground(Color.white);
			}
		});
		btnOther.addActionListener(this);

		JLabel lblStudent = new JLabel("Student");
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setBounds(100, 299, 128, 14);
		contentPane.add(lblStudent);

		JLabel lblSenior = new JLabel("Senior Citizen");
		lblSenior.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenior.setBounds(278, 299, 128, 14);
		contentPane.add(lblSenior);

		JLabel lblOther = new JLabel("Other");
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setBounds(455, 299, 128, 14);
		contentPane.add(lblOther);

		JLabel lblFooter = new JLabel(
				"\u00A9 2015 Merlimau's Baju Melayu Sdn Bhd. All Rights Reserved.");
		lblFooter.setBounds(0, 455, 478, 14);
		contentPane.add(lblFooter);

		lblNewLabel = new JLabel("Please Choose User Type:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(191, 123, 303, 36);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

		int choice;
		if (event.getSource() == btnStudent) {
			choice = 1;
			new NextPage(choice);
			dispose();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnSenior) {
			choice = 2;
			new NextPage(choice);
			dispose();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnOther) {
			choice = 3;
			new NextPage(choice);
			dispose();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnBack) {
			IntroBajuMelayu fm = new IntroBajuMelayu();
			fm.setVisible(true);
			dispose();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnExit) {
			// Exit the program
			dispose();
		}
	}
}