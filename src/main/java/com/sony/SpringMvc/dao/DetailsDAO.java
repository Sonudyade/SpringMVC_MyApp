package com.sony.SpringMvc.dao;

import com.sony.SpringMvc.entity.SpringMvcRegistrationDetails;

public interface DetailsDAO {
	
   public void save(SpringMvcRegistrationDetails details);
   
   
   public SpringMvcRegistrationDetails getByEmail(String email);

}
