package swm.ioc.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/ioc/di/spring-di.xml");
		
		SetMethod sm = (SetMethod)bf.getBean("ParamSet");
		
		sm.sayHello();
		
	}

}
