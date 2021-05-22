package mstf.hrms.business.abstracts;

import java.util.List;

import mstf.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
