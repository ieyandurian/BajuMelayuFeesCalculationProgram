package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class AboutUs extends JFrame implements ActionListener {
	private JPanel contentPane;

	private static JButton btnStudent;
	private static JButton btnBack;
	private static JButton btnExit;
	
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setTitle("Merlimau’s Baju Melayu Sdn Bhd - Baju Melayu Fees Calculation Program");
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
		lblNewLabel.setIcon(new ImageIcon(UserType.class.getResource("/com/icon/logo-b.png")));
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
		
		JLabel lblabout = new JLabel("");
		lblabout.setIcon(new ImageIcon(AboutUs.class.getResource("/com/icon/about1.png")));
		lblabout.setBounds(65, 101, 300, 299);
		contentPane.add(lblabout);
		
		JLabel lblFooter = new JLabel("\u00A9 2015 Merlimau's Baju Melayu Sdn Bhd. All Rights Reserved.");
		lblFooter.setBounds(0, 455, 478, 14);
		contentPane.add(lblFooter);
		
		lblNewLabel = new JLabel("About Us");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(354, 121, 303, 36);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnMerlimausBajuMelayu = new JTextPane();
		txtpnMerlimausBajuMelayu.setEditable(false);
		txtpnMerlimausBajuMelayu.setText("Merlimau's Baju Melayu Fees Calculation System was developed by Azizulaimran, Hafiz and Aminnur for Merlimau's Baju Melayu Sdn.Bhd. This company is located at Kampung Pulai, Merlimau, Melaka. The system will be displaying 10 types of baju melayu such as Baju melayu Aaron Aziz, Baju Melayu Epaulette, Baju melayu Hipster and etc for user to choose. The system will then calculate the fees of the choosen item. These 10 baju Melayu are the baju Melayu being sold in the company. There are 5 sizes available which are S, M, L, XL and XXL.");
		txtpnMerlimausBajuMelayu.setBounds(354, 170, 300, 200);
		contentPane.add(txtpnMerlimausBajuMelayu);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
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