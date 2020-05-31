package com.sakti.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.Debtor;
import java.util.UUID;

@Repository
public interface DebtorRepository extends JpaRepository<Debtor, UUID>{

	Debtor findByEmail(String email);
}
