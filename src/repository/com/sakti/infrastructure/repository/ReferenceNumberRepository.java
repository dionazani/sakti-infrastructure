package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sakti.infrastructure.entity.ReferenceNumber;

public interface ReferenceNumberRepository extends JpaRepository<ReferenceNumber, Long>{

}
