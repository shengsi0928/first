package pojo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Sourse;

public class Test_Fruit {
	
	private ApplicationContext context;

	public void test(){
		context = new ClassPathXmlApplicationContext(
				new String[]{"Source.xml"});
		
		Sourse source = (Sourse)context.getBean("sourse",Sourse.class);
		System.out.println(source.getFruit());
		System.out.println(source.getSugar());
		System.out.println(source.getSize());

		JuiceMaker maker = (JuiceMaker) context.getBean("juicemaker", JuiceMaker.class);
		System.out.println(maker.makeJuice());

		JuiceProduct product = (JuiceProduct)context.getBean("juiceProduct", JuiceProduct.class);
		product.doSomeService();
	}
}
