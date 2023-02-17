package com.example.StudentCrud.reposotory;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.StudentCrud.entityy.Employee;

@Repository
public interface StudentRepository2 extends JpaRepository<Employee, Long> {
/*	@Query("SELECT p FROM Employee p WHERE p.Ename LIKE %?1%"
            + " OR p.Eadd LIKE %?1%"
            + " OR p.Email LIKE %?1%"
            + " OR CONCAT(p.Esal, '') LIKE %?1%")
    public List<Employee> search(String keyword);*/	
}