package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controller.NextPage;

public class IntroBajuMelayu extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	private JButton btnEnter;
	private JButton btnAbout;
	
	public static void main(String[] args)
	{
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				try 
				{
					//Create object of OldWindow
					IntroBajuMelayu frame = new IntroBajuMelayu();
					//set frame visible true
					frame.setVisible(true);	
					
				} 
				catch (Exception e)
				{
					e.printStackTrace();

				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public IntroBajuMelayu()//constructor 
	{
		//Set frame title
		setTitle("Welcome To Merlimau's Baju Melayu Fees Calculation");
		//Set default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(IntroBajuMelayu.class.getResource("/com/icon/logo2.png")));
		lblNewLabel.setBounds(0, 11, 689, 259);
		contentPane.add(lblNewLabel);
		
		JLabel lblFooter = new JLabel("\u00A9 2015 Merlimau's Baju Melayu Sdn Bhd. All Rights Reserved.");
		lblFooter.setBounds(0, 455, 478, 14);
		contentPane.add(lblFooter);
		
		btnEnter = new JButton("Click Here To Enter");
		btnEnter.setBounds(253, 336, 200, 30);
		contentPane.add(btnEnter);
		btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnEnter.setBackground(Color.LIGHT_GRAY);
				btnEnter.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnEnter.setBackground(UIManager.getColor("control"));
				btnEnter.setForeground(UIManager.getColor("textText"));
			}
		});
		btnEnter.addActionListener(this);
		
		btnAbout = new JButton("About Us");
		btnAbout.setBounds(253, 370, 200, 30);
		contentPane.add(btnAbout);
		btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnAbout.setBackground(Color.LIGHT_GRAY);
				btnAbout.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnAbout.setBackground(UIManager.getColor("control"));
				btnAbout.setForeground(UIManager.getColor("textText"));
			}
		});
		btnAbout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == btnEnter) {
			//Call the object of FeesCalculation and set visible true
			UserType f1 = new UserType();
			f1.setVisible(true);
			dispose();
			//Set default close operation
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnAbout) {
			//Call the object of FeesCalculation and set visible true
			AboutUs f1 = new AboutUs();
			f1.setVisible(true);
			dispose();
			//Set default close operation
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		
	}
}
	
