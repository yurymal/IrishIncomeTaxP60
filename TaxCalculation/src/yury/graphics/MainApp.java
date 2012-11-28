package yury.graphics;

import javax.swing.JApplet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainApp extends JApplet {
	private JTextField totalPaytextField;
	private JTextField taxDeductedTextField;
	private JPanel mainPanel;
	private JTextField payUSCtextField;
	private JTextField USCDeductedTextField;
	private JTextField rentTextField;
	private JTextField totalPaytextFieldSpouse;
	private JTextField taxDeductedTextFieldSpouse;
	private JTextField payUSCtextFieldSpouse;
	private JTextField USCdedactedTextFieldSpouse;
	private JTextField medicalExpencesPaidTextField;
	private JComboBox comboBox;
	private MainApp mainApp;
	private JCheckBox chckbxMedicalCard;
	private JCheckBox chckbxDependentChildren;
	private JCheckBox chckbxMedicalCardSpouse;
	private JLabel totalPayLabel;
	private JLabel taxDeductedLabel;
	private JLabel grossPayUSCLabel;
	private JLabel uscDeductedLabel;
	private JLabel rentPaidMonthlyLabel;
	private JLabel lblMedicalExpencesPaid;
	
	public MainApp() {
		mainApp = this;
		mainPanel = new JPanel();
		
		JPanel buttonPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
							.addGap(2))
						.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
					.addGap(33))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(136, Short.MAX_VALUE)
					.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
		);
		mainPanel.setLayout(null);
		
		totalPayLabel = new JLabel("Total pay");
		totalPayLabel.setBounds(10, 11, 130, 14);
		mainPanel.add(totalPayLabel);
		
		totalPaytextField = new JTextField();
		totalPaytextField.setBounds(166, 8, 86, 20);
		mainPanel.add(totalPaytextField);
		totalPaytextField.setColumns(10);
		
		taxDeductedLabel = new JLabel("Total net tax deducted");
		taxDeductedLabel.setBounds(10, 38, 130, 14);
		mainPanel.add(taxDeductedLabel);
		
		taxDeductedTextField = new JTextField();
		taxDeductedTextField.setBounds(166, 35, 86, 20);
		mainPanel.add(taxDeductedTextField);
		taxDeductedTextField.setColumns(10);
		
		grossPayUSCLabel = new JLabel("Gross pay for USC");
		grossPayUSCLabel.setBounds(10, 63, 130, 14);
		mainPanel.add(grossPayUSCLabel);
		
		payUSCtextField = new JTextField();
		payUSCtextField.setBounds(166, 60, 86, 20);
		mainPanel.add(payUSCtextField);
		payUSCtextField.setColumns(10);
		
		uscDeductedLabel = new JLabel("USC deducted");
		uscDeductedLabel.setBounds(10, 88, 130, 14);
		mainPanel.add(uscDeductedLabel);
		
		USCDeductedTextField = new JTextField();
		USCDeductedTextField.setBounds(166, 85, 86, 20);
		mainPanel.add(USCDeductedTextField);
		USCDeductedTextField.setColumns(10);
		
		rentPaidMonthlyLabel = new JLabel("Rent paid monthly");
		rentPaidMonthlyLabel.setBounds(10, 113, 130, 14);
		mainPanel.add(rentPaidMonthlyLabel);
		
		rentTextField = new JTextField();
		rentTextField.setBounds(166, 110, 86, 20);
		mainPanel.add(rentTextField);
		rentTextField.setColumns(10);
		
		totalPaytextFieldSpouse = new JTextField();
		totalPaytextFieldSpouse.setVisible(false);
		totalPaytextFieldSpouse.setBounds(277, 8, 86, 20);
		mainPanel.add(totalPaytextFieldSpouse);
		totalPaytextFieldSpouse.setColumns(10);
		
		taxDeductedTextFieldSpouse = new JTextField();
		taxDeductedTextFieldSpouse.setVisible(false);
		taxDeductedTextFieldSpouse.setBounds(277, 35, 86, 20);
		mainPanel.add(taxDeductedTextFieldSpouse);
		taxDeductedTextFieldSpouse.setColumns(10);
		
		payUSCtextFieldSpouse = new JTextField();
		payUSCtextFieldSpouse.setVisible(false);
		payUSCtextFieldSpouse.setBounds(277, 60, 86, 20);
		mainPanel.add(payUSCtextFieldSpouse);
		payUSCtextFieldSpouse.setColumns(10);
		
		USCdedactedTextFieldSpouse = new JTextField();
		USCdedactedTextFieldSpouse.setVisible(false);
		USCdedactedTextFieldSpouse.setText("");
		USCdedactedTextFieldSpouse.setBounds(277, 85, 86, 20);
		mainPanel.add(USCdedactedTextFieldSpouse);
		USCdedactedTextFieldSpouse.setColumns(10);
		
		lblMedicalExpencesPaid = new JLabel("Medical expences paid");
		lblMedicalExpencesPaid.setBounds(10, 138, 130, 14);
		mainPanel.add(lblMedicalExpencesPaid);
		
		medicalExpencesPaidTextField = new JTextField();
		medicalExpencesPaidTextField.setBounds(166, 135, 86, 20);
		mainPanel.add(medicalExpencesPaidTextField);
		medicalExpencesPaidTextField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MaritalStatus whatSelected= (MaritalStatus) comboBox.getSelectedItem() ;
				if (whatSelected==MaritalStatus.MarriedTwoIncomes)makeSpouseTextFieldsVisiable(true);
				else makeSpouseTextFieldsVisiable(false);
			}	
			
		});
		comboBox.setModel(new DefaultComboBoxModel(MaritalStatus.values()));
		comboBox.setBounds(166, 178, 167, 20);
		comboBox.setSelectedItem(MaritalStatus.Single);
		mainPanel.add(comboBox);
		
		JLabel lblMaritalStatus = new JLabel("Marital status");
		lblMaritalStatus.setBounds(10, 181, 130, 14);
		mainPanel.add(lblMaritalStatus);
		
		chckbxMedicalCard = new JCheckBox("Do you have medical card ?");
		chckbxMedicalCard.setBounds(10, 222, 167, 23);
		mainPanel.add(chckbxMedicalCard);
		
		chckbxDependentChildren = new JCheckBox("Do you have dependent children ?");
		chckbxDependentChildren.setBounds(10, 248, 194, 23);
		mainPanel.add(chckbxDependentChildren);
		
		chckbxMedicalCardSpouse = new JCheckBox("Does your spouse have medical card ?");
		chckbxMedicalCardSpouse.setVisible(false);
		chckbxMedicalCardSpouse.setBounds(185, 222, 194, 23);
		mainPanel.add(chckbxMedicalCardSpouse);
		
		JButton calculateButton = new JButton("CALCULATE");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Input input= new Input();
				if (
				input.setMedicalExpencies(medicalExpencesPaidTextField.getText())){
					lblMedicalExpencesPaid.setForeground(Color.black);
				}else lblMedicalExpencesPaid.setForeground(Color.red);
					
				input.setGrossPayUSC(payUSCtextField.getText());
				input.setGrossPayUSCSpuse(payUSCtextFieldSpouse.getText());
				input.setRentPaid(rentTextField.getText());
				input.setTaxDeductedSpouse(taxDeductedTextFieldSpouse.getText());
				input.setTaxDeducted(taxDeductedTextField.getText());
				input.setTotalPay(totalPaytextField.getText());
				input.setTotalPaySpouse(totalPaytextFieldSpouse.getText());
				input.setUSCdeucted(USCDeductedTextField.getText());
				input.setUSCdeuctedSpouse(USCdedactedTextFieldSpouse.getText());
				
				
				input.setMaritalStatus(((MaritalStatus) comboBox.getSelectedItem()));
				input.setDependentChildren(chckbxDependentChildren.isSelected());
				input.setMedicalCardHolder(chckbxMedicalCard.isSelected());
				
				
				System.out.println("we have sent input");
			}
		});
		buttonPanel.add(calculateButton);
		getContentPane().setLayout(groupLayout);
	}
	private void makeSpouseTextFieldsVisiable(boolean flag) {
		totalPaytextFieldSpouse.setVisible(flag);
		taxDeductedTextFieldSpouse.setVisible(flag);
		payUSCtextFieldSpouse.setVisible(flag);
		USCdedactedTextFieldSpouse.setVisible(flag);
		//chckbxMedicalCardSpouse.setVisible(flag);
	}
}
}