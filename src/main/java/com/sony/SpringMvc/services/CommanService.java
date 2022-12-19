package com.sony.SpringMvc.services;

import com.sony.SpringMvc.dto.Details;
import com.sony.SpringMvc.dto.LoginDTO;
import com.sony.SpringMvc.entity.SpringMvcRegistrationDetails;

public interface CommanService {
	
	public String validateAndSave(Details details);
	
	
	public String validateAndLogin(LoginDTO dto);
	
	public SpringMvcRegistrationDetails getMyProfile(String email);
	
	
	public String validateAndSentOtp(String email);

	
	

}
