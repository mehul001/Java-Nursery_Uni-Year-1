package View;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.Nursery_Controller;

public class View_Nursery_Homepage {
	
	private JPanel jPMain;
	private JButton jBAdmit, jBAdd_Admin, jBLogout, jBInvoices, jBChild_p;
	
	private Nursery_Controller controller;
	
	public View_Nursery_Homepage (Nursery_Controller controller){
		
		this.controller = controller;
		
		jPMain = new JPanel();
		jPMain.setBackground(Color.LIGHT_GRAY);
		jPMain.setBounds(0, 67, 1024, 733);
		jPMain.setLayout(null);
		
		jBAdmit = new JButton("Admit A Child");
		jBAdmit.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBAdmit.setBounds(57, 62, 217, 73);
		jBAdmit.addActionListener(this.controller);
		jBAdmit.setActionCommand("Admit Child");
		jPMain.add(jBAdmit);		
		
	    jBAdd_Admin = new JButton("Add Admin User");
	    jBAdd_Admin.setFont(new Font("Calibri", Font.PLAIN, 24));
	    jBAdd_Admin.setBounds(57, 167, 217, 73); 
	    jBAdd_Admin.addActionListener(this.controller);
	    jBAdd_Admin.setActionCommand("Add_Admin");
		jPMain.add(jBAdd_Admin);
		
		jBLogout = new JButton("Logout");
		jBLogout.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBLogout.setBounds(57, 269, 217, 73);
		jBLogout.addActionListener(this.controller);
		jBLogout.setActionCommand("Logout");
		jPMain.add(jBLogout);
		
		jBInvoices = new JButton("View Invoices");
		jBInvoices.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBInvoices.setBounds(349, 62, 217, 73);
		jBInvoices.addActionListener(this.controller);
		jBInvoices.setActionCommand("Invoice");
		jPMain.add(jBInvoices);	
		
		jBChild_p = new JButton("View Child Profile");
		jBChild_p.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBChild_p.setBounds(349, 167, 217, 73);
		jBChild_p.addActionListener(this.controller);
		jBChild_p.setActionCommand("child_p");
		jPMain.add(jBChild_p);
		
		this.controller.addNurseryHomeChildView(this);
	}
	
	public JPanel getPanel() {
		return this.jPMain;
	}
	
}
