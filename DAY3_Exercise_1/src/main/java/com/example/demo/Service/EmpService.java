package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Repository.EmpRepo;

@Service
public class EmpService {
   
	@Autowired
	EmpRepo er;
	
	public EmployeeDetails saveinfo(EmployeeDetails ed)
	{
		return er.save(ed);
	}
	
	public List<EmployeeDetails>showinfo()
	{
		return er.findAll();
	}
}
