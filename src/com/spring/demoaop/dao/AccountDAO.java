package com.spring.demoaop.dao;

import org.springframework.stereotype.Component;

import com.spring.demoaop.Account;

@Component
public class AccountDAO {
	public void addAccoount() {
		System.err.println(getClass()+ " Doing DB work: addin in AccountDAO");
	}
	
	public String addsillyMethod() {
		System.err.println(getClass()+ " Doing DB work: addsillyMethod in AccountDAO");
		return "adding data";
	}
	
	public void addAccoount(Account account) {
		System.err.println(getClass()+ " Doing DB work: addin in AccountDAO DI is Account class  " + account.getName());
	}
	
	public void addAccoount(Account account,String flag) {
		System.err.println(getClass()+  " Doing DB work: addin in AccountDAO DI is Account class  " + account.getName() + "  with flag "+flag);
	}
	
	
	public boolean doWork() {
		System.err.println(getClass()+  " Doing DB work: doWork in AccountDAO ");
		return true;
	}
	
}
