package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controller.CalculateFees;
import controller.ClearAll;
import controller.DetailsAll;

public class FeesCalculation extends JFrame implements ActionListener {

	private JPanel contentPane;
	DecimalFormat df;
	private int choice;
	public static JCheckBox chkType1;
	public static JCheckBox chkType2;
	public static JCheckBox chkType3;
	public static JCheckBox chkType4;
	public static JCheckBox chkType5;
	public static JCheckBox chkType6;
	public static JCheckBox chkType7;
	public static JCheckBox chkType8;
	public static JCheckBox chkType9;
	public static JCheckBox chkType10;

	public static JComboBox<?> cmbSize1;
	public static JComboBox<?> cmbSize2;
	public static JComboBox<?> cmbSize3;
	public static JComboBox<?> cmbSize4;
	public static JComboBox<?> cmbSize5;
	public static JComboBox<?> cmbSize6;
	public static JComboBox<?> cmbSize7;
	public static JComboBox<?> cmbSize8;
	public static JComboBox<?> cmbSize9;
	public static JComboBox<?> cmbSize10;

	private String[] sizeString1 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString2 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString3 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString4 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString5 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString6 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString7 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString8 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString9 = { "", "S", "M", "L", "XL", "XXL" };
	private String[] sizeString10 = { "", "S", "M", "L", "XL", "XXL" };

	private JLabel lblSize[] = new JLabel[10];
	private JLabel lblPrice[] = new JLabel[10];
	private JLabel lblQty[] = new JLabel[10];

	public static JTextField txtPrice1;
	public static JTextField txtPrice2;
	public static JTextField txtPrice3;
	public static JTextField txtPrice4;
	public static JTextField txtPrice5;
	public static JTextField txtPrice6;
	public static JTextField txtPrice7;
	public static JTextField txtPrice8;
	public static JTextField txtPrice9;
	public static JTextField txtPrice10;

	public static JTextField txtQty1;
	public static JTextField txtQty2;
	public static JTextField txtQty3;
	public static JTextField txtQty4;
	public static JTextField txtQty5;
	public static JTextField txtQty6;
	public static JTextField txtQty7;
	public static JTextField txtQty8;
	public static JTextField txtQty9;
	public static JTextField txtQty10;

	public static JButton btnCalculate;
	public static JButton btnClear;
	public static JButton btnExit;
	public static JButton btnDetails;
	public static JButton btnBack;

	private JLabel imgTitle;
	private JLabel imgType1;
	private JLabel imgType2;
	private JLabel imgType3;
	private JLabel imgType4;
	private JLabel imgType5;
	private JLabel imgType6;
	private JLabel imgType7;
	private JLabel imgType8;
	private JLabel imgType9;
	private JLabel imgType10;

	private JLabel lblTotalPrice;
	public static JTextField txtTotalPrice;

