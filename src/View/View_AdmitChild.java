package View;

import java.awt.*;

import javax.swing.*;

import Controller.Nursery_Controller;

public class View_AdmitChild {

	private JPanel jPMain;
	private JButton jBBack, jBSave;
	private JLabel jLIntro, jLF_Name, jLSurname, jLAddress_1, jLAddress_2,
			jLDob, jLCity, jLPostcode, jLAllergyInfo, jLReg_Fee, jLSession,
			jLF_Name_P, jLF_Surname_P, jLHome_N, jLMobile, jLPrice, lblMonday,lblTuesday,lblWednesday,lblThursday,lblFriday;
	private JTextField jTFC_First_Name, jTFC_DOB, jTFC_Address, jTFC_Postcode,
			jTFC_Allergy, jTFC_Address_1, jTFC_Surname, jTFC_City, jTFP_Name,
			jTFP_Surname, jTFP_HomeNo, jTFP_Mobile, jTFPrice;
	private JCheckBox jCB_Reg_Fee;
	private JComboBox jCB_Day_1, jCB_Day_2, jCB_Day_3, jCB_Day_4, jCB_Day_5;
	private JRadioButton jRBBirth_2, jRB2_3Years, jRB3Years;
	private final ButtonGroup ageGroup = new ButtonGroup();

	private Nursery_Controller controller;
	
