package com.cke.reservationsystembackend.api.controller;

import com.cke.reservationsystembackend.business.abstracts.EmployeeService;
import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.model.Customer;
import com.cke.reservationsystembackend.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService; // dependency injection

    @GetMapping("/getListCustomer")
    public DataResult<List<Employee>> getListEmployee() {
        return this.employeeService.getListEmployee();
    }
    @PostMapping(value = "/addEmployee",  produces  = "application/json",consumes  = "application/json")
    public Result addEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }
}
