package com.cke.reservationsystembackend.business.abstracts;

import com.cke.reservationsystembackend.core.utilities.results.DataResult;
import com.cke.reservationsystembackend.core.utilities.results.Result;
import com.cke.reservationsystembackend.dto.AppintmentCustomerRequest;
import com.cke.reservationsystembackend.model.Appintment;

import java.util.List;

public interface AppintmentService {
    DataResult<List<Appintment>> getListAppintment();

    Result addAppintment(AppintmentCustomerRequest appintmentCustomerRequest);
}
