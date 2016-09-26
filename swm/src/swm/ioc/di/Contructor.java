package swm.ioc.di;

/**
 * @author Administrator
 *	使用构造器方法注入
 * 	一、作为变量注入
 * 	二、作为类引入
 */

public class Contructor {
	public String message;
	public int index;
	Contructor(String message,int index){
		this.message = message;
		this.index = index;
	}
	
	public void sayHello(){
		System.out.println(message + ", "+index);
	}
}
