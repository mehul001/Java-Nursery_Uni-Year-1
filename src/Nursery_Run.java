import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import Controller.Nursery_Controller;
import View.View_AddAdmin;
import View.View_AdmitChild;
import View.View_Child;
import View.View_Header;
import View.View_Invoice;
import View.View_Login;
import View.View_Nursery_Homepage;

public class Nursery_Run {
	public static void main(String[] args) {
		
		try {
			UIManager
					.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");	
			
		JFrame Nursery_Frame = new JFrame();
		Nursery_Frame.setSize(1024, 800);
		Nursery_Frame.setLayout(null);
		Nursery_Frame.setResizable(false); 
		Nursery_Frame.setLocationRelativeTo(null);
		Nursery_Frame.setTitle("Northants Day Nursery v1");
		Nursery_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
		
		View_Header view_Header = new View_Header();
		Nursery_Frame.add(view_Header.getPanel());
		
		Nursery_Controller controller_h = new Nursery_Controller();
		
		View_Login viewlogin = new View_Login(controller_h);
		Nursery_Frame.add(viewlogin.getPanel());
		viewlogin.getPanel().setVisible(true); 
		
		View_Nursery_Homepage view_Homepage = new View_Nursery_Homepage(controller_h);
		Nursery_Frame.add(view_Homepage.getPanel());
		view_Homepage.getPanel().setVisible(false);
	    
		View_AdmitChild view_Admit = new View_AdmitChild(controller_h);
	    Nursery_Frame.add(view_Admit.getPanel());
	    view_Admit.getPanel().setVisible(false);

	    View_AddAdmin view_admin = new View_AddAdmin (controller_h);
	    Nursery_Frame.add(view_admin.getPanel());
	    view_admin.getPanel().setVisible(false);
	    
	    View_Invoice invoice = new View_Invoice (controller_h);
	    Nursery_Frame.add(invoice.getPanel());
	    invoice.getPanel().setVisible(false);
	    
	    View_Child child = new View_Child(controller_h);
	    Nursery_Frame.add(child.getPanel());
	    child.getPanel().setVisible(false);
	    
		Nursery_Frame.setVisible(true);
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			
			e.printStackTrace();
		}
		
	
	}

}	
