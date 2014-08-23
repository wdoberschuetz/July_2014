package gui;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import aoop1_project.Swimmer;
import aoop2_project.InternationalGala.TypeOfTiming;

import com.toedter.calendar.JDateChooser;

import domainObjects.InternationalGala;
import domainObjects.NationalGala;

public class GalaFrame extends JFrame{

	
		// all labels
		private JLabel enterDetailsLabel;
		private JLabel galaDateLabel;
		private JLabel galaCityLabel;
		private JLabel galaNameLabel;
		private JLabel galaCountryLabel;
		private JLabel galaPaymentLabel;
		private JLabel galaOrganiserNameLabel;
		private JLabel galaOrganiserPhoneNumberLabel;
		private JLabel galaOrganiserEmailLabel;
		private JLabel poolAddressLabel;
		private JLabel poolLengthLabel;
		private JLabel durationInDaysLabel;
		private JLabel typeOfTimingLabel;

		
		// textfields and comboboxes
		private JDateChooser dateOfGalaChosen;
		private JComboBox<String> galaCityComboBox;
		private JTextField galaNameTextField;
		private static JComboBox<String> galaCountryComboBox;
		private JTextField galaPaymentTextField;
		private static JTextField galaOrganiserNameTextField;
		private static JTextField galaOrganiserPhoneNumberTextField;
		private static JTextField galaOrganiserEmailTextField;
		private static JTextField poolAddressTextField;
		private static JTextField poolLengthTextField;
		private static JTextField durationInDaysTextField;
		private static JComboBox<String> typeOfTimingComboBox;
		
		private JButton addGalaButton;
		private JButton cancelButton;
		
		private JPanel contentPanel;	
		
		private static JRadioButton nationalGalaButton;
		private JRadioButton internationalGalaButton;
		
		private ButtonGroup groupTwoButtons;
		
		private Font fontSubHeading = new Font("Verdana", Font.BOLD, 16);
		private Font fontLabel = new Font("Verdana", Font.PLAIN, 12);
		private Font fontTextField = new Font("Verdana", Font.PLAIN, 11);
		private Font fontButton = new Font("Verdana", Font.PLAIN, 11);
		
		private String[] galaCitiesArray = {"Killarney", "Tralee", "Limerick", "Dublin", "Cork",
											"Paris", "Eindhoven", "Montreal", "Berlin", "Boston"};
		private String[] galaCountriesArray = {"Ireland", "France", "Holland", "Canada", "Germany", "USA"};
		private String[] typesOfTimingArray = {"electronic", "manual"};
		
		//declare arraylist of galas
		static ArrayList<NationalGala> nationalGalaArrayList;
		static ArrayList<InternationalGala> internationalGalaArrayList;
		
	
	
	public GalaFrame(){
		createGalaFrame();
		populateNationalGalaArrayList();
		populateInternationalGalaArrayList();
		
	}
	
	public static void main(String[] abc){
		
		GalaFrame galaFrame = new GalaFrame();
		galaFrame.setVisible(true);
		
	}

