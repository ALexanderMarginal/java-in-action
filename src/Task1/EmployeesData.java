package Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeesData implements EmployeesDataProvider {

	private final Map<String, Integer> departmentToSalary;

	private int overallSalaryAmount = 0;

	private String maxSalaryDepartment;

	public EmployeesData(String file) {
		departmentToSalary = new HashMap<>();
		try (BufferedReader bufferedReader = BufferReaderFromResources.getBufferReader(file)) {

			bufferedReader.readLine();
			String line = bufferedReader.readLine();

			while (line != null) {
				String[] split = line.split(",");
				String department = split[2];
				int salary = Integer.parseInt(split[3]);
				if (!departmentToSalary.containsKey(department)) {
					departmentToSalary.put(department, 0);
				}
				departmentToSalary.put(department, departmentToSalary.get(department) + salary);

				overallSalaryAmount += salary;

				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getSalariesByDepartment(String department) {
		return departmentToSalary.get(department);
	}

	@Override
	public int getOverallSalaryAmount() {
		return overallSalaryAmount;
	}

	@Override
	public String getMostExpansiveDepartment() {
		if (maxSalaryDepartment == null) {
			String maxDepartment = null;
			int maxSalary = 0;
			for (Map.Entry<String, Integer> entry : departmentToSalary.entrySet()) {
				String department = entry.getKey();
				Integer salary = entry.getValue();
				if (salary > maxSalary) {
					maxSalary = salary;
					maxDepartment = department;
				}
			}
			maxSalaryDepartment = maxDepartment;
		}

		return maxSalaryDepartment;
	}
}
