package com.subha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