	private void createGalaFrame() {
		
		contentPanel = new JPanel();
		contentPanel.setLayout(null);
		add(contentPanel);
		
		setLocation(50, 50);
		setSize(500, 600);
		setTitle("Add Gala");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		enterDetailsLabel = new JLabel("Please enter gala's details");
		enterDetailsLabel.setBounds(10, 10, 400, 25);
		enterDetailsLabel.setFont(fontSubHeading);
		contentPanel.add(enterDetailsLabel);
		
		// panel for gala's details
		
		// radio buttons
		nationalGalaButton = new JRadioButton("National Gala");
		nationalGalaButton.setBounds(20, 60, 120, 25);
		NationalButtonIsSelectedHandler nationalButtonIsSelected = new NationalButtonIsSelectedHandler();
		nationalGalaButton.addActionListener(nationalButtonIsSelected);
		contentPanel.add(nationalGalaButton);
		
		internationalGalaButton = new JRadioButton("International Gala");
		internationalGalaButton.setBounds(150, 60, 150, 25);
		InternationalButtonIsSelectedHandler internationalButtonIsSelected = new InternationalButtonIsSelectedHandler();
		internationalGalaButton.addActionListener(internationalButtonIsSelected);
		contentPanel.add(internationalGalaButton);
			
		groupTwoButtons = new ButtonGroup();
		groupTwoButtons.add(nationalGalaButton);
		groupTwoButtons.add(internationalGalaButton);
		
		
		// labels and textfields
		galaDateLabel = new JLabel("Date:");
		galaDateLabel.setBounds(20, 100, 85, 25);
		galaDateLabel.setFont(fontLabel);
		contentPanel.add(galaDateLabel);
		
		dateOfGalaChosen = new JDateChooser();
		dateOfGalaChosen.setBounds(240, 100, 220, 22);
		dateOfGalaChosen.setFont(fontTextField);
		contentPanel.add(dateOfGalaChosen);
		
		galaCityLabel = new JLabel("City:");
		galaCityLabel.setBounds(20, 130, 110, 25);
		galaCityLabel.setFont(fontLabel);
		contentPanel.add(galaCityLabel);
		
		galaCityComboBox = new JComboBox<String>(galaCitiesArray);
		galaCityComboBox.setBounds(240, 130, 220, 22);
		contentPanel.add(galaCityComboBox);
		
		galaNameLabel = new JLabel("Name:");
		galaNameLabel.setBounds(20, 160, 85, 25);
		galaNameLabel.setFont(fontLabel);
		contentPanel.add(galaNameLabel);	
		
		galaNameTextField = new JTextField();
		galaNameTextField.setBounds(240, 160, 220, 22);
		contentPanel.add(galaNameTextField);
				
		galaCountryLabel = new JLabel("Country:");
		galaCountryLabel.setBounds(20, 190, 85, 25);
		galaCountryLabel.setFont(fontLabel);
		contentPanel.add(galaCountryLabel);
		
		galaCountryComboBox = new JComboBox<String>(galaCountriesArray);
		galaCountryComboBox.setBounds(240, 190, 220, 22);
		contentPanel.add(galaCountryComboBox);
		
		galaPaymentLabel = new JLabel("Payment:");
		galaPaymentLabel.setBounds(20, 220, 85, 25);
		galaPaymentLabel.setFont(fontLabel);
		contentPanel.add(galaPaymentLabel);
		
		galaPaymentTextField = new JTextField();
		galaPaymentTextField.setBounds(240, 220, 220, 22);
		contentPanel.add(galaPaymentTextField);
		
		galaOrganiserNameLabel = new JLabel("Gala Organiser's name:");
		galaOrganiserNameLabel.setBounds(20, 250, 160, 25);
		galaOrganiserNameLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserNameLabel);
		
		galaOrganiserNameTextField = new JTextField();
		galaOrganiserNameTextField.setBounds(240, 250, 220, 22);
		contentPanel.add(galaOrganiserNameTextField);
		
