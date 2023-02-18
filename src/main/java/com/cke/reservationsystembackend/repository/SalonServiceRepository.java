package com.cke.reservationsystembackend.repository;

import com.cke.reservationsystembackend.model.SalonService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonServiceRepository extends JpaRepository<SalonService,Long> {
}
