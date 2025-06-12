package com.muhammedessa.curddatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhammedessa.curddatabase.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
