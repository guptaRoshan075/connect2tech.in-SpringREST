package com.journaldev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.c2t.annotation.basic.Employee;
import com.c2t.annotation.basic.Employee2;
import com.journaldev.spring.DAO.IEmpDao;


@Service
public class EmpService implements IEmpService{
	@Autowired
	private IEmpDao dao;
	
	public Employee setEmp(Employee emp) {
		return dao.setEmp(emp);
	}
	
	public Employee getEmp(Long id) {
		return dao.getEmp(id);
	}
	
	public List<?> getEmps(){
		return dao.getEmps();
	}
	
	public List<?> removeEmp(Long id){
		return dao.removeEmp(id);
	}

	@Override
	public Employee2 setEmp2(Employee2 emp) {
		return dao.setEmp2(emp);
	}
}
