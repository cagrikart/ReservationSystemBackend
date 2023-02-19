package com.cke.reservationsystembackend.business.conrete;

import com.cke.reservationsystembackend.business.abstracts.EmployeeService;
import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.core.utilities.results.SuccessDataResult;
import com.cke.reservationsystembackend.core.utilities.results.SuccessResult;
import com.cke.reservationsystembackend.model.Employee;
import com.cke.reservationsystembackend.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;


    @Override
    public DataResult<List<Employee>> getListEmployee() {
        return new SuccessDataResult<List<Employee>>(this.employeeRepository.findAll(),"listlendi");
    }

    @Override
    public Result addEmployee(Employee employee) {
        this.employeeRepository.save(employee);
        return new SuccessResult("employee adding ");
    }
}
