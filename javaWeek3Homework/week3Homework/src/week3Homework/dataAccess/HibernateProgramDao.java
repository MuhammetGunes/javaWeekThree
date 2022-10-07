package week3Homework.dataAccess;

import week3Homework.entities.Program;

public class HibernateProgramDao implements ProgramDao{

	@Override
	public void add(Program program) {
		System.out.println("Hibernate ile eklendi..");
		
	}

}
