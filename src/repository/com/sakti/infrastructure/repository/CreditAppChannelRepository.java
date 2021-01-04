package com.sakti.infrastructure.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.CreditAppChannel;

@Repository
public interface CreditAppChannelRepository extends JpaRepository<CreditAppChannel, BigInteger> {
	
	CreditAppChannel findByAccountNumber(String accountNumber);
}
