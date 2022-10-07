package week3Homework;

import week3Homework.business.ProgramManager;
import week3Homework.core.logging.DatabaseLogger;
import week3Homework.core.logging.FileLogger;
import week3Homework.core.logging.Logger;
import week3Homework.dataAccess.HibernateProgramDao;
import week3Homework.dataAccess.JdbcProgramDao;
import week3Homework.entities.Program;

public class Main {

	public static void main(String[] args) throws Exception {
		Program program = new Program("Java", "FullStack", 11);
		Logger[] logger = {new DatabaseLogger(), new FileLogger()};
		ProgramManager manager = new ProgramManager(new HibernateProgramDao(), logger);
		manager.add(program);
	}

}
