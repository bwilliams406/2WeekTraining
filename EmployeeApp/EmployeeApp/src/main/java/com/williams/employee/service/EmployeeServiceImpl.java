package com.williams.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.employee.dao.EmployeeDAO;
import com.williams.employee.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao;

	public List<EmployeeModel> getAllEmployees() {
		return dao.getAllEmployees();
	}
}
