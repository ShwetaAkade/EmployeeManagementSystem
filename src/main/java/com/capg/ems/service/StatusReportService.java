package com.capg.ems.service;

import java.util.List;
import com.capg.ems.entities.StatusReport;


public interface StatusReportService {
	
	 void addStatusReport(String statusreport);
	 List<StatusReport> getAllStatusReports(int userId,int compid);
	 long counts();
	 void deleteStatusReport(int statusId);
	 StatusReport updateStatusReport(StatusReport statusReport); 
	}


