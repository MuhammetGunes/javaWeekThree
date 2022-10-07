package week3Homework.business;

import week3Homework.core.logging.Logger;
import week3Homework.dataAccess.ProgramDao;
import week3Homework.entities.Program;

public class ProgramManager {
	private ProgramDao programDao;
	private Logger[] loggers;
	
	public ProgramManager(ProgramDao programDao, Logger[] loggers) {
		this.programDao = programDao;
		this.loggers = loggers;
	}
	
	public void add(Program program) throws Exception {
		
		Program[] programs = {
				new Program("C#", "Backend", 15),
				new Program("HTML", "Frontend", 20)
		};
 		
		for(Program pr : programs) {
			if(program.getUnitPrice()<0 || program.getName().equalsIgnoreCase(pr.getName()) || program.getCategory().equalsIgnoreCase(pr.getCategory())) {
				throw new Exception("Hatalı bilgi girildi..");
			}
		}
		programDao.add(program);
		for(Logger logger : loggers) {
			logger.log(program.getName());
		}
		
	}
}
