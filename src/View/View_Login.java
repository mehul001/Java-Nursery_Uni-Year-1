package View;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.Nursery_Controller;

public class View_Login {
	
	private JPanel jPMain;
	private JButton jBAdmit, jBLogout, jBLogin;
	private JTextField jTF_User;
	private JPasswordField jTF_Pass;
	private JLabel jLUser, jLPass, jLIntro;
	
	private Nursery_Controller controller;
	
	public View_Login (Nursery_Controller controller){
		
		this.controller = controller;
		
		jPMain = new JPanel();
		jPMain.setBackground(Color.LIGHT_GRAY);
		jPMain.setBounds(0, 67, 1024, 733);
		jPMain.setLayout(null);
		
		jLUser = new JLabel("Username");
		jLUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLUser.setBounds(291, 283, 148, 29);
		jPMain.add(jLUser);
		
		jLPass = new JLabel("Password");
		jLPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLPass.setBounds(291, 340, 148, 29);
		jPMain.add(jLPass);
		
		jTF_User = new JTextField();
		jTF_User.setBounds(493, 286, 200, 29);
		jPMain.add(jTF_User);
		jTF_User.setColumns(10);
		
		jTF_Pass = new JPasswordField();
		jTF_Pass.setBounds(493, 343, 200, 29);
		jPMain.add(jTF_Pass);
		jTF_Pass.setColumns(10);
		
		jLIntro = new JLabel("Please login using your credentials");
		jLIntro.setHorizontalAlignment(SwingConstants.CENTER);
		jLIntro.setFont(new Font("Tahoma", Font.BOLD, 24));
		jLIntro.setBounds(10, 117, 988, 89);
		jPMain.add(jLIntro);	
		
		jBLogin = new JButton("Login");
		jBLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBLogin.setBounds(437, 423, 187, 55);
		jBLogin.setActionCommand("Login");
		jBLogin.addActionListener(this.controller);
		jPMain.add(jBLogin);
		
		this.controller.addNurseryloginView(this);
	}
	
	public JPanel getPanel() {
		return this.jPMain;
	}
	
	public String getUser(){		
		return jTF_User.getText();
	}
	
	public String getPass(){
		String password = String.valueOf(jTF_Pass.getPassword());
		return password;
	}
	
	public JTextField get_User(){
		return this.jTF_User;
	}
	
	public JPasswordField get_Pass(){
		return this.jTF_Pass;
	}
}