	public View_AdmitChild(Nursery_Controller controller) {

		this.controller = controller;

		jPMain = new JPanel();
		jPMain.setBackground(Color.LIGHT_GRAY);
		jPMain.setBounds(0, 67, 1024, 800);
		jPMain.setLayout(null);

		jLIntro = new JLabel(
				"Please fill out this form below to admit a child to the nursery. All mandatory fields are marked with an asterisk (*).");
		jLIntro.setForeground(Color.RED);
		jLIntro.setHorizontalAlignment(SwingConstants.CENTER);
		jLIntro.setFont(new Font("Calibri", Font.ITALIC, 20));
		jLIntro.setBounds(28, 27, 955, 26);
		jPMain.add(jLIntro);

		jLF_Name = new JLabel("First Name (Child) *");
		jLF_Name.setHorizontalAlignment(SwingConstants.CENTER);
		jLF_Name.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLF_Name.setBounds(38, 64, 176, 29);
		jPMain.add(jLF_Name);

		jLSurname = new JLabel("Surname (Child) *");
		jLSurname.setHorizontalAlignment(SwingConstants.CENTER);
		jLSurname.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLSurname.setBounds(38, 104, 176, 29);
		jPMain.add(jLSurname);

		jLDob = new JLabel("Date Of Birth (Child) *");
		jLDob.setHorizontalAlignment(SwingConstants.CENTER);
		jLDob.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLDob.setBounds(38, 144, 176, 29);
		jPMain.add(jLDob);

		jLAddress_1 = new JLabel("Address Line 1 *");
		jLAddress_1.setHorizontalAlignment(SwingConstants.CENTER);
		jLAddress_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLAddress_1.setBounds(38, 184, 176, 29);
		jPMain.add(jLAddress_1);

		jLAddress_2 = new JLabel("Address Line 2");
		jLAddress_2.setHorizontalAlignment(SwingConstants.CENTER);
		jLAddress_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLAddress_2.setBounds(38, 224, 176, 29);
		jPMain.add(jLAddress_2);

		jLCity = new JLabel("City *");
		jLCity.setHorizontalAlignment(SwingConstants.CENTER);
		jLCity.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLCity.setBounds(38, 264, 176, 29);
		jPMain.add(jLCity);

		jLPostcode = new JLabel("Postcode *");
		jLPostcode.setHorizontalAlignment(SwingConstants.CENTER);
		jLPostcode.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLPostcode.setBounds(38, 304, 176, 29);
		jPMain.add(jLPostcode);

		jLAllergyInfo = new JLabel("Allergy Details ");
		jLAllergyInfo.setHorizontalAlignment(SwingConstants.CENTER);
		jLAllergyInfo.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLAllergyInfo.setBounds(38, 344, 176, 29);
		jPMain.add(jLAllergyInfo);

		jLReg_Fee = new JLabel("Registration Fee (\u00A325) *");
		jLReg_Fee.setHorizontalAlignment(SwingConstants.CENTER);
		jLReg_Fee.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLReg_Fee.setBounds(28, 380, 209, 29);
		jPMain.add(jLReg_Fee);

		jLSession = new JLabel("Session *");
		jLSession.setHorizontalAlignment(SwingConstants.CENTER);
		jLSession.setFont(new Font("Calibri", Font.PLAIN, 28));
		jLSession.setBounds(515, 242, 209, 41);
		jPMain.add(jLSession);

		jLF_Name_P = new JLabel("First Name (Parent 1) *");
		jLF_Name_P.setHorizontalAlignment(SwingConstants.CENTER);
		jLF_Name_P.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLF_Name_P.setBounds(521, 64, 176, 29);
		jPMain.add(jLF_Name_P);

		jLF_Surname_P = new JLabel("Surname (Parent 1) *");
		jLF_Surname_P.setHorizontalAlignment(SwingConstants.CENTER);
		jLF_Surname_P.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLF_Surname_P.setBounds(521, 104, 176, 29);
		jPMain.add(jLF_Surname_P);

		jLHome_N = new JLabel("Home No. (Parent 1) *");
		jLHome_N.setHorizontalAlignment(SwingConstants.CENTER);
		jLHome_N.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLHome_N.setBounds(521, 144, 176, 29);
		jPMain.add(jLHome_N);

		jLMobile = new JLabel("Mobile No. (Parent 1) *");
		jLMobile.setHorizontalAlignment(SwingConstants.CENTER);
		jLMobile.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLMobile.setBounds(521, 184, 176, 29);
		jPMain.add(jLMobile);

		jTFC_First_Name = new JTextField();
		jTFC_First_Name.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_First_Name.setBounds(238, 64, 220, 29);
		jTFC_First_Name.setColumns(10);
		jPMain.add(jTFC_First_Name);

		jTFC_Surname = new JTextField();
		jTFC_Surname.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_Surname.setColumns(10);
		jTFC_Surname.setBounds(238, 104, 220, 29);
		jPMain.add(jTFC_Surname);

		jTFC_DOB = new JTextField();
		jTFC_DOB.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_DOB.setColumns(10);
		jTFC_DOB.setBounds(238, 144, 220, 29);
		jPMain.add(jTFC_DOB);

		jTFC_Address = new JTextField();
		jTFC_Address.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_Address.setColumns(10);
		jTFC_Address.setBounds(238, 184, 220, 29);
		jPMain.add(jTFC_Address);

		jTFC_Address_1 = new JTextField();
		jTFC_Address_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_Address_1.setColumns(10);
		jTFC_Address_1.setBounds(238, 224, 220, 29);
		jPMain.add(jTFC_Address_1);

		jTFC_City = new JTextField();
		jTFC_City.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_City.setColumns(10);
		jTFC_City.setBounds(238, 264, 220, 29);
		jPMain.add(jTFC_City);

		jTFC_Postcode = new JTextField();
		jTFC_Postcode.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_Postcode.setColumns(10);
		jTFC_Postcode.setBounds(238, 304, 220, 29);
		jPMain.add(jTFC_Postcode);

		jTFC_Allergy = new JTextField();
		jTFC_Allergy.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFC_Allergy.setBounds(238, 344, 220, 29);
		jPMain.add(jTFC_Allergy);

		jTFP_Name = new JTextField();
		jTFP_Name.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFP_Name.setColumns(10);
		jTFP_Name.setBounds(721, 64, 220, 29);
		jPMain.add(jTFP_Name);

		jTFP_Surname = new JTextField();
		jTFP_Surname.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFP_Surname.setColumns(10);
		jTFP_Surname.setBounds(721, 104, 220, 29);
		jPMain.add(jTFP_Surname);

		jTFP_HomeNo = new JTextField();
		jTFP_HomeNo.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFP_HomeNo.setColumns(10);
		jTFP_HomeNo.setBounds(721, 144, 220, 29);
		jPMain.add(jTFP_HomeNo);

		jTFP_Mobile = new JTextField();
		jTFP_Mobile.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFP_Mobile.setColumns(10);
		jTFP_Mobile.setBounds(721, 184, 220, 29);
		jPMain.add(jTFP_Mobile);

		jCB_Reg_Fee = new JCheckBox("Paid");
		jCB_Reg_Fee.setBackground(Color.LIGHT_GRAY);
		jCB_Reg_Fee.setForeground(Color.BLACK);
		jCB_Reg_Fee.setHorizontalAlignment(SwingConstants.CENTER);
		jCB_Reg_Fee.setBounds(243, 380, 21, 29);
		jCB_Reg_Fee.addActionListener(this.controller);
		jCB_Reg_Fee.setActionCommand("jCB_Reg_Fee");
		jPMain.add(jCB_Reg_Fee);

		

		jRBBirth_2 = new JRadioButton("Birth To 2 Years");
		jRBBirth_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		ageGroup.add(jRBBirth_2);
		jRBBirth_2.setBackground(Color.LIGHT_GRAY);
		jRBBirth_2.setBounds(508, 290, 176, 23);
		jRBBirth_2.addActionListener(this.controller);
		jRBBirth_2.setActionCommand("jRBBirth_2");
		jPMain.add(jRBBirth_2);

		jRB2_3Years = new JRadioButton("2 To 3 Years");
		jRB2_3Years.setFont(new Font("Calibri", Font.PLAIN, 18));
		ageGroup.add(jRB2_3Years);
		jRB2_3Years.setBackground(Color.LIGHT_GRAY);
		jRB2_3Years.setBounds(686, 290, 151, 23);
		jRB2_3Years.addActionListener(this.controller);
		jRB2_3Years.setActionCommand("jRB2_3Years");
		jPMain.add(jRB2_3Years);

		jRB3Years = new JRadioButton("3 Years and Over");
		jRB3Years.setFont(new Font("Calibri", Font.PLAIN, 18));
		ageGroup.add(jRB3Years);
		jRB3Years.setBackground(Color.LIGHT_GRAY);
		jRB3Years.setBounds(839, 290, 157, 23);
		jRB3Years.addActionListener(this.controller);
		jRB3Years.setActionCommand("jRB3Years");
		jPMain.add(jRB3Years);

			
		lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblMonday.setBounds(521, 330, 138, 29);
		jPMain.add(lblMonday);
		
		lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblTuesday.setBounds(521, 380, 138, 29);
		jPMain.add(lblTuesday);
		
		lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblThursday.setBounds(521, 478, 138, 29);
		jPMain.add(lblThursday);
		
		lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblWednesday.setBounds(521, 428, 138, 29);
		jPMain.add(lblWednesday);
		
		lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblFriday.setBounds(521, 528, 138, 29);
		jPMain.add(lblFriday);
		
		String dropdown[] = {"None", "All Day (8am to 6pm)", "Morning (8am to 12pm)", "Lunch (12pm to 1 pm)", "Afternoon (1pm to 6 pm)", "Pre School (9am to 3.30pm)", "Full Holiday Care (5 yrs +) (8am to 6pm)"};
		
		jCB_Day_1 = new JComboBox(dropdown);
		jCB_Day_1.setToolTipText("Please Select A Session From The Dropdown Menu");
		jCB_Day_1.setBackground(Color.WHITE);
		jCB_Day_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		jCB_Day_1.setBounds(683, 330, 300, 29);
		jPMain.add(jCB_Day_1);
		
		jCB_Day_2 = new JComboBox(dropdown);
		jCB_Day_2.setToolTipText("Please Select A Session From The Dropdown Menu");
		jCB_Day_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		jCB_Day_2.setBackground(Color.WHITE);
		jCB_Day_2.setBounds(683, 380, 300, 29);
		jPMain.add(jCB_Day_2);
		
		jCB_Day_4 = new JComboBox(dropdown);
		jCB_Day_4.setToolTipText("Please Select A Session From The Dropdown Menu");
		jCB_Day_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		jCB_Day_4.setBackground(Color.WHITE);
		jCB_Day_4.setBounds(683, 478, 300, 29);
		jPMain.add(jCB_Day_4);
		
		jCB_Day_3 = new JComboBox(dropdown);
		jCB_Day_3.setToolTipText("Please Select A Session From The Dropdown Menu");
		jCB_Day_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		jCB_Day_3.setBackground(Color.WHITE);
		jCB_Day_3.setBounds(683, 428, 300, 29);
		jPMain.add(jCB_Day_3);
		
		jCB_Day_5 = new JComboBox(dropdown);
		jCB_Day_5.setToolTipText("Please Select A Session From The Dropdown Menu");
		jCB_Day_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		jCB_Day_5.setBackground(Color.WHITE);
		jCB_Day_5.setBounds(683, 528, 300, 29);
		jPMain.add(jCB_Day_5);
		

		jBSave = new JButton("Submit & Save");
		jBSave.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBSave.setBounds(768, 599, 187, 55);
		jBSave.addActionListener(this.controller);
		jBSave.setActionCommand("Save_Admit");
		jPMain.add(jBSave);

		jBBack = new JButton("Back");
		jBBack.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBBack.setBounds(40, 599, 187, 55);
		jBBack.addActionListener(this.controller);
		jBBack.setActionCommand("Back");
		jPMain.add(jBBack);

		this.controller.addAdmitChildView(this);
	}

