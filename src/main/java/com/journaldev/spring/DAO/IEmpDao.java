package com.journaldev.spring.DAO;

import java.util.List;

import com.c2t.annotation.basic.Employee;

public interface IEmpDao {
	Employee setEmp(Employee emp);
	Employee getEmp(Long id);
	
	List<?> getEmps();
	
	List<?> removeEmp(Long id);
}
