package com.cke.reservationsystembackend.business.conrete;

import com.cke.reservationsystembackend.business.abstracts.CustomerService;
import com.cke.reservationsystembackend.core.utilities.results.*;
import com.cke.reservationsystembackend.model.Customer;
import com.cke.reservationsystembackend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository  customerRepository;

    @Override
    public DataResult<List<Customer>> getListCustomer() {
        return new SuccessDataResult<List<Customer>>(this.customerRepository.findAll(),"listelendi");
    }

    @Override
    public Result addCustomer(Customer customer) {
        this.customerRepository.save(customer);
        return new SuccessResult("customer adding");
    }
}
