package com.cms.cmsserviceapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cms.cmsserviceapi.entity.Facility;
import com.cms.cmsserviceapi.entity.Kiosk;

@RepositoryRestResource(collectionResourceRel = "kiosk", path = "kiosk")
public interface KioskRepository extends JpaRepository<Kiosk,Integer> {

}
