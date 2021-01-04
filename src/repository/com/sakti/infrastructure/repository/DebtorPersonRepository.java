package com.sakti.infrastructure.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.DebtorPerson;

@Repository
public interface DebtorPersonRepository extends JpaRepository<DebtorPerson, UUID>{

	DebtorPerson findByIdentityNumber(String identityNumber);
}
