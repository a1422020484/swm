package swm.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//两种读取xml的方式
//		ApplicationContext ac = new ClassPathXmlApplicationContext();
//		HelloWorld hw = (HelloWorld)ac.getBean("helloworld");
		
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/IocTest.xml");
		HelloWorld bfhw = (HelloWorld)bf.getBean("helloworld");
		
	}

}
	