package com.journaldev.spring.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c2t.annotation.basic.Employee;

@Repository
public class EmpDAO implements IEmpDao{
	
	@Autowired
	private SessionFactory sf;
	
	public Employee setEmp(Employee emp) {
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(emp);
		s.getTransaction().commit();
		return emp;
	}
	
	public Employee getEmp(Long id) {
		return (Employee) sf.openSession().get(Employee.class, id);
	}
	
	public List<?> getEmps(){
		return sf.openSession().createQuery("select e from Employee e").list();
	}
	
	public List<?> removeEmp(Long id){
		Session s = sf.openSession();
		s.beginTransaction();
		s.delete(s.get(Employee.class, id));
		s.getTransaction().commit();
		return s.createQuery("select e from Employee e").list();
	}
}
