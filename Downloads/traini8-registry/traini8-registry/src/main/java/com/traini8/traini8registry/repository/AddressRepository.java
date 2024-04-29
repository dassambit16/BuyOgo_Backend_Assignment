package com.traini8.traini8registry.repository;

import com.traini8.traini8registry.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
