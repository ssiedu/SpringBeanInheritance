package com.ssi;

public class Customer {
	private int code;
	private String cname;
	private String email;
	private String city;
	private String state;
	
	public Customer() {
		super();
	}
	

	public void showInfo(){
		System.out.println("Code  : "+code);
		System.out.println("Name  : "+cname);
		System.out.println("Adrs  : "+city+","+state);
		System.out.println("Mail  : "+email);
		System.out.println("_______________________________________________");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	
}
