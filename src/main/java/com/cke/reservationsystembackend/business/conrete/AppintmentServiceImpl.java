package com.cke.reservationsystembackend.business.conrete;

import com.cke.reservationsystembackend.business.abstracts.AppintmentService;
import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.core.utilities.results.SuccessDataResult;
import com.cke.reservationsystembackend.core.utilities.results.SuccessResult;
import com.cke.reservationsystembackend.dto.AppintmentCustomerRequest;
import com.cke.reservationsystembackend.model.Appintment;
import com.cke.reservationsystembackend.model.Customer;
import com.cke.reservationsystembackend.repository.AppintmentRepository;
import com.cke.reservationsystembackend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppintmentServiceImpl implements AppintmentService {
    private final AppintmentRepository appintmentRepository;

    private final CustomerRepository customerRepository;
    @Override
    public DataResult<List<Appintment>> getListAppintment() {
        return new SuccessDataResult<List<Appintment>>(this.appintmentRepository.findAll(),"appintment listed");
    }

    @Override
    public Result addAppintment(AppintmentCustomerRequest appintmentCustomerRequest) {
        Customer customerDb = this.customerRepository.findById(appintmentCustomerRequest.getCustomerId()).get();
        Appintment appintment = new Appintment();
        appintment.setAppointmentDateTime(appintmentCustomerRequest.getAppintmentTime());
        appintment.setCustomer(customerDb);
        this.appintmentRepository.save(appintment);
        return new SuccessResult("saved appintment");
    }
}
