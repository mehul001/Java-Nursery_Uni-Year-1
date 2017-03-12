package Model;

import java.io.Serializable;

public class Session implements Serializable {

	private String SessionName;
	private double price = 0.00;
	
	public Session(String SessionName, double price) {
		this.SessionName = SessionName;
		this.price = price;
	}
	
	public String getSessionName(){
		return this.SessionName;
	}
	
	public double getSessionCost(){		
		return this.price;
	}

}