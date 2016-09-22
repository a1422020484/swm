package swm.aopSleep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSleep {

	public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-common-config.xml");
        Sleepable sleeper = (Sleepable)appCtx.getBean("humanProxy");
        sleeper.sleep();
    }
}
