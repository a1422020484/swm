package swm.aopSleep.annotationAudience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* swm.aopSleep.autience.Performer.performer(..))")
	public void performance(){
		System.out.println("do  performance");
	}
	@Before("performance()")
	public void takeSeats(){
		//表演之前
		System.out.println("the autience is taking their seats");
	}
	@Before("performance()")
	public void trunOfferCellPhones(){
		//表演之前
		System.out.println("the autience is turning off their cellphones");
	}
	@AfterReturning("performance()")
	public void applaud(){
		//表演之后
		System.out.println("clap clap clap clap clap clap!");
	}
	
	public void demandRefund(){
		//表演失败之后
		System.out.println("boo we wange our money back!");
	}
	
	public void takeSeatsHome(){
		//表演之后
		System.out.println("the autience is taking their seats go home");
	}
	public void crossTheDoor(){
		//表演之后
		System.out.println("the autience is crossing The Door");
	}
	
	//用户环绕通知
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("the autience is taking their seats");
			System.out.println("the autience is turning off their cellphones");
			//表演之前
			long start = System.currentTimeMillis();
			//执行被通知的方法  执行表演的方法
			joinpoint.proceed();
			//表演之后
			long end = System.currentTimeMillis();
			
			System.out.println("clap clap clap clap clap clap clap ");
			System.out.println("the perfomance took "+(end - start)+" Milliseconds!");
			
		}catch(Throwable t){
			//表演失败之后
			System.out.println("boo we want our money bace!!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
