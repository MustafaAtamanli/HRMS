package mstf.hrms.dataAccess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mstf.hrms.business.abstracts.JobTitleService;
import mstf.hrms.dataAccess.abstracts.JobTitleDao;
import mstf.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		
		return jobTitleDao.findAll();
	}

}
