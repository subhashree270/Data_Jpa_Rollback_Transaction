package com.subha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subha.entity.Address;
import com.subha.entity.Emp;
import com.subha.repo.AddressRepo;
import com.subha.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class ServiceDemo {
	@Autowired
	private EmpRepo erepo;
	
	@Autowired
	private AddressRepo arepo;
	
	@Transactional(rollbackOn=Exception.class)
	public void saveData() {
		Emp e=new Emp();
		e.setName("Smith");
		e.setDept("Testing");
		erepo.save(e);
		
		int i=10/0;
		
		Address a=new Address();
		a.setState("Odisha");
		a.setId(756001);
		arepo.save(a);
			
		
	}

}
