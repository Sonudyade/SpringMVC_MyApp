package com.sony.SpringMvc.dto;

public class ForgetPassDTO {
	private String email;
	private int otp;
	private String newPassword;
	private String newCnfPassword;
	
	
    public ForgetPassDTO() {
    	System.out.println("ForgetPassDTO()constructor");
    }


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getOtp() {
		return otp;
	}


	public void setOtp(int otp) {
		this.otp = otp;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}


	public String getNewCnfPassword() {
		return newCnfPassword;
	}


	public void setNewCnfPassword(String newCnfPassword) {
		this.newCnfPassword = newCnfPassword;
	}


	@Override
	public String toString() {
		return "ForgetPassDTO [email=" + email + ", otp=" + otp + ", newPassword=" + newPassword + ", newCnfPassword="
				+ newCnfPassword + "]";
	}
}
