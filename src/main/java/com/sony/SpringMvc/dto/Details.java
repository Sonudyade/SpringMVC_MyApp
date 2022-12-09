package com.sony.SpringMvc.dto;

public class Details {
	
	private String firstName;
	private String middelName;
	private String lastName;
	private String email;
	private String password;
	private String cnfPassword;
	private String number;
	private String address;
	private String age;
	private String Male;
	private String Female;
	private String Others;
	
	public Details() {
		System.out.println("Default Details ()");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfPassword() {
		return cnfPassword;
	}

	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMale() {
		return Male;
	}

	public void setMale(String male) {
		Male = male;
	}

	public String getFemale() {
		return Female;
	}

	public void setFemale(String female) {
		Female = female;
	}

	public String getOthers() {
		return Others;
	}

	public void setOthers(String others) {
		Others = others;
	}

	@Override
	public String toString() {
		return "Details [firstName=" + firstName + ", middelName=" + middelName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", cnfPassword=" + cnfPassword + ", number=" + number
				+ ", address=" + address + ", age=" + age + ", Male=" + Male + ", Female=" + Female + ", Others="
				+ Others + "]";
	}
	
	

}
