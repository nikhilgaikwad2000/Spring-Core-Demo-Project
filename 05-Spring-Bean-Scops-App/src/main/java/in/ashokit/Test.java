package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
	Motar motar1 = context.getBean("motar",Motar.class);
	System.out.println(motar1.hashCode());
	
	Motar motar2 = context.getBean("motar",Motar.class);
	System.out.println(motar1.hashCode());
	
	}
}
