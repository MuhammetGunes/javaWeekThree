package week3Homework.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
		
	}

}
