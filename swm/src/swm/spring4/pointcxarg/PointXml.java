package swm.spring4.pointcxarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointXml {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring4/pointcx-arg.xml");
		Performance human = (Performance)ctx.getBean("perfor");
		human.performance("yang",7);
	}

}
