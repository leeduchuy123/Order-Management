package com.myproject.Order.Management.repositories;

import com.myproject.Order.Management.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
