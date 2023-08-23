package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class NewController {
	@Autowired
	StudentService ss;
	
	@PostMapping("postdetails")
	public List<StudentEntity> add(@RequestBody List<StudentEntity> se)
	{
		return (List<StudentEntity>)ss.saveinfo(se);
	}
	@GetMapping("showdetails")
	public List<StudentEntity> show()
	{
		return ss.showinfo();
	}
	
	@PutMapping("updatedetails")
	public StudentEntity update(@RequestBody StudentEntity se)
	{
		return ss.updateinfo(se);
	}
	@DeleteMapping("deleteinfo")
	public String delete(@RequestParam int id)
	{
		return ss.deleteinfo(id);
	}
}
