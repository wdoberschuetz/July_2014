package gui;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;











//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import db.PerformDatabaseOperations;
import domainObjects.InternationalGala;
import domainObjects.NationalGala;
import aoop2_project.Swimmer.Gender;
import aoop2_project.Swimmer.Status;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	JFrame mainFrame;
	JMenu swimmerMenu;
	JMenu galaMenu;
	JMenu competitionMenu;
	JMenu adminMenu;
	
	// MainFrame constructor
	public MainFrame(){
		createMenu();
	}
	
	public void createMenu(){
		
		//setting the frame properties
		setTitle("Swim Gala Manager");
		setLocation(50, 50);
		setSize(750, 450);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//setting the container properties
		Container container;
		container = getContentPane();
		container.setLayout(new FlowLayout());
		
		//menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		swimmerMenu = new JMenu("Swimmers");
		menuBar.add(swimmerMenu);
		galaMenu = new JMenu("Galas");
		menuBar.add(galaMenu);
		//competitionMenu = new JMenu("Competition");
		//menuBar.add(competitionMenu);
		//adminMenu = new JMenu("Admin");
		//menuBar.add(adminMenu);
		
		//menu and menu items
		JMenuItem item;
		
		// Menu item Swimmer -> Register
		item = new JMenuItem("Register");
		swimmerMenu.add(item);
		RegisterSwimmerHandler registerSwimmerHandler = new RegisterSwimmerHandler();
		item.addActionListener(registerSwimmerHandler);
		
		// Menu item Swimmer -> Amend
		item = new JMenuItem("Amend");
		swimmerMenu.add(item);
		AmendSwimmerHandler amendSwimmerHandler = new AmendSwimmerHandler();
		item.addActionListener(amendSwimmerHandler);
		
		//Menu item Swimmer -> Deactivate
		item = new JMenuItem("Deactivate");
		swimmerMenu.add(item);
		DeactivateSwimmerHandler deactivateSwimmerHandler = new DeactivateSwimmerHandler();
		item.addActionListener(deactivateSwimmerHandler);
		
		// Menu item Swimmer -> View
		item = new JMenuItem("View");
		swimmerMenu.add(item);
		ViewSwimmersHandler viewSwimmersHandler = new ViewSwimmersHandler();
		item.addActionListener(viewSwimmersHandler);
		
		// menu item Gala -> Register
		item = new JMenuItem("Register");
		galaMenu.add(item);
		RegisterGalaHandler registerGalaHandler = new RegisterGalaHandler();
		item.addActionListener(registerGalaHandler);
		
		// Menu item Gala -> Amend
		//item = new JMenuItem("Amend");
		//galaMenu.add(item);
		///AmendGalaHandler amendGalaHandler = new AmendGalaHandler();
		//item.addActionListener(amendGalaHandler);
		
		// Menu item Gala -> Cancel
		item = new JMenuItem("Cancel");
		galaMenu.add(item);
		CancelGalaHandler cancelGalaHandler = new CancelGalaHandler();
		item.addActionListener(cancelGalaHandler);
		
		// Menu item Gala -> View
		item = new JMenuItem("View");
		galaMenu.add(item);
		ViewGalaHandler viewGalaHandler = new ViewGalaHandler();
		item.addActionListener(viewGalaHandler);
		
		// Menu item Competition -> View qulifying swimmers
	//	item = new JMenuItem("View qualifying swimmers");
	//	competitionMenu.add(item);
	//	ViewQualifyingSwimmersHandler viewQualifyingSwimmersHandler = new ViewQualifyingSwimmersHandler();
	//	item.addActionListener(viewQualifyingSwimmersHandler);
		
		// Menu item Competition -> Do I qualify?
	//	item = new JMenuItem("Do I qualify?");
	//	competitionMenu.add(item);
	//	DoIQualifyHandler doIQulifyHandler = new DoIQualifyHandler();
	//	item.addActionListener(doIQulifyHandler);
		
		// Menu item Competition -> Enter a gala
	//	item = new JMenuItem("Enter a gala");
	//	competitionMenu.add(item);
	//	EnterAGalaHandler enterAGalaHandler = new EnterAGalaHandler();
	//	item.addActionListener(enterAGalaHandler);
		
		// Menu item Admin -> Load
	//	item = new JMenuItem("Load");
	//	adminMenu.add(item);
	//	LoadDataHandler loadDataHandler = new LoadDataHandler();
	//	item.addActionListener(loadDataHandler);
		
		// Menu item Admin -> Save
	//	item = new JMenuItem("Save");
	//	adminMenu.add(item);
	//	SaveDataHandler saveDataHandler = new SaveDataHandler();
	//	item.addActionListener(saveDataHandler);
	}
	
	class RegisterSwimmerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			RegisterSwimmerFrame swimmerRegistrationFrame = new RegisterSwimmerFrame();
			swimmerRegistrationFrame.setVisible(true);
			
		}
	}
	
	
	
	class ViewSwimmersHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			PerformDatabaseOperations viewSwimmers = new PerformDatabaseOperations();
			viewSwimmers.viewSwimmers();
			
		}
	}
	
	class AmendSwimmerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			AmendSwimmerFrame newFrame = new AmendSwimmerFrame();
			newFrame.setVisible(true);
			PerformDatabaseOperations loadSwimmerDetails = new PerformDatabaseOperations();
			loadSwimmerDetails.retrieveSwimmerFromDatabase();
			
			
			
		}
	}
	
	class DeactivateSwimmerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			PerformDatabaseOperations deactivateSwimmer = new PerformDatabaseOperations();
			deactivateSwimmer.deleteSwimmerFromDatabase();
			
		}
	}
	
	class RegisterGalaHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			GalaFrame galaFrame = new GalaFrame();
			galaFrame.setVisible(true);
			
			
		}
		
		
	}
	
	class AmendGalaHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		}
		
		
	}
	
	class CancelGalaHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			GalaFrame.populateNationalGalaArrayList();
			GalaFrame.populateInternationalGalaArrayList();
			
			String galaTypeInput = JOptionPane.showInputDialog("Which gala do you want to delete? "
					+ "Type 1 for national or 2 for international.");
			
			if (galaTypeInput.equals("1")){
			
			String userInput = JOptionPane.showInputDialog("Enter galas's ID you wish to cancel:");
				
				//check if the input is a digit
				if (userInput.matches("\\d+")){
					
					int inputAsInteger = Integer.parseInt(userInput);
				
						//now check if the input is greater than 0, as ID numbers start at 1
						//and check if the number is not bigger that the size of the array
						if(inputAsInteger > 0 && inputAsInteger < GalaFrame.nationalGalaArrayList.size()){
							
							for (int i = 0; i < GalaFrame.nationalGalaArrayList.size(); i++){
								if (GalaFrame.nationalGalaArrayList.get(i).getGalaId() == inputAsInteger){
									System.out.println(GalaFrame.nationalGalaArrayList.get(i).getGalaName());
									GalaFrame.nationalGalaArrayList.remove(i);
									JOptionPane.showMessageDialog(null, String.format("Gala with ID number of %d has been deleted", 
											inputAsInteger), "Confirmation", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}else{
							JOptionPane.showMessageDialog(null, 
									String.format("Please enter a number greater than 0 or greater than the size of the array which is %d",
											GalaFrame.nationalGalaArrayList.size()), "Error", JOptionPane.INFORMATION_MESSAGE);
							}
				}else{
					JOptionPane.showMessageDialog(null, "Please enter a number!", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if (galaTypeInput.equals("2")){
			
			
				String userInput = JOptionPane.showInputDialog("Enter galas's ID you wish to cancel:");
				
				//check if the input is a digit
				if (userInput.matches("\\d+")){
					
					int inputAsInteger = Integer.parseInt(userInput);
				
						//now check if the input is greater than 0, as ID numbers start at 1
						//and check if the number is not bigger that the size of the array
						if(inputAsInteger > 0 && inputAsInteger < GalaFrame.internationalGalaArrayList.size()){
							
							for (int i = 0; i < GalaFrame.internationalGalaArrayList.size(); i++){
								if (GalaFrame.internationalGalaArrayList.get(i).getGalaId() == inputAsInteger){
									System.out.println(GalaFrame.internationalGalaArrayList.get(i).getGalaName());
									GalaFrame.internationalGalaArrayList.remove(i);
									JOptionPane.showMessageDialog(null, String.format("Gala with ID number of %d has been deleted", 
											inputAsInteger), "Confirmation", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}else{
							JOptionPane.showMessageDialog(null, 
									String.format("Please enter a number greater than 0 or greater than the size of the array which is %d",
											GalaFrame.internationalGalaArrayList.size()), "Error", JOptionPane.INFORMATION_MESSAGE);
							}
				}else{
					JOptionPane.showMessageDialog(null, "Please enter a number!", "Error", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				
		}else{
			
			JOptionPane.showMessageDialog(null, "Please enter either 1 or 2!", "Error", JOptionPane.INFORMATION_MESSAGE);
			
		}
			
		}
		
		
	}
	
	class ViewGalaHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Click ok to view all national galas");
			GalaFrame.populateNationalGalaArrayList();
			for (NationalGala x: GalaFrame.nationalGalaArrayList){
				JOptionPane.showMessageDialog(null, x);
			}
			
			JOptionPane.showMessageDialog(null, "Click ok to view all international galas");
			GalaFrame.populateInternationalGalaArrayList();
			for (InternationalGala x: GalaFrame.internationalGalaArrayList){
				JOptionPane.showMessageDialog(null, x);
			}
			
		}
		
	}
	
	class ViewQualifyingSwimmersHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class DoIQualifyHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class EnterAGalaHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class LoadDataHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class SaveDataHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
	
