package com.sony.SpringMvc.services;

import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.SpringMvc.dao.DetailsDAO;
import com.sony.SpringMvc.dto.Details;
import com.sony.SpringMvc.dto.LoginDTO;
import com.sony.SpringMvc.entity.SpringMvcRegistrationDetails;
import com.sony.SpringMvc.util.MyAppUtils;

import antlr.StringUtils;


@Service
public class CommanServiceImpl implements CommanService{
	
	@Autowired
	private DetailsDAO dao;
	
	@Autowired
	private MyAppUtils util;

	public String validateAndSave(Details details) {
		
		if(details.getEmail() != null && !details.getEmail().isEmpty()) {
			if(details.getPassword() !=null && !details.getPassword().isEmpty()) {
				if(details.getCnfPassword() !=null && !details.getCnfPassword().isEmpty()
						&& details.getCnfPassword().equals(details.getPassword())) {
					
					SpringMvcRegistrationDetails regDetails = new SpringMvcRegistrationDetails();
					regDetails.setPassword(details.getPassword());
					regDetails.setEmail(details.getEmail());
					regDetails.setNumber(details.getNumber());
					
					dao.save(regDetails);
					return "Data saved";
					
					
				}else {
					return "Invalid cnfPassword";
				}
				
			}else {
				return "Invalid Password";
			}
			
		}else {
			return "Invalid email id";
		}
	    
	}

	public String validateAndLogin(LoginDTO dto) {
		if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
			if(dto.getPassword() !=null && !dto.getPassword().isEmpty()) {
				SpringMvcRegistrationDetails registrationDetails =dao.getByEmail(dto.getEmail());
				
				if(dto.getEmail().equals(registrationDetails.getEmail())
						&& dto.getPassword().equals(registrationDetails.getPassword())) {
					return  dto.getEmail();
					
				}else {
					return "Invalid email and password";
				}
				
				
			}else {
				return "Invalid Password";
			}
			
		}else {
			return "Invalid email id";
		}
	    
	}

	public SpringMvcRegistrationDetails getMyProfile(String email) {
		SpringMvcRegistrationDetails registrationDetails  = null;
		if(email != null && !email.isEmpty()) {
		 registrationDetails =dao.getByEmail(email);
		
		
	}
		return registrationDetails;
	}

	public String validateAndSentOtp(String email) {
		if(email != null && !email.isEmpty()) {
			SpringMvcRegistrationDetails registrationDetails =dao.getByEmail(email);
			if(registrationDetails != null) {
				int otp = util.generateOtp();
				//util.sendMail(email, otp);
				registrationDetails.setOTP(otp);
				
				dao.save(registrationDetails);
				
				return "OTP sent";
			}
			else {
				return  "email not registerd";
			}
				
		}else {
			return "invalid emailid";
		}
		
	}
}
	


