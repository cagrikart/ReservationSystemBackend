package com.cke.reservationsystembackend.business.abstracts;

import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.model.Customer;

import java.util.List;

public interface CustomerService {
    DataResult<List<Customer>> getListCustomer();
    Result addCustomer (Customer customer);

}
