package com.cke.reservationsystembackend.repository;

import com.cke.reservationsystembackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
