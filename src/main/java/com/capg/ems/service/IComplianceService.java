package com.capg.ems.service;

import java.util.List;
import com.capg.ems.dto.ComplianceDTO;

public interface IComplianceService {
	
	public ComplianceDTO addCompliance(ComplianceDTO com);
	public List<ComplianceDTO> getAllCompliances();
	public List<ComplianceDTO> getAllCompliance(int userId);
	ComplianceDTO updateCompliance(ComplianceDTO compliance); 
}
