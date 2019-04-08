package EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EmployeeModel.EmployeeModel;
import EmployeeService.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getAllEmployees")
	public List<EmployeeModel> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
