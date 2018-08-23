package com.cms.cmsserviceapi.service;

import java.util.List;

import com.cms.cmsserviceapi.model.FacilityDO;

public interface FacilityService {

	List<FacilityDO> getFacilities();
	
	List<FacilityDO> getFacilityById(String facId);
	
	boolean removeFacultyById(String facId);
}
