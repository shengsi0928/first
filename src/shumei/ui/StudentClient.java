package shumei.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	private static ApplicationContext context;

	public static void main(String[] args ) throws Exception
	{
		context = new ClassPathXmlApplicationContext(
				new String[]{"beans.xml"});
		
		
	}
}
