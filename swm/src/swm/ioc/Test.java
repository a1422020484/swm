package swm.ioc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	private Map<String,List<String>> mp;
	public ListTest ls = new ListTest();
	
	public Test(){
		mp = new HashMap<String,List<String>>();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bf = new ClassPathXmlApplicationContext("spring/spring-temptest.xml");
		Test user = (Test)bf.getBean("hello");
		ListTest list = (ListTest)bf.getBean("list");
		System.out.println(user.mp);
		System.out.println(list.getLs());
		
		
		
	}
	public Map<String, List<String>> getMp() {
		return mp;
	}
	public void setMp(Map<String, List<String>> mp) {
		this.mp = mp;
	}
	public ListTest getLs() {
		return ls;
	}
	public void setLs(ListTest ls) {
		this.ls = ls;
	}
	
}
