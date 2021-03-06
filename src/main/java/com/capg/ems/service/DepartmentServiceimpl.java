package com.capg.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ems.entities.Department;
import com.capg.ems.repositories.DepartmentRepository;

@Service
public class DepartmentServiceimpl {
	@Autowired
	DepartmentRepository departDao;

	/************************************************************************************
	 * Method: addDepartment 
	 * Description: It is used to add Department into
	 *              Department table
	 */
	public void addDepartment(Department dName) {
		departDao.save(dName);
	}

	/************************************************************************************
	 * Method: deleteDepartmentById 
	 * Description: It is used to delete Department from
	 *              the Department table of respective id
	 */
	public void deleteDepartmentByID(int id) {
		departDao.deleteById(id);
	}

	/************************************************************************************
	 * Method: getAllDepartments
	 *  Description: It is used to get All department data
	 *               from Department table
	 */
	public List<Department> getAllDepartments() {
		List<Department> depts = (List<Department>) departDao.findAll();
		return depts;
	}

	/************************************************************************************
	 * Method: getDepartmentById 
	 * Description: It is used to get All department data
	 *              By Id from Department table
	 */
	public Optional<Department> getDepartmentById(int id) {
		return departDao.findById(id);
	}

	/************************************************************************************
	 * Method: counts 
	 * Description: It is used to get count of Records from department table
	 */
	public long counts() {
		return departDao.count();

	}

}
