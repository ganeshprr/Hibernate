package com.mypackage;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();

		Employee e1 = new Employee();
		e1.setEmployeeid(101);
		e1.setEmployeename("macha");
		e1.setSalary(3456);

		Employee e2 = new Employee();
		e2.setEmployeeid(102);
		e2.setEmployeename("raja");
		e2.setSalary(1234);

		Address a1 = new Address();
		a1.setAddressid(1000);
		a1.setLine("asd");
		a1.setCity("FF");
		a1.setState("VA");
		a1.setZip(12345);
		
		Address a2 = new Address();
		a2.setAddressid(1001);
		a2.setLine("dfg");
		a2.setCity("HD");
		a2.setState("NJ");
		a2.setZip(45678);
		
		List<Employee> list1=new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);

		List<Address> list2 = new ArrayList<Address>();
		list2.add(a1);
		list2.add(a2);
		
		e1.setListOfAddress(list2);
		e2.setListOfAddress(list2);

		a1.setListOfEmployees(list1);
		a2.setListOfEmployees(list1);
		
		session.beginTransaction();
	

		session.save(a1);
		session.save(a2);

		session.save(e1);
		session.save(e2);
		
		session.getTransaction().commit();
		session.close();
		sf.close();

	}
}
