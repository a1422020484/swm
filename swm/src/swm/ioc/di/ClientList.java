package swm.ioc.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * 通过list的方式进行注入
 */
public class ClientList {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/ioc/di/spring-di.xml");
		ListMethod lm = (ListMethod)bf.getBean("ParamList");
		lm.sayHello();
	}
}
