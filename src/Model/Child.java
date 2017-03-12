package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

public class Child implements Serializable {

	private String name, surname, dob, add1, add2, city, postcode, allergy,
			parent_name, parent_surname, parent_homeno, parent_mobile;
	private double weeklyPrice, monthlyPrice, regFee, dueNow = 0.00;
	private int age;
	private HashMap<String, Session> sessionData = new HashMap<String, Session>();

	private Parent parent_1;

	public Child(String Name, String Surname, int age) {
		this.name = Name;
		this.surname = Surname;
		this.age = age;
	}

	public Child(String name, String surname, String DOB, String add1,
			String add2, String city, String postcode, String allergy,
			Parent parent_1, int age) {
		this.name = name;
		this.surname = surname;
		this.dob = DOB;
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.postcode = postcode;
		this.allergy = allergy;
		this.parent_1 = parent_1;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getDOB() {
		return this.dob;
	}

	public String getAddress_1() {
		return this.add1;
	}

	public String getAddress_2() {
		return this.add2;
	}

	public String getCity() {
		return this.city;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public String getAllergy() {
		return this.allergy;
	}

	public String getParent_Name() {
		return this.parent_name;
	}

	public String getParent_surname() {
		return this.parent_surname;
	}

	public String getParent_HomeNo() {
		return this.parent_homeno;
	}

	public String getParent_Mobile() {
		return this.parent_mobile;
	}

	public void set_AddSession(String day, Session session) {
		this.sessionData.put(day, session);
	}

	public HashMap<String, Session> getSession() {
		return this.sessionData; // returns the whole session hash map
	}

	private int getAllDays() {// only visible in this class
		int days = 0;

		for (Entry<String, Session> session_info : sessionData.entrySet()) {
			Session s = (Session) session_info.getValue();

			if (s.getSessionName().equals("All Day (8am to 6pm)")) {
				days = days + 1;
			}
		}
		System.out.println("Child Class getAllDays Function : " + days
				+ " Days");
		return days;
	}
	
	public String getFullName(){
		String name = (this.name + " " + this.surname);
		return name;
	}

	public double getPrice() {// Sets cost for all day for whole week offer
								// prices
		System.out.println("getPrice()" +weeklyPrice);
		if (getAllDays() == 5) {
			if (age < 2) {
				this.weeklyPrice = 145.00;
			}
			if ((age < 3) && (age >= 2)) {
				this.weeklyPrice = 140.00;
			}
			if (age >= 3) {
				this.weeklyPrice = 135.00;
			}
		} else {
			for (Entry<String, Session> session_info : sessionData.entrySet()) {
				Session s = (Session) session_info.getValue();
				weeklyPrice = weeklyPrice + s.getSessionCost();
			}
		}
		System.out.println("getPrice()" + weeklyPrice);
		return this.weeklyPrice;
	}

	public double getMonthlyPrice() {
		System.out.println("getMonthlyPrice()" + monthlyPrice);
		this.monthlyPrice = weeklyPrice * 4;
		System.out.println("getMonthlyPrice()" + monthlyPrice);
		return this.monthlyPrice;
	}

	public double getRegFee() {
		System.out.println("getRegFee()" + regFee);
		regFee = weeklyPrice + 25.00;
		System.out.println("getRegFee()" + regFee);
		return this.regFee;
	}

}