		galaOrganiserPhoneNumberLabel = new JLabel("Gala Organiser's phone number:");
		galaOrganiserPhoneNumberLabel.setBounds(20, 280, 210, 25);
		galaOrganiserPhoneNumberLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserPhoneNumberLabel);
		
		galaOrganiserPhoneNumberTextField = new JTextField();
		galaOrganiserPhoneNumberTextField.setBounds(240, 280, 220, 22);
		contentPanel.add(galaOrganiserPhoneNumberTextField);
		
		galaOrganiserEmailLabel = new JLabel("Gala Organiser's email:");
		galaOrganiserEmailLabel.setBounds(20, 310, 160, 25);
		galaOrganiserEmailLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserEmailLabel);
		
		galaOrganiserEmailTextField = new JTextField();
		galaOrganiserEmailTextField.setBounds(240, 310, 220, 22);
		contentPanel.add(galaOrganiserEmailTextField);
		
		poolAddressLabel = new JLabel("Pool address:");
		poolAddressLabel.setBounds(20, 340, 160, 25);
		poolAddressLabel.setFont(fontLabel);
		contentPanel.add(poolAddressLabel);
		
		poolAddressTextField = new JTextField();
		poolAddressTextField.setBounds(240, 340, 220, 22);
		contentPanel.add(poolAddressTextField);
		
		poolLengthLabel = new JLabel("Pool length:");
		poolLengthLabel.setBounds(20, 370, 160, 25);
		poolLengthLabel.setFont(fontLabel);
		contentPanel.add(poolLengthLabel);
		
		poolLengthTextField = new JTextField();
		poolLengthTextField.setBounds(240, 370, 220, 22);
		contentPanel.add(poolLengthTextField);
		
		durationInDaysLabel = new JLabel("Duration in days:");
		durationInDaysLabel.setBounds(20, 400, 160, 25);
		durationInDaysLabel.setFont(fontLabel);
		contentPanel.add(durationInDaysLabel);
		
		durationInDaysTextField = new JTextField();
		durationInDaysTextField.setBounds(240, 400, 220, 22);
		contentPanel.add(durationInDaysTextField);
		
		typeOfTimingLabel = new JLabel("Type of timing:");
		typeOfTimingLabel.setBounds(20, 430, 160, 25);
		typeOfTimingLabel.setFont(fontLabel);
		contentPanel.add(typeOfTimingLabel);
		
		typeOfTimingComboBox = new JComboBox<String>(typesOfTimingArray);
		typeOfTimingComboBox.setBounds(240, 430, 220, 22);
		contentPanel.add(typeOfTimingComboBox);
		
		// buttons
		addGalaButton = new JButton("Add");
		addGalaButton.setBounds(40, 500, 100, 30);
		addGalaButton.setFont(fontButton);
		contentPanel.add(addGalaButton);
		AddGalaButtonHandler registerSwimmerButtonHandler = new AddGalaButtonHandler();
		addGalaButton.addActionListener(registerSwimmerButtonHandler);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(160, 500, 100, 30);
		cancelButton.setFont(fontButton);
		contentPanel.add(cancelButton);
		CancelAddGalaButtonHandler cancelRegistartionButtonHandler = new CancelAddGalaButtonHandler();
		cancelButton.addActionListener(cancelRegistartionButtonHandler);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void populateNationalGalaArrayList(){
		
		
		// create an array list of galas
		nationalGalaArrayList = new ArrayList<NationalGala>();
		
		// add a few galas to the nationalGalaArrayList
		NationalGala nationalGala1 = new NationalGala(new Date(2015, 04, 23), "Kingdom Masters Gala", 6);
		nationalGalaArrayList.add(nationalGala1);
		NationalGala nationalGala2 = new NationalGala(new Date(2015, 06, 03), "Cork Masters Invitational Gala", 7);
		nationalGalaArrayList.add(nationalGala2);
		NationalGala nationalGala3 = new NationalGala(new Date(2014, 10, 10), "NAC Gala", 8);
		nationalGalaArrayList.add(nationalGala3);
		NationalGala nationalGala4 = new NationalGala(new Date(2014, 8, 12), "Fun Killarney Charity Gala", 20);
		nationalGalaArrayList.add(nationalGala4);
		
			
	}
	
	@SuppressWarnings("deprecation")
	
	public static void populateInternationalGalaArrayList(){
		
		
		// create an array list of galas
		internationalGalaArrayList = new ArrayList<InternationalGala>();
		
		// add a few galas to the nationalGalaArrayList
		InternationalGala internationalGala1 = 
						new InternationalGala(new Date(2012, 12, 17), "Championships in Holland", 12, "Eindhoven",
											"Holland", "John Smith", 23733838,
											"john.smith@gmail.com", "17 New Street", 19, 50, 
											TypeOfTiming.electronic);
		internationalGalaArrayList.add(internationalGala1);
		
		InternationalGala internationalGala2 = 
						new InternationalGala(new Date(2017, 06, 12), "Championnats de France", 20, "Toulouse",
											"France", "Joan OBrien", 99933838,
											"joan.obrien@gmail.com", "45 Board Street", 17, 50, 
											TypeOfTiming.electronic);
		internationalGalaArrayList.add(internationalGala2);

		InternationalGala internationalGala3 = 
						new InternationalGala(new Date(2016, 8, 23), "La France a la Piscine", 23, "Lyon",
											"France", "Patricia OSullivan",1111933838,
											"pat.osul@gmail.com", "12 Some Street", 7, 50, TypeOfTiming.electronic);
		internationalGalaArrayList.add(internationalGala3);
		

			
	}
	
	public class InternationalButtonIsSelectedHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			galaCountryComboBox.setEditable(true);
			galaOrganiserNameTextField.setEditable(true);
			galaOrganiserPhoneNumberTextField.setEditable(true);
			galaOrganiserEmailTextField.setEditable(true);
			poolAddressTextField.setEditable(true);
			poolLengthTextField.setEditable(true);
			durationInDaysTextField.setEditable(true);
			typeOfTimingComboBox.setEditable(true);
			durationInDaysTextField.setText("");
			poolLengthTextField.setText("");
			
		}
	}
	
	public class NationalButtonIsSelectedHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a) {
			
			galaCountryComboBox.setEditable(false);
			galaCountryComboBox.setSelectedItem(1);
			galaOrganiserNameTextField.setEditable(false);
			galaOrganiserPhoneNumberTextField.setEditable(false);
			galaOrganiserEmailTextField.setEditable(false);
			poolAddressTextField.setEditable(false);
			poolLengthTextField.setEditable(false);
			poolLengthTextField.setText("25m");
			durationInDaysTextField.setEditable(false);
			durationInDaysTextField.setText("1");
			typeOfTimingComboBox.setEditable(false);
				
			
		}
		
	}
	
	public class AddGalaButtonHandler implements ActionListener{

		@SuppressWarnings("static-access")
		@Override
		public void actionPerformed(ActionEvent arg0) {
	
			try{
			
			if (nationalGalaButton.isSelected()){
				
				// get text from text fields and comboboxes
				Date date = dateOfGalaChosen.getDate();
				String name = galaNameTextField.getText();
				String payment = galaPaymentTextField.getText();
				int paymentAsInt = Integer.parseInt(payment);
				
				// add new gala to the array list
				NationalGala newGala = new NationalGala(date, name, paymentAsInt);
				nationalGalaArrayList.add(newGala);	
				JOptionPane.showMessageDialog(null, "A Gala has been added");
				GalaFrame.this.dispose();
				
			}else{
				

				// get data from texfields and comboboxes
				Date date = dateOfGalaChosen.getDate();
				String city = galaCityComboBox.getSelectedItem().toString();
				String name = galaNameTextField.getText();
				String country = galaCountryComboBox.getSelectedItem().toString();
				String payment = galaPaymentTextField.getText();
				int paymentAsInt = Integer.parseInt(payment);
				String organiserName = galaOrganiserNameTextField.getText();
				String organiserPhone = galaOrganiserPhoneNumberTextField.getText();
				long phoneNumberAsLong = Long.parseLong(organiserPhone);
				String organiserEmail = galaOrganiserEmailTextField.getText();
				String address = poolAddressTextField.getText();
				String length = poolLengthTextField.getText();
				int lengthAsInt = Integer.parseInt(length);
				String duration = durationInDaysTextField.getText();
				int durationAsInt = Integer.parseInt(duration);
				String timing = typeOfTimingComboBox.getSelectedItem().toString();
				TypeOfTiming typeOfTiming = null;
				typeOfTiming.valueOf(timing);
				
				InternationalGala newGala = new InternationalGala(date, name, paymentAsInt, city, country,
						 organiserName, phoneNumberAsLong, organiserEmail, 
						 address, durationAsInt, lengthAsInt, typeOfTiming);
	
				
				internationalGalaArrayList.add(newGala);
				JOptionPane.showMessageDialog(null, "A Gala has been added");
				GalaFrame.this.dispose();
				
			}
				}catch(NumberFormatException e){
					
					JOptionPane.showMessageDialog(GalaFrame.this, "Something went wrong"
												+ "\nCheck that correct format of data was entered.");
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(GalaFrame.this, "Something went wrong"
												+ "\nCheck that all fields are filled.");
					
				}
				
		}	
		
	}
	
	public class CancelAddGalaButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {

			GalaFrame.this.dispose();
			
		}
		
		
	}
	
	
	}
