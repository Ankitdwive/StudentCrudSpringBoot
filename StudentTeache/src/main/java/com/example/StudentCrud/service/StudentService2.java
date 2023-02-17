package com.example.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.entityy.Employee;
import com.example.StudentCrud.reposotory.StudentRepository2;

//import antlr.collections.List;

@Service
public class StudentService2 {
@Autowired
    private StudentRepository2 repo;

public List<Employee> listAll() {
        return repo.findAll();
    }
public Employee saveStudent(Employee std) {
    return  repo.save(std);
  }
  
  public Employee getsampleById(long id) {
      return repo.findById(id).get();
  }
  
  public void deletesample(long id) {
      repo.deleteById(id);
  }
  
  
   
	
	
}