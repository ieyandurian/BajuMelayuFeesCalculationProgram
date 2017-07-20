package controller;

import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import view.FeesCalculation;

public class CalculateFees {

	double[] price = new double[10];

	int choice;

	DecimalFormat df = new DecimalFormat("0.00");

	// Initialize the data
	double totalAll = 0;
	double discountUser = 0;
	String printType = "";
	String print1 = "";
	String print2 = "";
	String print3 = "";
	String print4 = "";
	String print5 = "";
	String print6 = "";
	String print7 = "";
	String print8 = "";
	String print9 = "";
	String print10 = "";
	String print11 = "";
	String printDisUser = "";
	String printDis1 = "";
	String printDis2 = "";
	String printDis3 = "";
	String printDis4 = "";
	String printDis5 = "";
	String printDis6 = "";
	String printDis7 = "";
	String printDis8 = "";
	String printDis9 = "";
	String printDis10 = "";
	static String output = "";

	// Initialize the data
	String size1 = null;
	String size2 = null;
	String size3 = null;
	String size4 = null;
	String size5 = null;
	String size6 = null;
	String size7 = null;
	String size8 = null;
	String size9 = null;
	String size10 = null;

	public CalculateFees(int c) {
		choice = c;
		// Condition Initialize the data to price and size
		if (FeesCalculation.cmbSize1.getSelectedItem() == "S") {
			price[0] = 85;
			size1 = "S";
		} else if (FeesCalculation.cmbSize1.getSelectedItem() == "M") {
			price[0] = 90;
			size1 = "M";
		} else if (FeesCalculation.cmbSize1.getSelectedItem() == "L") {
			price[0] = 95;
			size1 = "L";
		} else if (FeesCalculation.cmbSize1.getSelectedItem() == "XL") {
			price[0] = 100;
			size1 = "XL";
		} else if (FeesCalculation.cmbSize1.getSelectedItem() == "XXL") {
			price[0] = 105;
			size1 = "XXL";
		}

		if (FeesCalculation.cmbSize2.getSelectedItem() == "S") {
			price[1] = 110;
			size2 = "S";
		} else if (FeesCalculation.cmbSize2.getSelectedItem() == "M") {
			price[1] = 120;
			size2 = "M";
		} else if (FeesCalculation.cmbSize2.getSelectedItem() == "L") {
			price[1] = 130;
			size2 = "L";
		} else if (FeesCalculation.cmbSize2.getSelectedItem() == "XL") {
			price[1] = 140;
			size2 = "XL";
		} else if (FeesCalculation.cmbSize2.getSelectedItem() == "XXL") {
			price[1] = 150;
			size2 = "XXL";
		}

		if (FeesCalculation.cmbSize3.getSelectedItem() == "S") {
			price[2] = 180;
			size3 = "S";
		} else if (FeesCalculation.cmbSize3.getSelectedItem() == "M") {
			price[2] = 190;
			size3 = "M";
		} else if (FeesCalculation.cmbSize3.getSelectedItem() == "L") {
			price[2] = 200;
			size3 = "L";
		} else if (FeesCalculation.cmbSize3.getSelectedItem() == "XL") {
			price[2] = 210;
			size3 = "XL";
		} else if (FeesCalculation.cmbSize3.getSelectedItem() == "XXL") {
			price[2] = 220;
			size3 = "XXL";
		}

		if (FeesCalculation.cmbSize4.getSelectedItem() == "S") {
			price[3] = 65;
			size4 = "S";
		} else if (FeesCalculation.cmbSize4.getSelectedItem() == "M") {
			price[3] = 70;
			size4 = "M";
		} else if (FeesCalculation.cmbSize4.getSelectedItem() == "L") {
			price[3] = 75;
			size4 = "L";
		} else if (FeesCalculation.cmbSize4.getSelectedItem() == "XL") {
			price[3] = 80;
			size4 = "XL";
		} else if (FeesCalculation.cmbSize4.getSelectedItem() == "XXL") {
			price[3] = 85;
			size4 = "XXL";
		}

		if (FeesCalculation.cmbSize5.getSelectedItem() == "S") {
			price[4] = 250;
			size5 = "S";
		} else if (FeesCalculation.cmbSize5.getSelectedItem() == "M") {
			price[4] = 260;
			size5 = "M";
		} else if (FeesCalculation.cmbSize5.getSelectedItem() == "L") {
			price[4] = 270;
			size5 = "L";
		} else if (FeesCalculation.cmbSize5.getSelectedItem() == "XL") {
			price[4] = 280;
			size5 = "XL";
		} else if (FeesCalculation.cmbSize5.getSelectedItem() == "XXL") {
			price[4] = 290;
			size5 = "XXL";
		}

		if (FeesCalculation.cmbSize6.getSelectedItem() == "S") {
			price[5] = 70;
			size6 = "S";
		} else if (FeesCalculation.cmbSize6.getSelectedItem() == "M") {
			price[5] = 75;
			size6 = "M";
		} else if (FeesCalculation.cmbSize6.getSelectedItem() == "L") {
			price[5] = 80;
			size6 = "L";
		} else if (FeesCalculation.cmbSize6.getSelectedItem() == "XL") {
			price[5] = 85;
			size6 = "XL";
		} else if (FeesCalculation.cmbSize6.getSelectedItem() == "XXL") {
			price[5] = 90;
			size6 = "XXL";
		}

		if (FeesCalculation.cmbSize7.getSelectedItem() == "S") {
			price[6] = 85;
			size7 = "S";
		} else if (FeesCalculation.cmbSize7.getSelectedItem() == "M") {
			price[6] = 90;
			size7 = "M";
		} else if (FeesCalculation.cmbSize7.getSelectedItem() == "L") {
			price[6] = 95;
			size7 = "L";
		} else if (FeesCalculation.cmbSize7.getSelectedItem() == "XL") {
			price[6] = 100;
			size7 = "XL";
		} else if (FeesCalculation.cmbSize7.getSelectedItem() == "XXL") {
			price[6] = 105;
			size7 = "XXL";
		}

		if (FeesCalculation.cmbSize8.getSelectedItem() == "S") {
			price[7] = 80;
			size8 = "S";
		} else if (FeesCalculation.cmbSize8.getSelectedItem() == "M") {
			price[7] = 85;
			size8 = "M";
		} else if (FeesCalculation.cmbSize8.getSelectedItem() == "L") {
			price[7] = 90;
			size8 = "L";
		} else if (FeesCalculation.cmbSize8.getSelectedItem() == "XL") {
			price[7] = 95;
			size8 = "XL";
		} else if (FeesCalculation.cmbSize8.getSelectedItem() == "XXL") {
			price[7] = 100;
			size8 = "XXL";
		}

		if (FeesCalculation.cmbSize9.getSelectedItem() == "S") {
			price[8] = 200;
			size9 = "S";
		} else if (FeesCalculation.cmbSize9.getSelectedItem() == "M") {
			price[8] = 210;
			size9 = "M";
		} else if (FeesCalculation.cmbSize9.getSelectedItem() == "L") {
			price[8] = 220;
			size9 = "L";
		} else if (FeesCalculation.cmbSize9.getSelectedItem() == "XL") {
			price[8] = 230;
			size9 = "XL";
		} else if (FeesCalculation.cmbSize9.getSelectedItem() == "XXL") {
			price[8] = 240;
			size9 = "XXL";
		}

		if (FeesCalculation.cmbSize10.getSelectedItem() == "S") {
			price[9] = 100;
			size10 = "S";
		} else if (FeesCalculation.cmbSize10.getSelectedItem() == "M") {
			price[9] = 110;
			size10 = "M";
		} else if (FeesCalculation.cmbSize10.getSelectedItem() == "L") {
			price[9] = 120;
			size10 = "L";
		} else if (FeesCalculation.cmbSize10.getSelectedItem() == "XL") {
			price[9] = 130;
			size10 = "XL";
		} else if (FeesCalculation.cmbSize10.getSelectedItem() == "XXL") {
			price[9] = 140;
			size10 = "XXL";
		}
		// Condition to check selected items
		if (FeesCalculation.chkType1.isSelected()
				|| FeesCalculation.chkType2.isSelected()
				|| FeesCalculation.chkType3.isSelected()
				|| FeesCalculation.chkType4.isSelected()
				|| FeesCalculation.chkType5.isSelected()
				|| FeesCalculation.chkType6.isSelected()
				|| FeesCalculation.chkType7.isSelected()
				|| FeesCalculation.chkType8.isSelected()
				|| FeesCalculation.chkType9.isSelected()
				|| FeesCalculation.chkType10.isSelected()) {
			// Condition to check selected sizes
			if (size1 != null || size2 != null || size3 != null
					|| size4 != null || size5 != null || size6 != null
					|| size7 != null || size8 != null || size9 != null
					|| size10 != null) {
				// Condition to check quantity values
				if (!FeesCalculation.txtQty1.getText().isEmpty()
						|| !FeesCalculation.txtQty2.getText().isEmpty()
						|| !FeesCalculation.txtQty3.getText().isEmpty()
						|| !FeesCalculation.txtQty4.getText().isEmpty()
						|| !FeesCalculation.txtQty5.getText().isEmpty()
						|| !FeesCalculation.txtQty6.getText().isEmpty()
						|| !FeesCalculation.txtQty7.getText().isEmpty()
						|| !FeesCalculation.txtQty8.getText().isEmpty()
						|| !FeesCalculation.txtQty9.getText().isEmpty()
						|| !FeesCalculation.txtQty10.getText().isEmpty()) {
					// Condition to check quantity values
					if (!FeesCalculation.txtQty1.getText().matches("[^1-9]+$")
							&& !FeesCalculation.txtQty2.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty3.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty4.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty5.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty6.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty7.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty8.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty9.getText().matches(
									"[^1-9]+$")
							&& !FeesCalculation.txtQty10.getText().matches(
									"[^1-9]+$")) {
						// Condition to check quantity values
						if (!FeesCalculation.txtQty1.getText().matches(
								".*[^0-9].*")
								&& !FeesCalculation.txtQty2.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty3.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty4.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty5.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty6.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty7.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty8.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty9.getText().matches(
										".*[^0-9].*")
								&& !FeesCalculation.txtQty10.getText().matches(
										".*[^0-9].*")) {
							// Condition to check user types
							if (c == 1) {
								discountUser = 0.90;
								printType = "\nCustomer Type : Student";
								printDisUser = "\nCustomer Type Discount : 10%";
							} else if (c == 2) {
								discountUser = 0.90;
								printType = "\nCustomer Type : Senior Citizen";
								printDisUser = "\nCustomer Type Discount : 10%";
							} else if (c == 3) {
								discountUser = 1;
								printType = "\nCustomer Type : Other";
								printDisUser = "\nCustomer Type Discount : None";
							}
							if (FeesCalculation.chkType1.isSelected()) {
								if (size1 != null) {
									if (!FeesCalculation.txtQty1.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty1.getText()
												.matches("[^1-9]+$")) {
											double total1 = 0;
											int quantity1 = Integer
													.parseInt(FeesCalculation.txtQty1
															.getText());
											if (quantity1 >= 10) {
												total1 = (price[0] * quantity1) * (0.95);
												printDis1 = "\nQuantity Discount : 5%";
											}

											else {
												total1 = price[0] * quantity1;
												printDis1 = "\nQuantity Discount : None";
											}

											totalAll = totalAll + total1;

											print1 = "\n========================================================="
													+ "\nType : Baju Melayu Aron Aziz"
													+ "\nSize : "
													+ size1
													+ "\nPrice : RM"
													+ df.format(price[0])
													+ "\nQuantity :"
													+ quantity1
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total1)
													+ printDis1;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Aron Aziz");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Aron Aziz");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Aron Aziz");
								}
							}

							if (FeesCalculation.chkType2.isSelected()) {
								if (size2 != null) {
									if (!FeesCalculation.txtQty2.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty2.getText()
												.matches("[^1-9]+$")) {
											double total2 = 0;
											int quantity2 = Integer
													.parseInt(FeesCalculation.txtQty2
															.getText());
											if (quantity2 >= 10) {
												total2 = (price[1] * quantity2) * (0.95);
												printDis2 = "\nQuantity Discount : 5%";
											} else {
												total2 = price[1] * quantity2;
												printDis2 = "\nQuantity Discount : None";
											}

											totalAll = totalAll + total2;

											print2 = "\n========================================================="
													+ "\nType : Baju Melayu Epaulette"
													+ "\nSize : "
													+ size2
													+ "\nPrice : RM"
													+ df.format(price[1])
													+ "\nQuantity :"
													+ quantity2
													+ printDisUser
													+ printType
													+ "\nTotal Price : RM"
													+ df.format(total2)
													+ printDis2;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Epaulette");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Epaulette");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Epaulette");
								}

							}

							if (FeesCalculation.chkType3.isSelected()) {
								if (size3 != null) {
									if (!FeesCalculation.txtQty3.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty3.getText()
												.matches("[^1-9]+$")) {
											double total3 = 0;
											int quantity3 = Integer
													.parseInt(FeesCalculation.txtQty3
															.getText());

											if (quantity3 >= 10) {
												total3 = (price[2] * quantity3) * (0.95);
												printDis3 = "\nQuantity Discount : 5%";
											} else {
												total3 = price[2] * quantity3;
												printDis3 = "\nQuantity Discount : None";
											}

											totalAll = totalAll + total3;

											print3 = "\n========================================================="
													+ "\nType : Baju Melayu Hipster"
													+ "\nSize : "
													+ size3
													+ "\nPrice : RM"
													+ df.format(price[2])
													+ "\nQuantity :"
													+ quantity3
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total3)
													+ printDis3;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Hipster");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Hipster");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Hipster");
								}
							}

							if (FeesCalculation.chkType4.isSelected()) {
								if (size4 != null) {
									if (!FeesCalculation.txtQty4.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty4.getText()
												.matches("[^1-9]+$")) {
											double total4 = 0;
											int quantity4 = Integer
													.parseInt(FeesCalculation.txtQty4
															.getText());

											if (quantity4 >= 10) {
												total4 = (price[3] * quantity4) * (0.95);
												printDis4 = "\nQuantity Discount : 5%";
											} else {
												total4 = price[3] * quantity4;
												printDis4 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total4;

											print4 = "\n========================================================="
													+ "\nType : Baju Melayu Johor"
													+ "\nSize : "
													+ size4
													+ "\nPrice : RM"
													+ df.format(price[3])
													+ "\nQuantity :"
													+ quantity4
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total4)
													+ printDis4;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Johor");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Johor");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Johor");
								}
							}

							if (FeesCalculation.chkType5.isSelected()) {
								if (size5 != null) {
									if (!FeesCalculation.txtQty5.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty5.getText()
												.matches("[^1-9]+$")) {
											double total5 = 0;
											int quantity5 = Integer
													.parseInt(FeesCalculation.txtQty5
															.getText());

											if (quantity5 >= 10) {
												total5 = (price[4] * quantity5) * (0.95);
												printDis5 = "\nQuantity Discount : 5%";
											} else {
												total5 = price[4] * quantity5;
												printDis5 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total5;

											print5 = "\n========================================================="
													+ "\nType : Baju Melayu Kurta"
													+ "\nSize : "
													+ size5
													+ "\nPrice : RM"
													+ df.format(price[4])
													+ "\nQuantity :"
													+ quantity5
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total5)
													+ printDis5;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Kurta");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Kurta");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Kurta");
								}
							}

							if (FeesCalculation.chkType6.isSelected()) {
								if (size6 != null) {
									if (!FeesCalculation.txtQty6.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty6.getText()
												.matches("[^1-9]+$")) {
											double total6 = 0;
											int quantity6 = Integer
													.parseInt(FeesCalculation.txtQty6
															.getText());

											if (quantity6 >= 10) {
												total6 = (price[5] * quantity6) * (0.95);
												printDis6 = "\nQuantity Discount : 5%";
											} else {
												total6 = price[5] * quantity6;
												printDis6 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total6;

											print6 = "\n========================================================="
													+ "\nType : Baju Melayu Riau"
													+ "\nSize : "
													+ size6
													+ "\nPrice : RM"
													+ df.format(price[5])
													+ "\nQuantity :"
													+ quantity6
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total6)
													+ printDis6;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Riau");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Riau");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Riau");
								}

							}

							if (FeesCalculation.chkType7.isSelected()) {
								if (size7 != null) {
									if (!FeesCalculation.txtQty7.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty7.getText()
												.matches("[^1-9]+$")) {
											double total7 = 0;
											int quantity7 = Integer
													.parseInt(FeesCalculation.txtQty7
															.getText());

											if (quantity7 >= 10) {
												total7 = (price[6] * quantity7) * (0.95);
												printDis7 = "\nQuantity Discount : 5%";
											} else {
												total7 = price[6] * quantity7;
												printDis7 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total7;

											print7 = "\n========================================================="
													+ "\nType : Baju Melayu Tradisi"
													+ "\nSize : "
													+ size7
													+ "\nPrice : RM"
													+ df.format(price[6])
													+ "\nQuantity :"
													+ quantity7
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total7)
													+ printDis7;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Tradisi");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Tradisi");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Tradisi");
								}
							}

							if (FeesCalculation.chkType8.isSelected()) {
								if (size8 != null) {
									if (!FeesCalculation.txtQty8.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty8.getText()
												.matches("[^1-9]+$")) {
											double total8 = 0;
											int quantity8 = Integer
													.parseInt(FeesCalculation.txtQty8
															.getText());

											if (quantity8 >= 10) {
												total8 = (price[7] * quantity8) * (0.95);
												printDis8 = "\nQuantity Discount : 5%";
											} else {
												total8 = price[7] * quantity8;
												printDis8 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total8;

											print8 = "\n========================================================="
													+ "\nType : Baju Melayu Pengantin"
													+ "\nSize : "
													+ size8
													+ "\nPrice : RM"
													+ df.format(price[7])
													+ "\nQuantity :"
													+ quantity8
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total8)
													+ printDis8;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Pengantin");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Pengantin");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Pengantin");
								}

							}
							if (FeesCalculation.chkType9.isSelected()) {
								if (size9 != null) {
									if (!FeesCalculation.txtQty9.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty9.getText()
												.matches("[^1-9]+$")) {
											double total9 = 0;
											int quantity9 = Integer
													.parseInt(FeesCalculation.txtQty9
															.getText());

											if (quantity9 >= 10) {
												total9 = (price[8] * quantity9) * (0.95);
												printDis9 = "\nQuantity Discount : 5%";
											} else {
												total9 = price[8] * quantity9;
												printDis9 = "\nQuantity Discount : None";
											}
											totalAll = totalAll + total9;

											print9 = "\n========================================================="
													+ "\nType : Baju Melayu Zibra"
													+ "\nSize : "
													+ size9
													+ "\nPrice : RM"
													+ df.format(price[8])
													+ "\nQuantity :"
													+ quantity9
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total9)
													+ printDis9;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Zibra");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Zibra");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Zibra");
								}
							}

							if (FeesCalculation.chkType10.isSelected()) {
								if (size10 != null) {
									if (!FeesCalculation.txtQty10.getText()
											.isEmpty()) {
										if (!FeesCalculation.txtQty10.getText()
												.matches("[^1-9]+$")) {
											double total10 = 0;
											int quantity10 = Integer
													.parseInt(FeesCalculation.txtQty10
															.getText());

											if (quantity10 >= 10) {
												total10 = (price[9] * quantity10) * (0.95);
												printDis10 = "\nQuantity Discount : 5%";
											} else {
												total10 = price[9] * quantity10;
												printDis10 = "\nQuantity Discount : None";
											}

											totalAll = totalAll + total10;

											print10 = "\n========================================================="
													+ "\nType : Baju Melayu Zapin"
													+ "\nSize : "
													+ size10
													+ "\nPrice : RM"
													+ df.format(price[9])
													+ "\nQuantity :"
													+ quantity10
													+ printType
													+ printDisUser
													+ "\nTotal Price : RM"
													+ df.format(total10)
													+ printDis10;
										} else {
											JOptionPane
													.showMessageDialog(
															null,
															"Please insert quantity in appropriate amount in number format for Baju Melayu Zapin");
										}
									} else {
										JOptionPane
												.showMessageDialog(null,
														"Please insert quantity for Baju Melayu Zapin");
									}
								} else {
									JOptionPane
											.showMessageDialog(null,
													"Please select Baju Melayu size for Baju Melayu Zapin");
								}
							}

							totalAll = totalAll * (discountUser);
							FeesCalculation.txtTotalPrice.setText("RM "
									+ df.format(totalAll));

							print11 = "\n========================================================="
									+ "\n\nSum of Total : RM "
									+ df.format(totalAll);
							// Initialize output
							output = print1 + print2 + print3 + print4 + print5
									+ print6 + print7 + print8 + print9
									+ print10 + print11;

							FeesCalculation.btnDetails.setEnabled(true);
							FeesCalculation.btnDetails
									.addMouseListener(new java.awt.event.MouseAdapter() {
										public void mouseEntered(
												java.awt.event.MouseEvent evt) {
											FeesCalculation.btnDetails
													.setBackground(Color.LIGHT_GRAY);
											FeesCalculation.btnDetails
													.setForeground(Color.BLACK);
										}

										public void mouseExited(
												java.awt.event.MouseEvent evt) {
											FeesCalculation.btnDetails.setBackground(UIManager
													.getColor("control"));
											FeesCalculation.btnDetails.setForeground(UIManager
													.getColor("textText"));
										}
									});

						} else {
							JOptionPane
									.showMessageDialog(null,
											"Please insert quantity in appropriate amount in number format");
						}

					} else {
						JOptionPane
								.showMessageDialog(null,
										"Please insert quantity in appropriate amount in number format");
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"Please insert quantity");
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"Please select Baju Melayu size");
			}
			// Condition if items not selected
		} else if (!FeesCalculation.chkType1.isSelected()
				&& !FeesCalculation.chkType2.isSelected()
				&& !FeesCalculation.chkType3.isSelected()
				&& !FeesCalculation.chkType4.isSelected()
				&& !FeesCalculation.chkType5.isSelected()
				&& !FeesCalculation.chkType6.isSelected()
				&& !FeesCalculation.chkType7.isSelected()
				&& !FeesCalculation.chkType8.isSelected()
				&& !FeesCalculation.chkType9.isSelected()
				&& !FeesCalculation.chkType10.isSelected()) {
			JOptionPane.showMessageDialog(null, "Please select a Baju Melayu");
			new ClearAll();
		}
	}

}
