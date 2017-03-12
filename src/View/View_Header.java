package View;

import java.awt.*;
import javax.swing.*;

public class View_Header {
	private JPanel jPHeader;
	private JLabel jLTitle;	
	
	
	public View_Header (){
		
		jPHeader = new JPanel();
		jPHeader.setBackground(Color.BLACK);
		jPHeader.setBounds(0, 0, 1024, 67);
		jPHeader.setLayout(null);

		jLTitle = new JLabel("Northants Day Nursery");
		jLTitle.setBounds(656, 11, 342, 44);
		jPHeader.add(jLTitle);
		jLTitle.setForeground(Color.WHITE);
		jLTitle.setFont(new Font("Calibri", Font.BOLD, 36));
		jLTitle.setHorizontalAlignment(SwingConstants.RIGHT);

	}
	
	public JPanel getPanel() {
		return this.jPHeader;
	}
}
