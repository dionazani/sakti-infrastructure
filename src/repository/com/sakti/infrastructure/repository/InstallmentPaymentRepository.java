package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.InstallmentPayment;

public interface InstallmentPaymentRepository extends JpaRepository<InstallmentPayment, Long>{

}