	// Returns

	public JCheckBox setjCB_Reg_Fee() {
		return this.jCB_Reg_Fee ;
	}

	public JRadioButton setjRBBirth_2() {
		return	this.jRBBirth_2 ;
	}

	public JRadioButton setjRB2_3Years() {
		return	this.jRB2_3Years ;
	}

	public JRadioButton setjRB3Years() {
		return	this.jRB3Years ;
	}

	public JTextField get_jTFC_First_Name() {
		return this.jTFC_First_Name;
	}

	public JTextField get_jTFC_DOB() {
		return this.jTFC_DOB;
	}

	public JTextField get_jTFC_Address() {
		return this.jTFC_Address;
	}

	public JTextField get_jTFC_Postcode() {
		return this.jTFC_Postcode;
	}

	public JTextField get_jTFC_Address_1() {
		return this.jTFC_Address_1;
	}

	public JTextField get_jTFC_Surname() {
		return this.jTFC_Surname;
	}

	public JTextField get_jTFC_City() {
		return this.jTFC_City;
	}

	public JTextField get_jTFP_Name() {
		return this.jTFP_Name;
	}

	public JTextField get_jTFP_Surname() {
		return this.jTFP_Surname;
	}

	public JTextField get_jTFP_HomeNo() {
		return this.jTFP_HomeNo;
	}

