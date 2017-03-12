package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Nursery_Controller;

public class View_AddAdmin {

	private JPanel jPMain;
	private JButton jBBack, jBSave;
	private JLabel jLIntro, jLUser, jLPass, jLPas_2;
	private JTextField jTFUser;
	private JPasswordField jTFPass, jTFPass_2;

	private Nursery_Controller controller;

	public View_AddAdmin(Nursery_Controller controller) {

		this.controller = controller;

		jPMain = new JPanel();
		jPMain.setBackground(Color.LIGHT_GRAY);
		jPMain.setBounds(0, 67, 1024, 733);
		jPMain.setLayout(null);

		jLIntro = new JLabel(
				"Please fill out this form below to add an Admin to the system. All mandatory fields are marked with an asterisk (*).");
		jLIntro.setForeground(Color.RED);
		jLIntro.setHorizontalAlignment(SwingConstants.CENTER);
		jLIntro.setFont(new Font("Calibri", Font.ITALIC, 20));
		jLIntro.setBounds(28, 27, 955, 26);
		jPMain.add(jLIntro);

		jLUser = new JLabel("Username *");
		jLUser.setHorizontalAlignment(SwingConstants.CENTER);
		jLUser.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLUser.setBounds(126, 158, 176, 29);
		jPMain.add(jLUser);

		jLPass = new JLabel("Password *");
		jLPass.setHorizontalAlignment(SwingConstants.CENTER);
		jLPass.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLPass.setBounds(126, 210, 176, 29);
		jPMain.add(jLPass);

		jTFUser = new JTextField();
		jTFUser.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFUser.setBounds(326, 158, 220, 29);
		jPMain.add(jTFUser);
		jTFUser.setColumns(10);

		jTFPass = new JPasswordField();
		jTFPass.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFPass.setColumns(10);
		jTFPass.setBounds(326, 210, 220, 29);
		jPMain.add(jTFPass);

		jBSave = new JButton("Submit & Save");
		jBSave.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBSave.setBounds(768, 599, 187, 55);
		jBSave.addActionListener(this.controller);
		jBSave.setActionCommand("Save_Admin");
		jPMain.add(jBSave);

		jBBack = new JButton("Back");
		jBBack.setFont(new Font("Calibri", Font.PLAIN, 24));
		jBBack.setBounds(40, 599, 187, 55);
		jBBack.addActionListener(this.controller);
		jBBack.setActionCommand("Back2");
		jPMain.add(jBBack);

		jLPas_2 = new JLabel("Confirm Password *");
		jLPas_2.setHorizontalAlignment(SwingConstants.CENTER);
		jLPas_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		jLPas_2.setBounds(126, 263, 176, 29);
		jPMain.add(jLPas_2);

		jTFPass_2 = new JPasswordField();
		jTFPass_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		jTFPass_2.setColumns(10);
		jTFPass_2.setBounds(326, 263, 220, 29);
		jPMain.add(jTFPass_2);

		this.controller.addAdminView(this);

	}

	public JPanel getPanel() {
		return this.jPMain;
	}

	public String getUser() {
		return jTFUser.getText();
	}

	public String get_Pass() {
		String password = String.valueOf(jTFPass.getPassword());
		return password;
	}

	public String get_Pass2() {
		String password = String.valueOf(jTFPass_2.getPassword());
		return password;
	}

	public JPasswordField getPass() {
		return this.jTFPass;
	}

	public JPasswordField getPass_2() {
		return this.jTFPass_2;
	}

	public JTextField get_User() {
		return this.jTFUser;
	}

}
