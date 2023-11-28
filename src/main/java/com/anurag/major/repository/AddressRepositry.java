package com.anurag.major.repository;

import com.anurag.major.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositry extends JpaRepository<Address, Long> {

}
