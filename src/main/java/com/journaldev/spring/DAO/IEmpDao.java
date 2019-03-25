package com.journaldev.spring.DAO;

import java.util.List;

import com.c2t.annotation.basic.Employee;
import com.c2t.annotation.basic.Employee2;

public interface IEmpDao {
	Employee setEmp(Employee emp);
	Employee getEmp(Long id);
	
	List<?> getEmps();
	
	List<?> removeEmp(Long id);
	
	Employee2 setEmp2(Employee2 emp);
}
