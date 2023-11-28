package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheryians.major.model.Address;

@Repository
public interface AddressRepositry extends JpaRepository<Address, Long> {

}
