package swm.aopSleep.autience;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats(){
		//表演之前
		System.out.println("the autience is taking their seats");
	}
	
	public void trunOfferCellPhones(){
		//表演之前
		System.out.println("the autience is turning off their cellphones");
	}
	
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
