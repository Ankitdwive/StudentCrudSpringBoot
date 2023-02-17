package com.example.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.entityy.Student;
import com.example.StudentCrud.reposotory.StudentRepository;

//import antlr.collections.List;

@Service
public class StudentService {
@Autowired
    private StudentRepository repo;

public List<Student> listAll() {
        return repo.findAll();
    }
public Student saveStudent(Student std) {
    return  repo.save(std);
  }
  
  public Student getsampleById(long id) {
      return repo.findById(id).get();
  }
  
  public void deletesample(long id) {
      repo.deleteById(id);
  }
}