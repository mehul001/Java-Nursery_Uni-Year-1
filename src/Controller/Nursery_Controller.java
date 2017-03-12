package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Model.Child;
import Model.NuseryFile;
import Model.Parent;
import Model.Session;
import View.View_AddAdmin;
import View.View_AdmitChild;
import View.View_Child;
import View.View_Invoice;
import View.View_Login;
import View.View_Nursery_Homepage;

public class Nursery_Controller implements ActionListener {

	private View_AdmitChild viewAC;
	private View_Nursery_Homepage viewHome;
	private View_Login viewLogin;
	private View_AddAdmin viewAdminAdd;
	private View_Invoice viewInvoice;
	private View_Child viewChild;

	private double cost_all_day = 0.00;
	private double cost_morning = 0.00;
	private double cost_lunch = 0.00;
	private double cost_afternoon = 0.00;
	private double cost_preschool = 0.00;

	private int ageCat = 0;

	public void addAdmitChildView(View_AdmitChild view) {
		this.viewAC = view;
	}

	public void addNurseryHomeChildView(View_Nursery_Homepage view) {
		this.viewHome = view;
	}

	public void addNurseryloginView(View_Login view) {
		this.viewLogin = view;
	}

	public void addAdminView(View_AddAdmin view) {
		this.viewAdminAdd = view;
	}

	public void addInvoiceView(View_Invoice view) {
		this.viewInvoice = view;
	}
	
	public void addChildView(View_Child view) {
				this.viewChild = view;
	}

	private void getAgeCat() {
		if (viewAC.setjRB3Years().isSelected()) {
			cost_all_day = 32.00;
			cost_morning = 14.50;
			cost_lunch = 5.00;
			cost_afternoon = 16.00;
			cost_preschool = 23.50;

			ageCat = 3;
		}

		if (viewAC.setjRB2_3Years().isSelected()) {
			cost_all_day = 34.00;
			cost_morning = 15.50;
			cost_lunch = 5.00;
			cost_afternoon = 17.00;
			cost_preschool = 24.50;

			ageCat = 2;
		}

		if (viewAC.setjRBBirth_2().isSelected()) {
			cost_all_day = 35.00;
			cost_morning = 16.50;
			cost_lunch = 5.00;
			cost_afternoon = 18.00;
			cost_preschool = 25.00;

			ageCat = 1;
		}

	}

