package com.cms.cmsserviceapi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cms.cmsserviceapi.model.FacilityDO;
import com.cms.cmsserviceapi.service.FacilityService;

@Component
public class FacilityServiceImpl implements FacilityService {

	private Logger log = Logger.getLogger(FacilityServiceImpl.class.getName());
	
	//Mock Data
	private static List<FacilityDO> listFacDO = new ArrayList<>();
	static {
		FacilityDO facilityDO = null;
        for(int i=0;i<=10;i++) {
        	facilityDO = new FacilityDO();
            facilityDO.setFacilityId("FacilityId"+i);
            facilityDO.setFacilityAddress("FacilityAddress "+i);
            facilityDO.setFacilityName("FacilityName "+i);
            facilityDO.setFacilityLocation("FacilityLocation"+i);
            listFacDO.add(facilityDO);
        }
	}
	
	@Override
	public List<FacilityDO> getFacilities() {
			return listFacDO;
	}

	@Override
	public List<FacilityDO> getFacilityById(String facId) {
		return  listFacDO.
				   stream()
				   .filter(facData -> facData.getFacilityId().equals(facId))
			   .collect(Collectors.toList());
	}

	@Override
	public boolean removeFacultyById(String facId) {
		Boolean isRemoved = listFacDO.removeIf((FacilityDO facDO) -> facDO.getFacilityId().equals(facId));
		log.info(facId + " removed , is success ? " +isRemoved);
		return isRemoved;
	}
	
}
