package com.dataservice.vmsserviceapi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataservice.vmsserviceapi.exceptions.FacilityException;
import com.dataservice.vmsserviceapi.model.FacilityDO;
import com.dataservice.vmsserviceapi.service.FacilityService;

@RestController
public class FacilityController {

	@Autowired
	private FacilityService facilityService;
	
	
	@RequestMapping(value="/facilities",method = RequestMethod.GET)
	@ResponseBody
    public List<FacilityDO> getFacilities(){
    	return facilityService.getFacilities();
    }
	
	@RequestMapping(value="/facility/{facId}",method = RequestMethod.GET)
	@ResponseBody
    public List<FacilityDO> getfacilitById(@PathVariable String facId){
		if(CollectionUtils.isEmpty(facilityService.getFacilityById(facId))) {
			throw new FacilityException("Facility not found");
		}
		return facilityService.getFacilityById(facId);
    }
	
	
	@RequestMapping(value="/facility/{facId}",method = RequestMethod.DELETE)
	@ResponseBody
    public String removefacilitById(@PathVariable String facId){
		return facilityService.removeFacultyById(facId) ? "SuccessFully Removed "+facId : "Remove is failed";
    }
}
