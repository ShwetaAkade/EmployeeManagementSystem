package com.capg.ems.service;

import java.util.List;

import com.capg.ems.dto.EmployeeDTO;

public interface IEmployeeService {

	public EmployeeDTO addEmloyee(EmployeeDTO emp);

	public void deleteEmployee(int userId);

	public EmployeeDTO updateEmployee(EmployeeDTO emp);

	public List<EmployeeDTO> getAllEmployees();

	public EmployeeDTO getEmployeeById(int userid);

	public List<EmployeeDTO> getAllEmployeesByPagination(String maxPage, String ofset);

	public long getEmployeeCount();

}
