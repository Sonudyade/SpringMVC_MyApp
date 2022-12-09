package com.sony.SpringMvc.services;

import com.sony.SpringMvc.dto.Details;
import com.sony.SpringMvc.dto.LoginDTO;

public interface CommanService {
	
	public String validateAndSave(Details details);
	
	
	public String validateAndLogin(LoginDTO dto);
	
	

}
