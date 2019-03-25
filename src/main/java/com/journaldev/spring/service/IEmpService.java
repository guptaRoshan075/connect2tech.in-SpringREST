package com.journaldev.spring.service;

import java.util.List;

import com.c2t.annotation.basic.Employee;

public interface IEmpService {
	Employee setEmp(Employee emp);
	Employee getEmp(Long id);
	
	List<?> getEmps();
	
	List<?> removeEmp(Long id);
}
