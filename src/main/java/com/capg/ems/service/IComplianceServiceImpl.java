package com.capg.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ems.dto.ComplianceDTO;
import com.capg.ems.entities.Compliance;
import com.capg.ems.repositories.IComplianceRepository;

@Service
public class IComplianceServiceImpl {

	@Autowired
	IComplianceRepository icomplianceRepository;

	/************************************************************************************
	 * Method: addCompliance
	 * Description: It is used to add compliance into Compliance table
	 */
	public ComplianceDTO addCompliance(ComplianceDTO com) {
		Compliance c = convertToEntity(com);
		Compliance updatedC = icomplianceRepository.save(c);
		return convertToDTO(updatedC);

	}

	/************************************************************************************
	 * Method: getAllCompliances
	 *  Description: It is used to get All compliances data
	 *               from compliance table
	 */
	public List<ComplianceDTO> getAllCompliances() {
		Iterable<Compliance> comps = icomplianceRepository.findAll();
		List<ComplianceDTO> dtoList = new ArrayList<>();
		for (Compliance compliance : comps) {
			ComplianceDTO dto = convertToDTO(compliance);
			dtoList.add(dto);
		}
		return dtoList;
	}

	/************************************************************************************
	 * Method: getComplianceById 
	 * Description: It is used to get All compliance data
	 *              By Id from Department table
	 */
	public Optional<Compliance> getComplianceById(int complianceId) {
		return icomplianceRepository.findById(complianceId);
	}
	
	/************************************************************************************
	 * Method: updateCompliance
	 * Description: It is used to update compliance records of compliance table
	 */
	 public  ComplianceDTO updateCompliance(ComplianceDTO compliance) {
		 Compliance com = convertToEntity(compliance);
	     Compliance updatedEnt = icomplianceRepository.save(com);
			return convertToDTO(updatedEnt);
	 }

	ComplianceDTO convertToDTO(Compliance com) {
		ComplianceDTO dto = new ComplianceDTO();
		dto.setComplianceId(com.getComplianceId());
		dto.setItype(com.getItype());
		dto.setDetails(com.getDetails());
		dto.setCreatedate(com.getCreatedate());
		dto.setStatus(com.getStatus());
		return dto;
	}

	Compliance convertToEntity(ComplianceDTO dto) {
		Compliance entity = new Compliance();
		entity.setComplianceId(dto.getComplianceId());
		entity.setItype(dto.getItype());
		entity.setDetails(dto.getDetails());
		entity.setCreatedate(dto.getCreatedate());
		entity.setStatus(dto.getStatus());
		// entity.setId(dto.getUserId());
		return entity;

	}

}
