package com.myproject.Order.Management.repositories;

import com.myproject.Order.Management.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
