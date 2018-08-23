package com.dataservice.vmsserviceapi.service;

import java.util.List;

import com.dataservice.vmsserviceapi.model.FacilityDO;

public interface FacilityService {

	List<FacilityDO> getFacilities();
	
	List<FacilityDO> getFacilityById(String facId);
	
	boolean removeFacultyById(String facId);
}
