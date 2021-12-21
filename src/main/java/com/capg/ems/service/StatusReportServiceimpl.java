package com.capg.ems.service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ems.entities.StatusReport;
import com.capg.ems.repositories.StatusReportRepository;

@Service
public class StatusReportServiceimpl  {
	@Autowired
	public StatusReportRepository statusDao;
	
	
	public void addStatusReport(StatusReport statusreport) {
		statusDao.save(statusreport);
	}
	
	
	public List<StatusReport> getAllStatusReports(){
		List<StatusReport> sts = (List<StatusReport>)statusDao.findAll(); 
		return sts;
	}
	
	public long counts() {
		return  statusDao.count();
		
    }
	public void deleteStatusReport(int statusId){
		statusDao.deleteById(statusId);
	}
	 public StatusReport updateStatusReport(StatusReport statusReport) {
		 return statusDao.save(statusReport);
	 }

	
}

    
