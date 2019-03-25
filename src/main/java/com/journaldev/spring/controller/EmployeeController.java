package com.journaldev.spring.controller;



import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c2t.annotation.basic.Employee;
import com.c2t.annotation.basic.Employee2;
import com.journaldev.spring.service.IEmpService;



@Controller
public class EmployeeController {
	
	@Autowired
	private IEmpService service;
	
	@RequestMapping(value="/set" , method = RequestMethod.GET)
	public @ResponseBody Employee setDummyEmployee() {
		Employee emp = new Employee();
		emp.setFirstname("Roshan");
		emp.setCellphone("908765432");
		emp.setLastname("Gupta");
		emp.setBirthDate(new Date(1019, 03, 25));
		service.setEmp(emp);
		
		return emp;
	}
	
	@RequestMapping(value="/set2" , method = RequestMethod.GET)
	public @ResponseBody Employee2 setDummyEmployee2() {
		Employee2 emp = new Employee2();
		emp.setFirstname("Roshan");
		emp.setCellphone("908765432");
		emp.setLastname("Gupta");
		emp.setBirthDate(new Date(2019, 03, 25));
		service.setEmp2(emp);
		
		return emp;
	}
	
	
	@RequestMapping(value="/getEmps" , method = RequestMethod.GET)
	public @ResponseBody List<?> getDummyEmployee12() {
		
		return service.getEmps();
		
	}
	
	@RequestMapping(value="getbyid/{id}" , method = RequestMethod.GET)
	public @ResponseBody Employee getDummyEmployee4(@PathVariable Long id) {
		return service.getEmp(id);
	}
	
	@RequestMapping(value="delbyid/{id}" , method = RequestMethod.GET)
	public @ResponseBody List<?> getDummyEmployee12dd(@PathVariable Long id) {
		
		return service.removeEmp(id);
		
	}
	
}
