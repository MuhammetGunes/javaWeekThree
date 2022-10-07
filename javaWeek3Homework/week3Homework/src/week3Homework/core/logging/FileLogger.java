package week3Homework.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
		
	}

}
