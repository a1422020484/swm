package swm.aopSleep.mindreader;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/aop/spring-thinker.xml");
		ThinkerImpl thinker = (ThinkerImpl)bf.getBean("thinker");
		System.out.println(thinker);
	}
	
}
