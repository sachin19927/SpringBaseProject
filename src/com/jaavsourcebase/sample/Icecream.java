package com.jaavsourcebase.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Icecream implements Food {

	
	public Icecream() {
System.err.println("ICE CONSTRUCT");
	}
	
	@Autowired
	@Qualifier("offline")
	private Order order;
	
	
	@Value("${name.palyer}")
	private String name;
	
	@Value("${country.player}")
	private String area;

	@PostConstruct
	public void intiMethod()
	{
		System.err.println("INTI MTHOS");
	}
	
	
	@PreDestroy
	public void destoryMethod()
	{
		System.err.println("destroyMethos MTHOS");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String prapre() {
		return "italian";
	}

	@Override
	public String eat() {
		return "4 slics";
	}

	@Override
	public String mode() {
		return order.mode()+ " cold";
	}

}
