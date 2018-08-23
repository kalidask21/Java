package com.cms.cmsserviceapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cms.cmsserviceapi.entity.Facility;
import com.cms.cmsserviceapi.entity.Printer;

@RepositoryRestResource(collectionResourceRel = "print", path = "print")
public interface PrintRepository extends JpaRepository<Printer,Integer> {

}
