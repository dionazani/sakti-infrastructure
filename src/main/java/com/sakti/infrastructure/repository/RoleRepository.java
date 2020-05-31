package com.sakti.infrastructure.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.AppRole;

@Repository
public interface RoleRepository extends JpaRepository<AppRole, UUID> {

	AppRole findByCode(String code);
}
