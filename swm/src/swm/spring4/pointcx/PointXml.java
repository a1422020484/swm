package swm.spring4.pointcx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PointXml {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring4/pointcx.xml");
//		Performance pc = new Performance();
		Performance human = (Performance)ctx.getBean("perfor");
		human.performance();
//		System.out.println(ctx);
	}

}
