package com.basepgrm;

public class MyApp {
	public static void main(String[] args) {
		
		// create object
		CivilEngineer cv=new CivilEngineer();
		Engeering e=new ComputerEngieer();    // Refactoring Code : implemenating an Interface
		// Refactoring Code Changing variable reference to use Interface 
		
		System.err.println(cv.getDescription());  // use object
		System.err.println(e.getDescription());  // use object
	}

}
