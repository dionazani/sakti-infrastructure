package com.sakti.infrastructure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sakti.infrastructure.entity.InstallmentCurrent;
import com.sakti.infrastructure.entity.InstallmentCurrentDetail;
import com.sakti.infrastructure.entity.InstallmentCurrentDetailPK;

public interface InstallmentCurrentDetailRepository extends JpaRepository<InstallmentCurrentDetail, InstallmentCurrentDetailPK>{

	List<InstallmentCurrentDetail> findByIdInstallmentCurrentId(@Param("id") long id);

}
