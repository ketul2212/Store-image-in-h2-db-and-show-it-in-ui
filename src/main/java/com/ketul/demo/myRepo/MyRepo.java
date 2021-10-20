package com.ketul.demo.myRepo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ketul.demo.module.Employee;

public interface MyRepo extends CrudRepository<Employee, Integer>{

	@Query("from Employee")
	public ArrayList<Employee> findAll(Employee e);
}
