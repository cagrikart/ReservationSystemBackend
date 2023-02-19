package com.cke.reservationsystembackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class AppintmentCustomerRequest {
    private Date appintmentTime;
    private Long customerId;
}
