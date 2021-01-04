package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.CallbackPayment;

public interface CallbackPaymentRepository extends JpaRepository<CallbackPayment, Long>{

}
