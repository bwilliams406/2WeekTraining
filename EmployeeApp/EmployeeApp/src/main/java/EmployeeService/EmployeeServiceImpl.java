package EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import EmployeeDAO.EmployeeDAO;
import EmployeeModel.EmployeeModel;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO dao;

	public List<EmployeeModel> getAllEmployees() {
		return dao.getAllEmployees();
	}
}
