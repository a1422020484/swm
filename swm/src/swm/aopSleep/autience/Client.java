package swm.aopSleep.autience;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/aop/spring-audience.xml");
		Performer performer = (Performer)bf.getBean("performer");
		performer.performer();
	}

}
