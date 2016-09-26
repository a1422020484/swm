package swm.ioc.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/ioc/di/spring-di-other.xml");
		LazyMethod lm = (LazyMethod)bf.getBean("LazyMethod");
	}

}
