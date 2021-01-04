package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.InstallmentPaymentDetail;
import com.sakti.infrastructure.entity.InstallmentPaymentDetailPK;

public interface InstallmentPaymentDetailRepository extends JpaRepository<InstallmentPaymentDetail, InstallmentPaymentDetailPK>{

}
