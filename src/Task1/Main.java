package Task1;

import java.io.FileNotFoundException;

public class Main {
	public Main()  {
		EmployeesData employeesData = new EmployeesData("employees.csv");
		System.out.println(employeesData.getSalariesByDepartment("FinOps"));
		System.out.println(employeesData.getOverallSalaryAmount());
		System.out.println(employeesData.getMostExpansiveDepartment());
	}
}
