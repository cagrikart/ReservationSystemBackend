package com.cke.reservationsystembackend.api.controller;

import com.cke.reservationsystembackend.business.abstracts.CustomerService;
import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.core.utilities.results.SuccessDataResult;
import com.cke.reservationsystembackend.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/getListCustomer")
    public DataResult<List<Customer>> getListCustomer() {
        return this.customerService.getListCustomer();
    }
    @PostMapping(value = "/addCustomer",  produces  = "application/json",consumes  = "application/json")
    public Result addCustomer(@RequestBody Customer customer) {
        return this.customerService.addCustomer(customer);
    }

}
