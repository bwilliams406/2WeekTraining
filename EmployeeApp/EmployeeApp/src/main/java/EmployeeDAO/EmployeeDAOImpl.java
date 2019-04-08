package EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import EmployeeModel.EmployeeModel;

@Repository
public class EmployeeDAOImpl {
	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> employees = new ArrayList<EmployeeModel>();

		EmployeeModel vo1 = new EmployeeModel();
		vo1.setId(1);
		vo1.setFirstName("Dylan");
		vo1.setLastName("Fellows");
		employees.add(vo1);

		EmployeeModel vo2 = new EmployeeModel();
		vo2.setId(2);
		vo2.setFirstName("Brianne");
		vo2.setLastName("Kesh");
		employees.add(vo2);

		return employees;
	}
}
