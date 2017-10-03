package swm.spring4.pointcx;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundTest {

		public void watchPerformance(ProceedingJoinPoint jp){
			try {
				System.out.println("d");
				jp.proceed();
				System.out.println("sadtgsd");
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
