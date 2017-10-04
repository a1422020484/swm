package swm.ioc.autodi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	BeanFactory bf = new ClassPathXmlApplicationContext("spring/ioc/autodi/spring-autodi.xml");
	InitMethod user = (InitMethod) bf.getBean("test");

    }

}
