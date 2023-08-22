package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmployeeDetails;
import com.example.demo.Service.EmpService;

@RestController
public class EmpContoller {
         
	@Autowired
	EmpService esr;
	
	@PostMapping("addemp")
	public EmployeeDetails add(@RequestBody EmployeeDetails ed)
	{
		return esr.saveinfo(ed);
	}
	@GetMapping("showemp")
	public List<EmployeeDetails>show()
	{
		return esr.showinfo();
	}
	
	
}
