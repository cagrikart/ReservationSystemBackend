package com.cke.reservationsystembackend.business.abstracts;

import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getListEmployee();
    Result addEmployee(Employee employee);
}
