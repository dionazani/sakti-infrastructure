package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.InstallmentCurrent;

public interface InstallmentCurrentRepository extends JpaRepository<InstallmentCurrent, Long>{

}
