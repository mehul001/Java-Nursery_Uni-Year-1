package Model;

import java.io.Serializable;

public class Parent implements Serializable{
	
	private String name, surname, homeNo, mobile;
	
	public Parent(String Name, String Surname, String HomeNo, String Mobile){
		this.name = Name;
		this.surname = Surname;
		this.homeNo = HomeNo;
		this.mobile = Mobile;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;	
	}
	
	public String getHomeNo(){
		return this.homeNo;
	}
	
	public String getMobile(){
		return this.mobile;
	}
	
}