	public JTextField get_jTFP_Mobile() {
		return this.jTFP_Mobile;
	}

	public JTextField get_Allergy() {
		return this.jTFC_Allergy;
	}

	public JPanel getPanel() {
		return this.jPMain;
	}

	public String getFirstName_Child() {
		return this.jTFC_First_Name.getText();
	}

	public String getSurname_Child() {
		return this.jTFC_Surname.getText();
	}

	public String getDOB_Child() {
		return this.jTFC_DOB.getText();
	}

	public String getAdd_Child() {
		return this.jTFC_Address.getText();
	}

	public String getAdd_1_Child() {
		return this.jTFC_Address_1.getText();
	}

	public String getCity_Child() {
		return this.jTFC_City.getText();
	}

	public String getPCode_Child() {
		return this.jTFC_Postcode.getText();
	}

	public String getAllergy() {
		return this.jTFC_Allergy.getText();
	}

	public String getName_p1() {
		return this.jTFP_Name.getText();
	}

	public String getSurname_p1() {
		return this.jTFP_Surname.getText();
	}

	public String getHomeno_p1() {
		return this.jTFP_HomeNo.getText();
	}

	public String getMobile_p1() {
		return this.jTFP_Mobile.getText();
	}
	
	public String getDay1(){
		return this.jCB_Day_1.getSelectedItem().toString();
	}
	
	public String getDay2(){
		return this.jCB_Day_2.getSelectedItem().toString();
	}
	
	public String getDay3(){
		return this.jCB_Day_3.getSelectedItem().toString();
	}
	
	public String getDay4(){
		return this.jCB_Day_4.getSelectedItem().toString();
	}
	
	public String getDay5(){
		return this.jCB_Day_5.getSelectedItem().toString();
	}
	
	public JCheckBox set_regFee(){
		return this.jCB_Reg_Fee;
	}
	
	public JComboBox set_jCB_Day_1(){
		return this.jCB_Day_1;
	}
	
	public JComboBox set_jCB_Day_2(){
		return this.jCB_Day_2;
	}
	
	public JComboBox set_jCB_Day_3(){
		return this.jCB_Day_3;
	}
	
	public JComboBox set_jCB_Day_4(){
		return this.jCB_Day_4;
	}
	
	public JComboBox set_jCB_Day_5(){
		return this.jCB_Day_5;
	}
	
	
	
	
}