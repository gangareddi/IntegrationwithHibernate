package com.integrationwithhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	Dao dao = applicationContext.getBean(Dao.class);
	
	dao.insert(new Creating("ganga","teegala","gangareddy@gmail.com"));
	}
}
