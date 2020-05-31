package com.sakti.infrastructure.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sakti.infrastructure.entity.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, UUID> {

}
