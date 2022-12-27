package com.sony.SpringMvc.dto;

import lombok.Data;

@Data
public class ForgetPassDTO {
	private String email;
	private int otp;
	private String newPassword;
	private String newCnfPassword;
	
	
   
}
