package com.capg.ems.service;

import java.util.List;
import com.capg.ems.entities.Department;

public interface DepartmentService {
	void addDepartment(String dName);

	List<Department> getAllDepartments();

	void deleteDepartment(int id);

	long counts();

	Department getDepartmentById(int id);

}
