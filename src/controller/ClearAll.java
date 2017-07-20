package controller;

import javax.swing.UIManager;

import view.FeesCalculation;
/**
* The ClearAll class will clear all the
* input from user
*
* @author  Azizul and Hafiz
* @version 1.0
* @since   2015-11-01 
*/
public class ClearAll {
	{
		//Clear all selected JCheckBox
		FeesCalculation.chkType1.setSelected(false);
		FeesCalculation.chkType2.setSelected(false);
		FeesCalculation.chkType3.setSelected(false);
		FeesCalculation.chkType4.setSelected(false);
		FeesCalculation.chkType5.setSelected(false);
		FeesCalculation.chkType6.setSelected(false);
		FeesCalculation.chkType7.setSelected(false);
		FeesCalculation.chkType8.setSelected(false);
		FeesCalculation.chkType9.setSelected(false);
		FeesCalculation.chkType10.setSelected(false);
		
		//Clear all selected JComboBox
		FeesCalculation.cmbSize1.setSelectedIndex(0);
		FeesCalculation.cmbSize2.setSelectedIndex(0);
		FeesCalculation.cmbSize3.setSelectedIndex(0);
		FeesCalculation.cmbSize4.setSelectedIndex(0);
		FeesCalculation.cmbSize5.setSelectedIndex(0);
		FeesCalculation.cmbSize6.setSelectedIndex(0);
		FeesCalculation.cmbSize7.setSelectedIndex(0);
		FeesCalculation.cmbSize8.setSelectedIndex(0);
		FeesCalculation.cmbSize9.setSelectedIndex(0);
		FeesCalculation.cmbSize10.setSelectedIndex(0);
		
		//Clear all JTextField for txtPrice and txtTotalPrice
		FeesCalculation.txtPrice1.setText("RM ");
		FeesCalculation.txtPrice2.setText("RM ");
		FeesCalculation.txtPrice3.setText("RM ");
		FeesCalculation.txtPrice4.setText("RM ");
		FeesCalculation.txtPrice5.setText("RM ");
		FeesCalculation.txtPrice6.setText("RM ");
		FeesCalculation.txtPrice7.setText("RM ");
		FeesCalculation.txtPrice8.setText("RM ");
		FeesCalculation.txtPrice9.setText("RM ");
		FeesCalculation.txtPrice10.setText("RM ");
		FeesCalculation.txtTotalPrice.setText("RM ");
		
		//Clear all JTextField for txtQty
		FeesCalculation.txtQty1.setText("");
		FeesCalculation.txtQty2.setText("");
		FeesCalculation.txtQty3.setText("");
		FeesCalculation.txtQty4.setText("");
		FeesCalculation.txtQty5.setText("");
		FeesCalculation.txtQty6.setText("");
		FeesCalculation.txtQty7.setText("");
		FeesCalculation.txtQty8.setText("");
		FeesCalculation.txtQty9.setText("");
		FeesCalculation.txtQty10.setText("");
		
		FeesCalculation.btnDetails.setEnabled(false);
		FeesCalculation.btnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				FeesCalculation.btnDetails.setBackground(UIManager.getColor("control"));
				FeesCalculation.btnDetails.setForeground(UIManager.getColor("textText"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				FeesCalculation.btnDetails.setBackground(UIManager.getColor("control"));
				FeesCalculation.btnDetails.setForeground(UIManager.getColor("textText"));
			}
		});
	}
}
