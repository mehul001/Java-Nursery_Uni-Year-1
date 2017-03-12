package View;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Controller.Nursery_Controller;
import Model.Child;
import Model.NuseryFile;

public class View_Invoice {

	private JPanel jPMain;
	private JButton jBSearch, jBack_Invoices;
	private JComboBox jCBNames;
	private ArrayList<String> Child_list = new ArrayList<String>();

	private Nursery_Controller controller;

	public View_Invoice(Nursery_Controller controller) {

		this.controller = controller;

		jPMain = new JPanel();
		jPMain.setBackground(Color.LIGHT_GRAY);
		jPMain.setBounds(0, 67, 1024, 733);
		jPMain.setLayout(null);

		JLabel jBIntro = new JLabel(
				"Please select a child from the drop down menu to view there monthly invoice.");
		jBIntro.setForeground(Color.RED);
		jBIntro.setHorizontalAlignment(SwingConstants.CENTER);
		jBIntro.setFont(new Font("Calibri", Font.ITALIC, 20));
		jBIntro.setBounds(24, 29, 940, 34);
		jPMain.add(jBIntro);

		JLabel jLF_Name = new JLabel("Name Of Child ");
		jLF_Name.setHorizontalAlignment(SwingConstants.CENTER);
		jLF_Name.setFont(new Font("Calibri", Font.PLAIN, 22));
		jLF_Name.setBounds(100, 131, 176, 29);
		jPMain.add(jLF_Name);

		NuseryFile read = new NuseryFile("child.dat");
		ArrayList<Child> child = new ArrayList<Child>();
		child = read.getChild();

		for (Child c1 : child) {
			String name = c1.getName() + " " + c1.getSurname();
			Child_list.add(name);
			System.out.println(name);
		}

		jBSearch = new JButton("View Invoice");
		jBSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBSearch.setBounds(286, 214, 202, 66);
		jBSearch.addActionListener(this.controller);
		jBSearch.setActionCommand("search_invoice");
		jPMain.add(jBSearch);

		jBack_Invoices = new JButton("Back");
		jBack_Invoices.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jBack_Invoices.setBounds(51, 569, 202, 66);
		jBack_Invoices.addActionListener(this.controller);
		jBack_Invoices.setActionCommand("back_Invoice");
		jPMain.add(jBack_Invoices);

		this.controller.addInvoiceView(this);
	}	

	public void createDropdown(ArrayList<String> dropdown) {
		String[] newDropdown = dropdown.toArray(new String[dropdown.size()]);
		jCBNames = new JComboBox(newDropdown);
		jCBNames.setBounds(286, 131, 335, 29);
		jPMain.add(jCBNames);
	}
	
	public JPanel getPanel() {
		return this.jPMain;
	}
	
	public String getDropdown(){
		return this.jCBNames.getSelectedItem().toString();
	}

}
