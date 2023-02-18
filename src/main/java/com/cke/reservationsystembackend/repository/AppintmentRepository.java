package com.cke.reservationsystembackend.repository;

import com.cke.reservationsystembackend.model.Appintment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppintmentRepository extends JpaRepository<Appintment,Long> {
}
