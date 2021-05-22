package mstf.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import mstf.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
