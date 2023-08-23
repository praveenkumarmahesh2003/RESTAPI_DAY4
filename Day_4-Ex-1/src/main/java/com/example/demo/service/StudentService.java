package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public List<StudentEntity> saveinfo(List<StudentEntity> se)
	{
		
		return (List<StudentEntity>)sr.saveAll(se);
	}
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
	
	
	public StudentEntity updateinfo(StudentEntity se)
	{
		return sr.saveAndFlush(se);
	}
	
	public String deleteinfo(int id)
	{
		sr.deleteById(id);
		return "Succefully deleted "+id;
	}
}
