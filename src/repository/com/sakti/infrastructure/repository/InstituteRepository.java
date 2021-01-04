package com.sakti.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, UUID> {

}
