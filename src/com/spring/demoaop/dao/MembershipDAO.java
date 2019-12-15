package com.spring.demoaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccoount() {
		System.err.println(getClass()+ " Doing DB work: adding in MembershipDAO");
	}
	
	public void addsillyMethod() {
		System.err.println(getClass()+ " Doing DB work: silly add in MembershipDAO");
	}
}
