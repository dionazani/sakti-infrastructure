package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.InstallmentSchedule;
import com.sakti.infrastructure.entity.InstallmentSchedulePK;

public interface InstallmentScheduleRepository extends JpaRepository<InstallmentSchedule, InstallmentSchedulePK> {


}
