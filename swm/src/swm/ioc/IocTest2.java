package swm.ioc;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class IocTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("config/spring/IocTest.xml");
		Resource res = new FileSystemResource(file);
		BeanFactory bf  = new XmlBeanFactory(res);
		HelloWorld wh = (HelloWorld)bf.getBean("helloworld");
		
	}

}
