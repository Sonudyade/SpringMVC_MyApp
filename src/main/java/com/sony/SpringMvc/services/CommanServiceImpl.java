package com.sony.SpringMvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sony.SpringMvc.dao.DetailsDAO;
import com.sony.SpringMvc.dto.Details;
import com.sony.SpringMvc.dto.LoginDTO;
import com.sony.SpringMvc.entity.SpringMvcRegistrationDetails;

import antlr.StringUtils;


@Service
public class CommanServiceImpl implements CommanService{
	
	@Autowired
	private DetailsDAO dao;

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
					return "Login Successfull";
					
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
	}
	