	public void actionPerformed(ActionEvent e) {
		// System.out.println(e.getActionCommand());
		
		if (e.getActionCommand().equals("child_p")) {
			viewHome.getPanel().setVisible(false);
			viewChild.getPanel().setVisible(true);
		NuseryFile read = new NuseryFile("child.dat");
		ArrayList<Child> child = new ArrayList<Child>();
		child = read.getChild();
		ArrayList<String> readChild = new ArrayList<String>();
		for (Child c1 : child) {
			String name = c1.getName() + " " + c1.getSurname();
			readChild.add(name);
			System.out.println(name);
		}
		
		viewChild.createDropdown(readChild);
		}
		
		
		if (e.getActionCommand().equals("search_Child")) {
			
			NuseryFile read = new NuseryFile("child.dat");
			ArrayList<Child> child = new ArrayList<Child>();
			child = read.getChild();
			
			for (Child c1 : child) {
				if (c1.getFullName().equals(viewChild.getDropdown())){			
					
					JOptionPane
					.showMessageDialog(
							null,
							"Child Information"
							+ "Full Name : " + c1.getFullName()+ "\n"
							+"Date of Birth : " + c1.getDOB() + "\n"
							+"Address Line 1 : " + c1.getAddress_1() + "\n"
							+"Address Line 2 : " + c1.getAddress_2() + "\n"
							+"City : " + c1.getCity() + "\n"
							+"Postcode : " + c1.getPostcode() + "\n"
							+"Allergy : " + c1.getAllergy() + "\n"
							
					);					
				}
			}
			
		}
		
		//back_Child
		
		if (e.getActionCommand().equals("back_Child")) {
			viewHome.getPanel().setVisible(true);
			viewChild.getPanel().setVisible(false);
		}
		
		if (e.getActionCommand().equals("search_invoice")) {
			//String data = viewInvoice.getDropdown();
			//System.out.println(data);
			NuseryFile read = new NuseryFile("child.dat");
			ArrayList<Child> child = new ArrayList<Child>();
			child = read.getChild();
			
			for (Child c1 : child) {
				if (c1.getFullName().equals(viewInvoice.getDropdown())){
					HashMap<String, Session> data = new HashMap<String, Session>();
					data = c1.getSession();
					
					Session s_monday = data.get("Monday");
					Session s_tuesday = data.get("Monday");
					Session s_wednesday = data.get("Monday");
					Session s_thursday = data.get("Monday");
					Session s_friday = data.get("Monday");
					
					double getPrice = c1.getPrice(), monthly = c1
							.getMonthlyPrice();

					JOptionPane
							.showMessageDialog(
									null,
									 "MONTHLY INOVOICE : \n" 
									 + "Monday Session : " + s_monday.getSessionName() + " Price : £" + s_monday.getSessionCost() + "\n"
									 + "Tuesday Session : " + s_tuesday.getSessionName() + " Price : £" + s_tuesday.getSessionCost() + "\n"
									 + "Wednesday Session : " + s_wednesday.getSessionName() + " Price : £" + s_wednesday.getSessionCost() + "\n"
									 + "Thursday Session : " + s_thursday.getSessionName() + " Price : £" + s_thursday.getSessionCost() + "\n"
									 + "Friday Session : " + s_friday.getSessionName() + " Price : £" + s_friday.getSessionCost() + "\n"
									 + "\n"
									 + "Weekly Fee (Including Discounts) : £" + getPrice + "\n"
									 + "\n - - - PAY NOW - - - \n"
									 + "Monthly Fee (Including Discounts) : £" + monthly
											
									);

					
				}
			}
			
			
		}

		if (e.getActionCommand().equals("Invoice")) {
			viewHome.getPanel().setVisible(false);
			viewInvoice.getPanel().setVisible(true);

			NuseryFile read = new NuseryFile("child.dat");
			ArrayList<Child> child = new ArrayList<Child>();
			child = read.getChild();
			ArrayList<String> readChild = new ArrayList<String>();
			for (Child c1 : child) {
				String name = c1.getName() + " " + c1.getSurname();
				readChild.add(name);
				System.out.println(name);
			}

			viewInvoice.createDropdown(readChild);

		}

		if (e.getActionCommand().equals("back_Invoice")) {
			viewInvoice.getPanel().setVisible(false);
			viewHome.getPanel().setVisible(true);
		}

		if (viewAC.set_regFee().isSelected()) {
			viewAC.setjRB3Years().setEnabled(true);
			viewAC.setjRB2_3Years().setEnabled(true);
			viewAC.setjRBBirth_2().setEnabled(true);
		} else {
			viewAC.setjRB3Years().setEnabled(false);
			viewAC.setjRB2_3Years().setEnabled(false);
			viewAC.setjRBBirth_2().setEnabled(false);
		}

		if ((viewAC.setjRB3Years().isSelected())
				|| (viewAC.setjRB2_3Years().isSelected())
				|| (viewAC.setjRBBirth_2().isSelected())) {
			viewAC.set_jCB_Day_1().setEnabled(true);
			viewAC.set_jCB_Day_2().setEnabled(true);
			viewAC.set_jCB_Day_3().setEnabled(true);
			viewAC.set_jCB_Day_4().setEnabled(true);
			viewAC.set_jCB_Day_5().setEnabled(true);
		} else {
			viewAC.set_jCB_Day_1().setEnabled(false);
			viewAC.set_jCB_Day_2().setEnabled(false);
			viewAC.set_jCB_Day_3().setEnabled(false);
			viewAC.set_jCB_Day_4().setEnabled(false);
			viewAC.set_jCB_Day_5().setEnabled(false);
		}

		if (e.getActionCommand().equals("Logout")) {
			viewHome.getPanel().setVisible(false);

			viewLogin.get_User().setText(null);
			viewLogin.get_Pass().setText(null);

			viewLogin.getPanel().setVisible(true);
		}

		if (e.getActionCommand().equals("Save_Admin")) {
			if (viewAdminAdd.get_Pass().equals(viewAdminAdd.get_Pass2())) {
				System.out.println("Password Match");

				FileWriter fw;
				try {
					fw = new FileWriter("Nursery_Login.dat", true);
					System.out.println(viewAdminAdd.getUser() + " "
							+ viewAdminAdd.get_Pass2());
					PrintWriter fw_1 = new PrintWriter(fw);

					String username = viewAdminAdd.getUser();
					String password = viewAdminAdd.get_Pass2();
					String[] data = { username, password };

					for (int i = 0; i < data.length; i++) {
						fw_1.print(data[i] + ",");
					}
					fw_1.println("");
					fw_1.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,
						"Account Successfully Created");

				viewAdminAdd.getPanel().setVisible(false);
				viewHome.getPanel().setVisible(true);

			} else {
				JOptionPane.showMessageDialog(null, "Passwords don't match...");
			}
		}

		if (e.getActionCommand().equals("Add_Admin")) {
			viewHome.getPanel().setVisible(false);

			viewAdminAdd.get_User().setText(null);
			viewAdminAdd.getPass().setText(null);
			viewAdminAdd.getPass_2().setText(null);

			viewAdminAdd.getPanel().setVisible(true);

		}

		if (e.getActionCommand().equals("Save_Admit")) {
			// double price =0.00;
			getAgeCat();

			Parent parent_1 = new Parent(viewAC.getName_p1(),
					viewAC.getSurname_p1(), viewAC.getHomeno_p1(),
					viewAC.getMobile_p1());

			Child child_1 = new Child(viewAC.getFirstName_Child(),
					viewAC.getSurname_Child(), viewAC.getDOB_Child(),
					viewAC.getAdd_Child(), viewAC.getAdd_1_Child(),
					viewAC.getCity_Child(), viewAC.getPCode_Child(),
					viewAC.getAllergy(), parent_1, ageCat);

			String allday = "All Day (8am to 6pm)";
			String morning = "Morning (8am to 12pm)";
			String lunch = "Lunch (12pm to 1 pm)";
			String afternoon = "Afternoon (1pm to 6 pm)";
			String preschool = "Pre School (9am to 3.30pm)";
			String holiday = "Full Holiday Care (5 yrs +) (8am to 6pm)";

			if (viewAC.getDay1().equals(allday)) {
				Session s_monday = new Session(allday, cost_all_day);
				child_1.set_AddSession("Monday", s_monday);
				System.out.println(cost_all_day);
			}

			if (viewAC.getDay2().equals(allday)) {
				Session s_tuesday = new Session(allday, cost_all_day);
				child_1.set_AddSession("Tuesday", s_tuesday);
				System.out.println(cost_all_day);
			}

			if (viewAC.getDay3().equals(allday)) {
				Session s_wednesday = new Session(allday, cost_all_day);
				child_1.set_AddSession("Wednesday", s_wednesday);
				System.out.println(cost_all_day);
			}

			if (viewAC.getDay4().equals(allday)) {
				Session s_thursday = new Session(allday, cost_all_day);
				child_1.set_AddSession("Thursday", s_thursday);
				System.out.println(cost_all_day);
			}

			if (viewAC.getDay5().equals(allday)) {
				Session s_friday = new Session(allday, cost_all_day);
				child_1.set_AddSession("Friday", s_friday);
				System.out.println(cost_all_day);
			}
			// morning
			if (viewAC.getDay1().equals(morning)) {
				Session s_monday = new Session(morning, cost_morning);
				child_1.set_AddSession("Monday", s_monday);
				System.out.println(cost_morning);
			}

			if (viewAC.getDay2().equals(morning)) {
				Session s_tuesday = new Session(morning, cost_morning);
				child_1.set_AddSession("Tuesday", s_tuesday);
				System.out.println(cost_morning);
			}

			if (viewAC.getDay3().equals(morning)) {
				Session s_wednesday = new Session(morning, cost_morning);
				child_1.set_AddSession("Wednesday", s_wednesday);
				System.out.println(cost_morning);
			}

			if (viewAC.getDay4().equals(morning)) {
				Session s_thursday = new Session(morning, cost_morning);
				child_1.set_AddSession("Thursday", s_thursday);
				System.out.println(cost_morning);
			}

			if (viewAC.getDay5().equals(morning)) {
				Session s_friday = new Session(morning, cost_morning);
				child_1.set_AddSession("Friday", s_friday);
				System.out.println(cost_morning);
			}

			// lunch
			if (viewAC.getDay1().equals(lunch)) {
				Session s_monday = new Session(lunch, cost_lunch);
				child_1.set_AddSession("Monday", s_monday);
				System.out.println(cost_lunch);
			}

			if (viewAC.getDay2().equals(lunch)) {
				Session s_tuesday = new Session(lunch, cost_lunch);
				child_1.set_AddSession("Tuesday", s_tuesday);
				System.out.println(cost_lunch);
			}

			if (viewAC.getDay3().equals(lunch)) {
				Session s_wednesday = new Session(lunch, cost_lunch);
				child_1.set_AddSession("Wednesday", s_wednesday);
				System.out.println(cost_lunch);
			}

			if (viewAC.getDay4().equals(lunch)) {
				Session s_thursday = new Session(lunch, cost_lunch);
				child_1.set_AddSession("Thursday", s_thursday);
				System.out.println(cost_lunch);
			}

			if (viewAC.getDay5().equals(lunch)) {
				Session s_friday = new Session(lunch, cost_lunch);
				child_1.set_AddSession("Friday", s_friday);
				System.out.println(cost_lunch);
			}

			// afternoon
			if (viewAC.getDay1().equals(afternoon)) {
				Session s_monday = new Session(afternoon, cost_afternoon);
				child_1.set_AddSession("Monday", s_monday);
				System.out.println(cost_afternoon);
			}

			if (viewAC.getDay2().equals(afternoon)) {
				Session s_tuesday = new Session(afternoon, cost_afternoon);
				child_1.set_AddSession("Tuesday", s_tuesday);
				System.out.println(cost_afternoon);
			}

			if (viewAC.getDay3().equals(afternoon)) {
				Session s_wednesday = new Session(afternoon, cost_afternoon);
				child_1.set_AddSession("Wednesday", s_wednesday);
				System.out.println(cost_afternoon);
			}

			if (viewAC.getDay4().equals(afternoon)) {
				Session s_thursday = new Session(afternoon, cost_afternoon);
				child_1.set_AddSession("Thursday", s_thursday);
				System.out.println(cost_afternoon);
			}

			if (viewAC.getDay5().equals(afternoon)) {
				Session s_friday = new Session(afternoon, cost_afternoon);
				child_1.set_AddSession("Friday", s_friday);
				System.out.println(cost_afternoon);
			}

			// pre school
			if (viewAC.getDay1().equals(preschool)) {
				Session s_monday = new Session(preschool, cost_preschool);
				child_1.set_AddSession("Monday", s_monday);
				System.out.println(cost_preschool);
			}

			if (viewAC.getDay2().equals(preschool)) {
				Session s_tuesday = new Session(preschool, cost_preschool);
				child_1.set_AddSession("Tuesday", s_tuesday);
				System.out.println(cost_preschool);
			}

			if (viewAC.getDay3().equals(preschool)) {
				Session s_wednesday = new Session(preschool, cost_preschool);
				child_1.set_AddSession("Wednesday", s_wednesday);
				System.out.println(cost_preschool);
			}

			if (viewAC.getDay4().equals(preschool)) {
				Session s_thursday = new Session(preschool, cost_preschool);
				child_1.set_AddSession("Thursday", s_thursday);
				System.out.println(cost_preschool);
			}

			if (viewAC.getDay5().equals(preschool)) {
				Session s_friday = new Session(preschool, cost_preschool);
				child_1.set_AddSession("Friday", s_friday);
				System.out.println(cost_preschool);
			}

			NuseryFile nursery_File = new NuseryFile("child.dat");
			ArrayList<Child> new_child = new ArrayList<Child>();

			new_child = nursery_File.getChild();
			new_child.add(child_1);

			nursery_File.addChild(new_child);

			double getPrice = child_1.getPrice(), regFee = child_1.getRegFee(), monthly = child_1
					.getMonthlyPrice();

			JOptionPane
					.showMessageDialog(
							null,
							"Child Has Succesfully Been Added To The System \n "
									+ "REGISTRATION INVOICE \n "
									+ "\nName Of Child : "
									+ child_1.getName()
									+ " "
									+ child_1.getSurname()
									+ "\nRefundable Depoist (1 Week) : £"
									+ getPrice
									+ "\n"
									+ "\nPayment Due NOW (Depoist + Registraion Fee) : £"
									+ regFee + "\n"
									+ "\nRegular Monthly Payments : £"
									+ monthly);

			viewAC.getPanel().setVisible(false);
			viewHome.getPanel().setVisible(true);

		}

		if (e.getActionCommand().equals("Login")) {
			File file = new File("Nursery_Login.dat");
			boolean login = false;
			try {
				Scanner inputFile = new Scanner(file);
				while (inputFile.hasNextLine()) {
					String str = inputFile.nextLine();
					String[] data = str.split(",");

					if (viewLogin.getUser().equals(data[0])
							&& viewLogin.getPass().equals(data[1])) {
						login = true;
						System.out.println("Hello, You are now Logged in ");
						viewLogin.getPanel().setVisible(false);
						viewHome.getPanel().setVisible(true);
						break;
					} else {
						login = false;
					}
				}
				inputFile.close();// close the file when done.

				if (login == false) {
					JOptionPane.showMessageDialog(null, "Please Try Again...");
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// Read until the end of the file.

		}

		if (e.getActionCommand().equals("Admit Child")) {
			viewHome.getPanel().setVisible(false);

			viewAC.get_jTFC_Address().setText(null);
			viewAC.get_jTFC_Address_1().setText(null);
			viewAC.get_jTFC_City().setText(null);
			viewAC.get_jTFC_DOB().setText(null);
			viewAC.get_jTFC_Postcode().setText(null);
			viewAC.get_jTFC_Surname().setText(null);
			viewAC.get_jTFC_First_Name().setText(null);
			viewAC.get_Allergy().setText(null);
			viewAC.get_jTFP_HomeNo().setText(null);
			viewAC.get_jTFP_Mobile().setText(null);
			viewAC.get_jTFP_Name().setText(null);
			viewAC.get_jTFP_Surname().setText(null);

			viewAC.getPanel().setVisible(true);
		}

		if (e.getActionCommand().equals("Back")) {
			viewAC.getPanel().setVisible(false);
			viewHome.getPanel().setVisible(true);

		}

		if (e.getActionCommand().equals("Back2")) {
			viewAdminAdd.getPanel().setVisible(false);
			viewHome.getPanel().setVisible(true);

		}
	}

	

}
