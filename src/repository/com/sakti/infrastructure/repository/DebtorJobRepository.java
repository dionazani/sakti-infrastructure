package com.sakti.infrastructure.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakti.infrastructure.entity.DebtorJob;
import com.sakti.infrastructure.entity.DebtorPerson;

@Repository
public interface DebtorJobRepository extends JpaRepository<DebtorJob, UUID>{

}
