package com.spring.demoaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demoaop.dao.AccountDAO;
import com.spring.demoaop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read sring java class
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the AccountDAO beans form spring container
		AccountDAO accountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		// get the MembershipDAO beans form spring container
		MembershipDAO membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);
		
		// call AccountDAO bussiness method
		accountDAO.addAccoount();
		
		Account account=new Account();
		account.setName("sachin");
		
		// call AccountDAO bussiness method with Account as param
		accountDAO.addAccoount(account);
		
		// call AccountDAO bussiness method with Account as param type more then 1
		accountDAO.addAccoount(account,"1");
		
		// call AccountDAO silly method
		accountDAO.addsillyMethod(); 
		
		// call AccountDAO silly method
		accountDAO.doWork(); 
		
		// call membershipDAO bussiness method
		membershipDAO.addAccoount();
		
		// call membershipDAO silly method
		membershipDAO.addsillyMethod();
		
		// clsoe context
		context.close();
	}
}