	/**
	 * Create the frame.
	 */
	public FeesCalculation(int c) {
		choice = c;
		// Set frame title
		setTitle("Welcome To Merlimau's Baju Melayu Fees Calculation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1369, 740);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		df = new DecimalFormat("0.00");
		// Create new container c1
		Container c1 = getContentPane();
		c1.setLayout(new BorderLayout());
		c1.setBackground(null);
		// c1.setBackground(Color.WHITE);

		// Initialize the JLabel
		for (int i = 0; i < 10; i++) {
			lblQty[i] = new JLabel("Quantity:");
		}
		for (int i = 0; i < 10; i++) {
			lblSize[i] = new JLabel("Size:");
		}
		for (int j = 0; j < 10; j++) {
			lblPrice[j] = new JLabel("Price:");
		}

		cmbSize1 = new JComboBox<String>(sizeString1);
		cmbSize1.setSelectedIndex(0);
		cmbSize1.setBackground(null);
		cmbSize2 = new JComboBox<String>(sizeString2);
		cmbSize2.setSelectedIndex(0);
		cmbSize2.setBackground(null);
		cmbSize3 = new JComboBox<String>(sizeString3);
		cmbSize3.setSelectedIndex(0);
		cmbSize3.setBackground(null);
		cmbSize4 = new JComboBox<String>(sizeString4);
		cmbSize4.setSelectedIndex(0);
		cmbSize4.setBackground(null);
		cmbSize5 = new JComboBox<String>(sizeString5);
		cmbSize5.setSelectedIndex(0);
		cmbSize5.setBackground(null);
		cmbSize6 = new JComboBox<String>(sizeString6);
		cmbSize6.setSelectedIndex(0);
		cmbSize6.setBackground(null);
		cmbSize7 = new JComboBox<String>(sizeString7);
		cmbSize7.setSelectedIndex(0);
		cmbSize7.setBackground(null);
		cmbSize8 = new JComboBox<String>(sizeString8);
		cmbSize8.setSelectedIndex(0);
		cmbSize8.setBackground(null);
		cmbSize9 = new JComboBox<String>(sizeString9);
		cmbSize9.setSelectedIndex(0);
		cmbSize9.setBackground(null);
		cmbSize10 = new JComboBox<String>(sizeString10);
		cmbSize10.setSelectedIndex(0);
		cmbSize10.setBackground(null);

		btnCalculate = new JButton("Calculate");
		btnClear = new JButton("Clear");
		btnExit = new JButton("Exit");
		btnDetails = new JButton("Details");
		btnDetails.setEnabled(false);
		btnBack = new JButton("Back");

		// Link the image file with the JLabel
		imgTitle = new JLabel();
		imgTitle.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/logo-c.png")));

		imgType1 = new JLabel();
		imgType1.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu aaron aziz1.jpg")));
		imgType1.setPreferredSize(new Dimension(140, 130));

		imgType2 = new JLabel();
		imgType2.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu Epaulette1.jpg")));
		imgType2.setPreferredSize(new Dimension(140, 130));

		imgType3 = new JLabel();
		imgType3.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu hipster1.jpg")));
		imgType3.setPreferredSize(new Dimension(140, 130));

		imgType4 = new JLabel();
		imgType4.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu johor1.jpg")));
		imgType4.setPreferredSize(new Dimension(140, 130));

		imgType5 = new JLabel();
		imgType5.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu kurta1.jpg")));
		imgType5.setPreferredSize(new Dimension(140, 130));

		imgType6 = new JLabel();
		imgType6.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu riau1.jpg")));
		imgType6.setPreferredSize(new Dimension(140, 130));

		imgType7 = new JLabel();
		imgType7.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu tradisional1.jpg")));
		imgType7.setPreferredSize(new Dimension(140, 130));

		imgType8 = new JLabel();
		imgType8.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu tradisional 21.jpg")));
		imgType8.setPreferredSize(new Dimension(140, 130));

		imgType9 = new JLabel();
		imgType9.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu zibra1.jpg")));
		imgType9.setPreferredSize(new Dimension(140, 130));

		imgType10 = new JLabel();
		imgType10.setIcon(new ImageIcon(getClass().getResource(
				"/com/icon/baju melayu zapin1.jpg")));
		imgType10.setPreferredSize(new Dimension(140, 130));

		txtPrice1 = new JTextField("RM");
		txtPrice1.setEditable(false);

		txtPrice2 = new JTextField("RM");
		txtPrice2.setEditable(false);
		txtPrice3 = new JTextField("RM");
		txtPrice3.setEditable(false);
		txtPrice4 = new JTextField("RM");
		txtPrice4.setEditable(false);
		txtPrice5 = new JTextField("RM");
		txtPrice5.setEditable(false);
		txtPrice6 = new JTextField("RM");
		txtPrice6.setEditable(false);
		txtPrice7 = new JTextField("RM");
		txtPrice7.setEditable(false);
		txtPrice8 = new JTextField("RM");
		txtPrice8.setEditable(false);
		txtPrice9 = new JTextField("RM");
		txtPrice9.setEditable(false);
		txtPrice10 = new JTextField("RM");
		txtPrice10.setEditable(false);

		// Set tooltip for JTextField txtQty
		txtQty1 = new JTextField();
		txtQty1.setToolTipText("Please insert number only.");
		txtQty2 = new JTextField();
		txtQty2.setToolTipText("Please insert number only.");
		txtQty3 = new JTextField();
		txtQty3.setToolTipText("Please insert number only.");
		txtQty4 = new JTextField();
		txtQty4.setToolTipText("Please insert number only.");
		txtQty5 = new JTextField();
		txtQty5.setToolTipText("Please insert number only.");
		txtQty6 = new JTextField();
		txtQty6.setToolTipText("Please insert number only.");
		txtQty7 = new JTextField();
		txtQty7.setToolTipText("Please insert number only.");
		txtQty8 = new JTextField();
		txtQty8.setToolTipText("Please insert number only.");
		txtQty9 = new JTextField();
		txtQty9.setToolTipText("Please insert number only.");
		txtQty10 = new JTextField();
		txtQty10.setToolTipText("Please insert number only.");

		chkType1 = new JCheckBox("Baju Melayu Aaron Aziz");
		chkType1.setBackground(null);
		chkType2 = new JCheckBox("Baju Melayu Epaulette");
		chkType2.setBackground(null);
		chkType3 = new JCheckBox("Baju Melayu Hipster");
		chkType3.setBackground(null);
		chkType4 = new JCheckBox("Baju Melayu Johor");
		chkType4.setBackground(null);
		chkType5 = new JCheckBox("Baju Melayu Kurta");
		chkType5.setBackground(null);
		chkType6 = new JCheckBox("Baju Melayu Riau");
		chkType6.setBackground(null);
		chkType7 = new JCheckBox("Baju Melayu Tradisi");
		chkType7.setBackground(null);
		chkType8 = new JCheckBox("Baju Melayu Pengantin");
		chkType8.setBackground(null);
		chkType9 = new JCheckBox("Baju Melayu Zibra");
		chkType9.setBackground(null);
		chkType10 = new JCheckBox("Baju Melayu Zapin");
		chkType10.setBackground(null);

		lblTotalPrice = new JLabel("Total Price:");
		txtTotalPrice = new JTextField("RM");
		txtTotalPrice.setColumns(15);
		txtTotalPrice.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBackground(Color.white);

		// Create new JPanel
		final JPanel pnlType1_2 = new JPanel(new GridLayout(3, 2));
		pnlType1_2.add(lblSize[0]);
		pnlType1_2.add(cmbSize1);
		pnlType1_2.add(lblPrice[0]);
		pnlType1_2.add(txtPrice1);
		pnlType1_2.add(lblQty[0]);
		pnlType1_2.add(txtQty1);
		pnlType1_2.setBackground(Color.white);
		pnlType1_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType1_1 = new JPanel(new BorderLayout());
		pnlType1_1.add(chkType1, BorderLayout.NORTH);
		pnlType1_1.add(pnlType1_2, BorderLayout.SOUTH);
		pnlType1_1.setBackground(Color.white);
		pnlType1_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType1 = new JPanel(new FlowLayout());
		TitledBorder infoType1 = BorderFactory.createTitledBorder("");
		pnlType1.setBorder(infoType1);
		pnlType1.setBorder(BorderFactory.createTitledBorder(""));
		pnlType1.add(imgType1);
		pnlType1.add(pnlType1_1);
		pnlType1.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType1.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType1.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType2_2 = new JPanel(new GridLayout(3, 2));
		pnlType2_2.add(lblSize[1]);
		pnlType2_2.add(cmbSize2);
		pnlType2_2.add(lblPrice[1]);
		pnlType2_2.add(txtPrice2);
		pnlType2_2.add(lblQty[1]);
		pnlType2_2.add(txtQty2);
		pnlType2_2.setBackground(Color.white);
		pnlType2_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType2_1 = new JPanel(new BorderLayout());
		pnlType2_1.add(chkType2, BorderLayout.NORTH);
		pnlType2_1.add(pnlType2_2, BorderLayout.SOUTH);
		pnlType2_1.setBackground(Color.white);
		pnlType2_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType2 = new JPanel(new FlowLayout());
		TitledBorder infoType2 = BorderFactory.createTitledBorder("");
		pnlType2.setBorder(infoType2);
		pnlType2.setBorder(BorderFactory.createTitledBorder(""));
		pnlType2.add(imgType2);
		pnlType2.add(pnlType2_1);
		pnlType2.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType2.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType2.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType3_2 = new JPanel(new GridLayout(3, 2));
		pnlType3_2.add(lblSize[2]);
		pnlType3_2.add(cmbSize3);
		pnlType3_2.add(lblPrice[2]);
		pnlType3_2.add(txtPrice3);
		pnlType3_2.add(lblQty[2]);
		pnlType3_2.add(txtQty3);
		pnlType3_2.setBackground(Color.white);
		pnlType3_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType3_1 = new JPanel(new BorderLayout());
		pnlType3_1.add(chkType3, BorderLayout.NORTH);
		pnlType3_1.add(pnlType3_2, BorderLayout.SOUTH);
		pnlType3_1.setBackground(Color.white);
		pnlType3_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType3 = new JPanel(new FlowLayout());
		TitledBorder infoType3 = BorderFactory.createTitledBorder("");
		pnlType3.setBorder(infoType3);
		pnlType3.setBorder(BorderFactory.createTitledBorder(""));
		pnlType3.add(imgType3);
		pnlType3.add(pnlType3_1);
		pnlType3.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType3.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType3.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType4_2 = new JPanel(new GridLayout(3, 2));
		pnlType4_2.add(lblSize[3]);
		pnlType4_2.add(cmbSize4);
		pnlType4_2.add(lblPrice[3]);
		pnlType4_2.add(txtPrice4);
		pnlType4_2.add(lblQty[3]);
		pnlType4_2.add(txtQty4);
		pnlType4_2.setBackground(Color.white);
		pnlType4_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType4_1 = new JPanel(new BorderLayout());
		pnlType4_1.add(chkType4, BorderLayout.NORTH);
		pnlType4_1.add(pnlType4_2, BorderLayout.SOUTH);
		pnlType4_1.setBackground(Color.white);
		pnlType4_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType4 = new JPanel(new FlowLayout());
		TitledBorder infoType4 = BorderFactory.createTitledBorder("");
		pnlType4.setBorder(infoType4);
		pnlType4.setBorder(BorderFactory.createTitledBorder(""));
		pnlType4.add(imgType4);
		pnlType4.add(pnlType4_1);
		pnlType4.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType4.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType4.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType5_2 = new JPanel(new GridLayout(3, 2));
		pnlType5_2.add(lblSize[4]);
		pnlType5_2.add(cmbSize5);
		pnlType5_2.add(lblPrice[4]);
		pnlType5_2.add(txtPrice5);
		pnlType5_2.add(lblQty[4]);
		pnlType5_2.add(txtQty5);
		pnlType5_2.setBackground(Color.white);
		pnlType5_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType5_1 = new JPanel(new BorderLayout());
		pnlType5_1.add(chkType5, BorderLayout.NORTH);
		pnlType5_1.add(pnlType5_2, BorderLayout.SOUTH);
		pnlType5_1.setBackground(Color.white);
		pnlType5_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType5 = new JPanel(new FlowLayout());
		TitledBorder infoType5 = BorderFactory.createTitledBorder("");
		pnlType5.setBorder(infoType5);
		pnlType5.setBorder(BorderFactory.createTitledBorder(""));
		pnlType5.add(imgType5);
		pnlType5.add(pnlType5_1);
		pnlType5.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType5.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType5.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType6_2 = new JPanel(new GridLayout(3, 2));
		pnlType6_2.add(lblSize[5]);
		pnlType6_2.add(cmbSize6);
		pnlType6_2.add(lblPrice[5]);
		pnlType6_2.add(txtPrice6);
		pnlType6_2.add(lblQty[5]);
		pnlType6_2.add(txtQty6);
		pnlType6_2.setBackground(Color.white);
		pnlType6_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType6_1 = new JPanel(new BorderLayout());
		pnlType6_1.add(chkType6, BorderLayout.NORTH);
		pnlType6_1.add(pnlType6_2, BorderLayout.SOUTH);
		pnlType6_1.setBackground(Color.white);
		pnlType6_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType6 = new JPanel(new FlowLayout());
		TitledBorder infoType6 = BorderFactory.createTitledBorder("");
		pnlType6.setBorder(infoType6);
		pnlType6.setBorder(BorderFactory.createTitledBorder(""));
		pnlType6.add(imgType6);
		pnlType6.add(pnlType6_1);
		pnlType6.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType6.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType6.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType7_2 = new JPanel(new GridLayout(3, 2));
		pnlType7_2.add(lblSize[6]);
		pnlType7_2.add(cmbSize7);
		pnlType7_2.add(lblPrice[6]);
		pnlType7_2.add(txtPrice7);
		pnlType7_2.add(lblQty[6]);
		pnlType7_2.add(txtQty7);
		pnlType7_2.setBackground(Color.white);
		pnlType7_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType7_1 = new JPanel(new BorderLayout());
		pnlType7_1.add(chkType7, BorderLayout.NORTH);
		pnlType7_1.add(pnlType7_2, BorderLayout.SOUTH);
		pnlType7_1.setBackground(Color.white);
		pnlType7_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType7 = new JPanel(new FlowLayout());
		TitledBorder infoType7 = BorderFactory.createTitledBorder("");
		pnlType7.setBorder(infoType7);
		pnlType7.setBorder(BorderFactory.createTitledBorder(""));
		pnlType7.add(imgType7);
		pnlType7.add(pnlType7_1);
		pnlType7.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType7.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType7.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType8_2 = new JPanel(new GridLayout(3, 2));
		pnlType8_2.add(lblSize[7]);
		pnlType8_2.add(cmbSize8);
		pnlType8_2.add(lblPrice[7]);
		pnlType8_2.add(txtPrice8);
		pnlType8_2.add(lblQty[7]);
		pnlType8_2.add(txtQty8);
		pnlType8_2.setBackground(Color.white);
		pnlType8_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType8_1 = new JPanel(new BorderLayout());
		pnlType8_1.add(chkType8, BorderLayout.NORTH);
		pnlType8_1.add(pnlType8_2, BorderLayout.SOUTH);
		pnlType8_1.setBackground(Color.white);
		pnlType8_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType8 = new JPanel(new FlowLayout());
		TitledBorder infoType8 = BorderFactory.createTitledBorder("");
		pnlType8.setBorder(infoType8);
		pnlType8.setBorder(BorderFactory.createTitledBorder(""));
		pnlType8.add(imgType8);
		pnlType8.add(pnlType8_1);
		pnlType8.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType8.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType8.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType9_2 = new JPanel(new GridLayout(3, 2));
		pnlType9_2.add(lblSize[8]);
		pnlType9_2.add(cmbSize9);
		pnlType9_2.add(lblPrice[8]);
		pnlType9_2.add(txtPrice9);
		pnlType9_2.add(lblQty[8]);
		pnlType9_2.add(txtQty9);
		pnlType9_2.setBackground(Color.white);
		pnlType9_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType9_1 = new JPanel(new BorderLayout());
		pnlType9_1.add(chkType9, BorderLayout.NORTH);
		pnlType9_1.add(pnlType9_2, BorderLayout.SOUTH);
		pnlType9_1.setBackground(Color.white);
		pnlType9_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType9 = new JPanel(new FlowLayout());
		TitledBorder infoType9 = BorderFactory.createTitledBorder("");
		pnlType9.setBorder(infoType9);
		pnlType9.setBorder(BorderFactory.createTitledBorder(""));
		pnlType9.add(imgType9);
		pnlType9.add(pnlType9_1);
		pnlType9.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType9.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType9.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlType10_2 = new JPanel(new GridLayout(3, 2));
		pnlType10_2.add(lblSize[9]);
		pnlType10_2.add(cmbSize10);
		pnlType10_2.add(lblPrice[9]);
		pnlType10_2.add(txtPrice10);
		pnlType10_2.add(lblQty[9]);
		pnlType10_2.add(txtQty10);
		pnlType10_2.setBackground(Color.white);
		pnlType10_2.setPreferredSize(new Dimension(200, 70));
		// Create new JPanel
		JPanel pnlType10_1 = new JPanel(new BorderLayout());
		pnlType10_1.add(chkType10, BorderLayout.NORTH);
		pnlType10_1.add(pnlType10_2, BorderLayout.SOUTH);
		pnlType10_1.setBackground(Color.white);
		pnlType10_1.setBounds(0, 0, 100, 70);
		// Create new JPanel and combine the above two JPanels into one
		final JPanel pnlType10 = new JPanel(new FlowLayout());
		TitledBorder infoType10 = BorderFactory.createTitledBorder("");
		pnlType10.setBorder(infoType10);
		pnlType10.setBorder(BorderFactory.createTitledBorder(""));
		pnlType10.add(imgType10);
		pnlType10.add(pnlType10_1);
		pnlType10.setBackground(Color.white);
		// Add mouse listener to the JPanel
		pnlType10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				pnlType10.setBackground(Color.lightGray);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				pnlType10.setBackground(Color.white);
			}
		});

		// Create new JPanel
		JPanel pnlTop = new JPanel(new GridLayout(2, 5));
		TitledBorder infoTop = BorderFactory.createTitledBorder("");
		pnlTop.setBorder(infoTop);
		pnlTop.setBorder(BorderFactory
				.createTitledBorder("Baju Melayu Fees Calculation Program"));
		pnlTop.add(pnlType1);
		pnlTop.add(pnlType2);
		pnlTop.add(pnlType3);
		pnlTop.add(pnlType4);
		pnlTop.add(pnlType5);
		pnlTop.add(pnlType6);
		pnlTop.add(pnlType7);
		pnlTop.add(pnlType8);
		pnlTop.add(pnlType9);
		pnlTop.add(pnlType10);
		pnlTop.setPreferredSize(new Dimension(1360, 520));
		pnlTop.setBackground(null);
		// Create new JPanel and combine the above three JPanels into one
		JPanel pnlDown = new JPanel();
		pnlDown.setLayout(null);
		pnlDown.setBackground(null);
		pnlDown.setPreferredSize(new Dimension(1360, 70));

		// Add action listener into the component
		cmbSize1.addActionListener(this);
		cmbSize2.addActionListener(this);
		cmbSize3.addActionListener(this);
		cmbSize4.addActionListener(this);
		cmbSize5.addActionListener(this);
		cmbSize6.addActionListener(this);
		cmbSize7.addActionListener(this);
		cmbSize8.addActionListener(this);
		cmbSize9.addActionListener(this);
		cmbSize10.addActionListener(this);

		// Create new JPanel and combine JPanel pnlTop and JPanel pnlDown
		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.PAGE_AXIS));
		pnlCenter.add(pnlTop);
		pnlCenter.add(Box.createRigidArea(new Dimension(0, 1)));
		pnlCenter.add(pnlDown);
		btnBack = new JButton("Back");
		btnBack.setBounds(548, 42, 89, 30);
		pnlDown.add(btnBack);
		btnExit = new JButton("Exit");
		btnExit.setBounds(714, 42, 89, 30);
		pnlDown.add(btnExit);

		lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setBounds(1090, 6, 86, 14);
		pnlDown.add(lblTotalPrice);
		txtTotalPrice = new JTextField("RM");
		txtTotalPrice.setBounds(1177, 0, 176, 26);
		pnlDown.add(txtTotalPrice);
		txtTotalPrice.setColumns(15);
		txtTotalPrice.setFont(new Font("Courier", Font.PLAIN, 14));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBackground(Color.white);

		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(540, 0, 89, 30);
		pnlDown.add(btnCalculate);
		btnClear = new JButton("Clear");
		btnClear.setBounds(631, 0, 89, 30);
		pnlDown.add(btnClear);
		btnDetails = new JButton("Details");
		btnDetails.setBounds(722, 0, 89, 30);
		pnlDown.add(btnDetails);
		btnDetails.setEnabled(false);
		btnDetails.addActionListener(this);
		btnClear.addActionListener(this);
		btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnClear.setBackground(Color.LIGHT_GRAY);
				btnClear.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnClear.setBackground(UIManager.getColor("control"));
				btnClear.setForeground(UIManager.getColor("textText"));
			}
		});
		btnCalculate.addActionListener(this);

		// Add mouse listener to the JButton
		btnCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnCalculate.setBackground(Color.LIGHT_GRAY);
				btnCalculate.setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnCalculate.setBackground(UIManager.getColor("control"));
				btnCalculate.setForeground(UIManager.getColor("textText"));
			}
		});
		btnExit.addActionListener(this);
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
		btnBack.addActionListener(this);
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

		// Create new JLabel
		JLabel lblFooter = new JLabel(
				"© 2015 Merlimau's Baju Melayu Sdn Bhd. All Rights Reserved.");
		c1.add(imgTitle, BorderLayout.NORTH);
		c1.add(pnlCenter, BorderLayout.CENTER);
		c1.add(lblFooter, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent event) {
		double[] price = new double[10];

		// Set the price with their respective size and type
		if (cmbSize1.getSelectedItem() == "S") {
			df.format(price[0] = 85);
			txtPrice1.setText("RM " + df.format(price[0]));
		} else if (cmbSize1.getSelectedItem() == "M") {
			price[0] = 90;
			txtPrice1.setText("RM " + df.format(price[0]));
		} else if (cmbSize1.getSelectedItem() == "L") {
			price[0] = 95;
			txtPrice1.setText("RM " + df.format(price[0]));
		} else if (cmbSize1.getSelectedItem() == "XL") {
			price[0] = 100;
			txtPrice1.setText("RM " + df.format(price[0]));
		} else if (cmbSize1.getSelectedItem() == "XXL") {
			price[0] = 105;
			txtPrice1.setText("RM " + df.format(price[0]));
		} else {
			price[0] = 0;
			txtPrice1.setText("");
		}

		if (cmbSize2.getSelectedItem() == "S") {
			price[1] = 110;
			txtPrice2.setText("RM " + df.format(price[1]));
		} else if (cmbSize2.getSelectedItem() == "M") {
			price[1] = 120;
			txtPrice2.setText("RM " + df.format(price[1]));
		} else if (cmbSize2.getSelectedItem() == "L") {
			price[1] = 130;
			txtPrice2.setText("RM " + df.format(price[1]));
		} else if (cmbSize2.getSelectedItem() == "XL") {
			price[1] = 140;
			txtPrice2.setText("RM " + df.format(price[1]));
		} else if (cmbSize2.getSelectedItem() == "XXL") {
			price[1] = 150;
			txtPrice2.setText("RM " + df.format(price[1]));
		} else {
			price[1] = 0;
			txtPrice2.setText("");
		}

		if (cmbSize3.getSelectedItem() == "S") {
			price[2] = 180;
			txtPrice3.setText("RM " + df.format(price[2]));
		} else if (cmbSize3.getSelectedItem() == "M") {
			price[2] = 190;
			txtPrice3.setText("RM " + df.format(price[2]));
		} else if (cmbSize3.getSelectedItem() == "L") {
			price[2] = 200;
			txtPrice3.setText("RM " + df.format(price[2]));
		} else if (cmbSize3.getSelectedItem() == "XL") {
			price[2] = 210;
			txtPrice3.setText("RM " + df.format(price[2]));
		} else if (cmbSize3.getSelectedItem() == "XXL") {
			price[2] = 220;
			txtPrice3.setText("RM " + df.format(price[2]));
		} else {
			price[2] = 0;
			txtPrice3.setText("");
		}

		if (cmbSize4.getSelectedItem() == "S") {
			price[3] = 65;
			txtPrice4.setText("RM " + df.format(price[3]));
		} else if (cmbSize4.getSelectedItem() == "M") {
			price[3] = 70;
			txtPrice4.setText("RM " + df.format(price[3]));
		} else if (cmbSize4.getSelectedItem() == "L") {
			price[3] = 75;
			txtPrice4.setText("RM " + df.format(price[3]));
		} else if (cmbSize4.getSelectedItem() == "XL") {
			price[3] = 80;
			txtPrice4.setText("RM " + df.format(price[3]));
		} else if (cmbSize4.getSelectedItem() == "XXL") {
			price[3] = 85;
			txtPrice4.setText("RM " + df.format(price[3]));
		} else {
			price[3] = 0;
			txtPrice4.setText("");
		}

		if (cmbSize5.getSelectedItem() == "S") {
			price[4] = 250;
			txtPrice5.setText("RM " + df.format(price[4]));
		} else if (cmbSize5.getSelectedItem() == "M") {
			price[4] = 260;
			txtPrice5.setText("RM " + df.format(price[4]));
		} else if (cmbSize5.getSelectedItem() == "L") {
			price[4] = 270;
			txtPrice5.setText("RM " + df.format(price[4]));
		} else if (cmbSize5.getSelectedItem() == "XL") {
			price[4] = 280;
			txtPrice5.setText("RM " + df.format(price[4]));
		} else if (cmbSize5.getSelectedItem() == "XXL") {
			price[4] = 290;
			txtPrice5.setText("RM " + df.format(price[4]));
		} else {
			price[4] = 0;
			txtPrice5.setText("");
		}

		if (cmbSize6.getSelectedItem() == "S") {
			price[5] = 70;
			txtPrice6.setText("RM " + df.format(price[5]));
		} else if (cmbSize6.getSelectedItem() == "M") {
			price[5] = 75;
			txtPrice6.setText("RM " + df.format(price[5]));
		} else if (cmbSize6.getSelectedItem() == "L") {
			price[5] = 80;
			txtPrice6.setText("RM " + df.format(price[5]));
		} else if (cmbSize6.getSelectedItem() == "XL") {
			price[5] = 85;
			txtPrice6.setText("RM " + df.format(price[5]));
		} else if (cmbSize6.getSelectedItem() == "XXL") {
			price[5] = 90;
			txtPrice6.setText("RM " + df.format(price[5]));
		} else {
			price[5] = 0;
			txtPrice6.setText("");
		}

		if (cmbSize7.getSelectedItem() == "S") {
			price[6] = 85;
			txtPrice7.setText("RM " + df.format(price[6]));
		} else if (cmbSize7.getSelectedItem() == "M") {
			price[6] = 90;
			txtPrice7.setText("RM " + df.format(price[6]));
		} else if (cmbSize7.getSelectedItem() == "L") {
			price[6] = 95;
			txtPrice7.setText("RM " + df.format(price[6]));
		} else if (cmbSize7.getSelectedItem() == "XL") {
			price[6] = 100;
			txtPrice7.setText("RM " + df.format(price[6]));
		} else if (cmbSize7.getSelectedItem() == "XXL") {
			price[6] = 105;
			txtPrice7.setText("RM " + df.format(price[6]));
		} else {
			price[6] = 0;
			txtPrice7.setText("");
		}

		if (cmbSize8.getSelectedItem() == "S") {
			price[7] = 80;
			txtPrice8.setText("RM " + df.format(price[7]));
		} else if (cmbSize8.getSelectedItem() == "M") {
			price[7] = 85;
			txtPrice8.setText("RM " + df.format(price[7]));
		} else if (cmbSize8.getSelectedItem() == "L") {
			price[7] = 90;
			txtPrice8.setText("RM " + df.format(price[7]));
		} else if (cmbSize8.getSelectedItem() == "XL") {
			price[7] = 95;
			txtPrice8.setText("RM " + df.format(price[7]));
		} else if (cmbSize8.getSelectedItem() == "XXL") {
			price[7] = 100;
			txtPrice8.setText("RM " + df.format(price[7]));
		} else {
			price[7] = 0;
			txtPrice8.setText("");
		}

		if (cmbSize9.getSelectedItem() == "S") {
			price[8] = 200;
			txtPrice9.setText("RM " + df.format(price[8]));
		} else if (cmbSize9.getSelectedItem() == "M") {
			price[8] = 210;
			txtPrice9.setText("RM " + df.format(price[8]));
		} else if (cmbSize9.getSelectedItem() == "L") {
			price[8] = 220;
			txtPrice9.setText("RM " + df.format(price[8]));
		} else if (cmbSize9.getSelectedItem() == "XL") {
			price[8] = 230;
			txtPrice9.setText("RM " + df.format(price[8]));
		} else if (cmbSize9.getSelectedItem() == "XXL") {
			price[8] = 240;
			txtPrice9.setText("RM " + df.format(price[8]));
		} else {
			price[8] = 0;
			txtPrice9.setText("");
		}

		if (cmbSize10.getSelectedItem() == "S") {
			price[9] = 100;
			txtPrice10.setText("RM " + df.format(price[9]));
		} else if (cmbSize10.getSelectedItem() == "M") {
			price[9] = 110;
			txtPrice10.setText("RM " + df.format(price[9]));
		} else if (cmbSize10.getSelectedItem() == "L") {
			price[9] = 120;
			txtPrice10.setText("RM " + df.format(price[9]));
		} else if (cmbSize10.getSelectedItem() == "XL") {
			price[9] = 130;
			txtPrice10.setText("RM " + df.format(price[9]));
		} else if (cmbSize10.getSelectedItem() == "XXL") {
			price[9] = 140;
			txtPrice10.setText("RM " + df.format(price[9]));
		} else {
			price[9] = 0;
			txtPrice10.setText("");
		}

		if (event.getSource() == btnBack) {
			UserType fm = new UserType();
			fm.setVisible(true);
			dispose();
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}

		if (event.getSource() == btnCalculate) {
			// Calls the CalculateFees class
			new CalculateFees(choice);
		}

		if (event.getSource() == btnClear) {
			// Calls the ClearAll class
			new ClearAll();
		}

		if (event.getSource() == btnDetails) {
			// Calls the DetailsAll class
			new DetailsAll();
		}

		if (event.getSource() == btnExit) {
			// Exit the program
			dispose();
		}
	}
}
