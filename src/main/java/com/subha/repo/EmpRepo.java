package com.subha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subha.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer> {

}
