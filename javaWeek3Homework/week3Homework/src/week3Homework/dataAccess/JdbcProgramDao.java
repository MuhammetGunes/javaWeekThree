package week3Homework.dataAccess;

import week3Homework.entities.Program;

public class JdbcProgramDao implements ProgramDao{

	@Override
	public void add(Program program) {
		System.out.println("JDBC ile eklendi..");
		
	}

}
