package com.cms.cmsserviceapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cms.cmsserviceapi.entity.Facility;

@RepositoryRestResource(collectionResourceRel = "facility", path = "facility")
public interface FacilityRepository extends JpaRepository<Facility,Integer> {

}
