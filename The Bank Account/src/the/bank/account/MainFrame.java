package the.bank.account;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

		JFrame mainFrame;
		
		JPanel panelOne;
		JPanel panelTwo;
		
		JLabel accountTypeTitleLabel;
		JLabel amountTitleLabel;
		JLabel currentAccountAmountLabel;
		JLabel savingsAccountAmountLabel;
		JLabel creditCardAccountAmountLabel;

		JTextField depositToCurrentAccountTextField;
		JTextField depositToSavingsAccountTextField;
		JTextField depositToCreditCardAccountTextField;
		JTextField withdrawFromCurrentAccountTextField;
		JTextField withdrawFromSavingsAccountTextField;
		JTextField withdrawFromCreditCardAccountTextField;
	
		JRadioButton currentAccountRadioButton;
		JRadioButton savingsAccountRadioButton;
		JRadioButton creditCardAccountRadioButton;
		JRadioButton depositRadioButton;
		JRadioButton withdrawRadioButton;
		
		JButton addButton;
		
		String depositToCurrentAccountString;
//		int depositToCurrentAccountValue;
		static int currentAccountAmount = 0;
		static int creditCardAccountAmount = -20;
		
		private static final int FRAME_WIDTH = 500;
		private static final int FRAME_HEIGHT = 250;
		private static final int FRAME_X_LOCATION = 100;
		private static final int FRAME_Y_LOCATION = 100;
		private static final int PANEL_WIDTH = 230;
		private static final int PANEL_HEIGHT = 200;
		private static final int PANEL_ONE_X_LOCATION = 10;
		private static final int PANEL_ONE_Y_LOCATION = 10;
		private static final int PANEL_TWO_X_LOCATION = 250;
		private static final int PANEL_TWO_Y_LOCATION = 10;
		
		
		public MainFrame(){

			createFrame();
			
			createPanelOne();
			createPanelTwo();
			
			createAccountTypeTitleLabel();
			createAmountTitleLabel();
			createCurrentAccountAmountLabel();
			createSavingsAccountAmountLabel();
			createCreditCardAccountAmountLabel();
			
			createDepositToCurrentAccountTextField();
			createDepositToSavingsAccountTextField();
			createDepositToCreditCardAccountTextField();
			createWithdrawFromCurrentAccountTextField();
			createWithdrawFromSavingsAccountTextField();
			createWithdrawFromCreditCardAccountTextField();
			
			createCurrentAccountRadioButton();
			createSavingsAccountRadioButton();
			createCreditCardAccountRadioButton();
			
			createDepositRadioButton();
			createWithdrawRadioButton();
			
			createGroupOfRadioButtonsForPanelOne();
			createGroupOfRadioButtonsForPanelTwo();
			
			createAddButton();
			
			paintingEverything();
			
		}
	
		public void createFrame(){ // creating  frame
			
			mainFrame = new JFrame("Welcome to your bank account.");
			mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
			mainFrame.setLocation(FRAME_X_LOCATION, FRAME_Y_LOCATION);
			mainFrame.setResizable(false);
			mainFrame.setLayout(null);
			
		}
		
		public void createPanelOne(){ // createing left panel
			
			panelOne = new JPanel();
			panelOne.setSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
			panelOne.setLocation(PANEL_ONE_X_LOCATION, PANEL_ONE_Y_LOCATION);
			panelOne.setBorder(BorderFactory.createTitledBorder("Your accounts:"));
			panelOne.setLayout(null);
			mainFrame.add(panelOne);
			
			
			
		}
	
		public void createPanelTwo(){ // creating right panel
			
			panelTwo = new JPanel();
			panelTwo.setSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
			panelTwo.setLocation(PANEL_TWO_X_LOCATION, PANEL_TWO_Y_LOCATION);
			panelTwo.setBorder(BorderFactory.createTitledBorder("Operations:"));
			panelTwo.setLayout(null);
			mainFrame.add(panelTwo);
			
			
			
		}
	
		public void createAccountTypeTitleLabel(){ // left panel: left column title
			
			accountTypeTitleLabel = new JLabel("Account type:");
			accountTypeTitleLabel.setBounds(20, 20, 80, 20);
			panelOne.add(accountTypeTitleLabel);
			
		}
		
		public void createAmountTitleLabel(){ // left panel: right column title
			
			amountTitleLabel = new JLabel("Amount:");
			amountTitleLabel.setBounds(140, 20, 80, 20);
			panelOne.add(amountTitleLabel);
			
		}
		
		public void createCurrentAccountAmountLabel(){ // left panel: right column: row 1
			
			currentAccountAmountLabel = new JLabel();
			currentAccountAmountLabel.setBounds(140, 50, 100, 20);
			panelOne.add(amountTitleLabel);
	//		currentAccountAmountLabel.setText(Integer.toString(currentAccountAmount));
			
		}
		
		public void createSavingsAccountAmountLabel(){ // left panel: right column: row 2
			
			savingsAccountAmountLabel = new JLabel("2");
			savingsAccountAmountLabel.setBounds(140, 80, 100, 20);
			panelOne.add(savingsAccountAmountLabel);
			
		}

		public void createCreditCardAccountAmountLabel(){ // left panel: right column: row 3
	

			creditCardAccountAmountLabel = new JLabel();
			creditCardAccountAmountLabel.setBounds(140, 110, 100, 20);
			panelOne.add(creditCardAccountAmountLabel);
			creditCardAccountAmountLabel.setText(Integer.toString(creditCardAccountAmount));
			
//			if(creditCardAccountAmount <= 1){
				creditCardAccountAmountLabel.setOpaque(true);
				creditCardAccountAmountLabel.setBackground(Color.red);
				//creditCardAccountAmountLabel.setForeground(Color.red);
	//		}
			
			
	
		}
		
		public void createDepositToCurrentAccountTextField(){ // right panel: left column: row 1
			
			depositToCurrentAccountTextField = new JTextField();
			depositToCurrentAccountTextField.setBounds(20, 50, 80, 20);
			panelTwo.add(depositToCurrentAccountTextField);
			
		}
		
		public void createDepositToSavingsAccountTextField(){ // right panel: left column: row 2
			
			depositToSavingsAccountTextField = new JTextField();
			depositToSavingsAccountTextField.setBounds(20, 80, 80, 20);
			panelTwo.add(depositToSavingsAccountTextField);

		}
		
		public void createDepositToCreditCardAccountTextField(){ // right panel: left column: row 3
			
			depositToCreditCardAccountTextField = new JTextField();
			depositToCreditCardAccountTextField.setBounds(20, 110, 80, 20);
			panelTwo.add(depositToCreditCardAccountTextField);

		}
		
		public void createWithdrawFromCurrentAccountTextField(){ // right panel: right column: row 1
			
			withdrawFromCurrentAccountTextField = new JTextField();
			withdrawFromCurrentAccountTextField.setBounds(140, 50, 80, 20);
			panelTwo.add(withdrawFromCurrentAccountTextField);

		}
		
		public void createWithdrawFromSavingsAccountTextField(){ // right panel: right column: row 2
			
			withdrawFromSavingsAccountTextField = new JTextField();
			withdrawFromSavingsAccountTextField.setBounds(140, 80, 80, 20);
			panelTwo.add(withdrawFromSavingsAccountTextField);

		}
		
		public void createWithdrawFromCreditCardAccountTextField(){ // right panel: right column: row 3
			
			withdrawFromCreditCardAccountTextField = new JTextField();
			withdrawFromCreditCardAccountTextField.setBounds(140, 110, 80, 20);
			panelTwo.add(withdrawFromCreditCardAccountTextField);

		}
		
		public void createCurrentAccountRadioButton(){
			
			currentAccountRadioButton = new JRadioButton("Current");
			currentAccountRadioButton.setBounds(20, 50, 80, 20);
			panelOne.add(currentAccountRadioButton);
			
			
		}
		
		public void createSavingsAccountRadioButton(){
			
			savingsAccountRadioButton = new JRadioButton("Savings");
			savingsAccountRadioButton.setBounds(20, 80, 80, 20);
			panelOne.add(savingsAccountRadioButton);

		}
		
		public void createCreditCardAccountRadioButton(){
			
			creditCardAccountRadioButton = new JRadioButton("Credit Card");
			creditCardAccountRadioButton.setBounds(20, 110, 100, 20);
			panelOne.add(creditCardAccountRadioButton);

		}
		
		public void createGroupOfRadioButtonsForPanelOne(){
			
			ButtonGroup groupAccountChoosing = new ButtonGroup();
			groupAccountChoosing.add(currentAccountRadioButton);
			groupAccountChoosing.add(savingsAccountRadioButton);
			groupAccountChoosing.add(creditCardAccountRadioButton);
			
		}
		
		public void createDepositRadioButton(){
			
			depositRadioButton = new JRadioButton("Deposit");
			depositRadioButton.setBounds(20, 20, 80, 20);
			panelTwo.add(depositRadioButton);
			
		}
		
		public void createWithdrawRadioButton(){
			
			withdrawRadioButton = new JRadioButton("Withdraw");
			withdrawRadioButton.setBounds(140, 20, 80, 20);
			panelTwo.add(withdrawRadioButton);
			
		}
		
		public void createGroupOfRadioButtonsForPanelTwo(){
			
			ButtonGroup groupWithdrawOrDeposit = new ButtonGroup();
			groupWithdrawOrDeposit.add(depositRadioButton);
			groupWithdrawOrDeposit.add(withdrawRadioButton);
			
		}
		
		public void createAddButton(){
			
			addButton = new JButton("Confirm.");
			addButton.setBounds(100, 160, 100, 20);
			panelTwo.add(addButton);
			//addButton.addActionListener(new ButtonHandler());
			
		}
		
		
		public void paintingEverything(){
			mainFrame.setVisible(true);
		}

		


}//class
