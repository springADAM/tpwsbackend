package com.a2r.wsbackend.repository;

import com.a2r.wsbackend.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}
