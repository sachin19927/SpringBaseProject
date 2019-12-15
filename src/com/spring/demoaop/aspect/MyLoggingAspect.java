package com.spring.demoaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	// we had all related advices
	
	// lets starts with @Before advice
	// public void addAccoount() ==> point cut expression
	// run this code BEFORE- tearget Object method "public void addAccoount()"
	
	
	
	//@Before("execution(public void addAccoount())")  // match addAccoount method in any class
	//@Before("execution(public void updateAccoount())") // match updateAccoount method in any class
	//@Before("execution(public void com.spring.demoaop.dao.AccountDAO.addAccoount())") // match only addAccoount method in AccountDAO class
	//@Before("execution(public void add*())") // match method starting with "add" in any class addAccoount method in AccountDAO class
	//@Before("execution(void add*())") // match with method return type
	//@Before("execution(* add*())") // match  method with any return type
	//@Before("execution(* add*(com.spring.demoaop.Account))") // match  method with any return type
	//@Before("execution(* add*(Account))") // erroe bcz full qualified name of class is reuired
	//@Before("execution(* add*(com.spring.demoaop.Account,..))") // matchs any number of arguments
	//@Before("execution(* add*(..))") // matchs any number of arguments
	@Before("execution(* com.spring.demoaop.dao.*.*(..))") // matchs any method in pacakage
	public void beforeAddAccountAdvice() {
		// custom code
		System.err.println("=====> execuing @Before advice on addAccount()");
	}
	
}
