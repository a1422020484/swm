package swm.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/method")
public class HelloWorldMethod {
	
	@RequestMapping(value="/toMethodForm")
	public String toMethodForm(){
		return "/method/methodForm";
	}
	@RequestMapping(value="/doMethod",method = RequestMethod.GET)
	public String toGetMethod(){
		System.out.println("get method");
		return "result/success";
	}
	@RequestMapping(value="/doMethod",method = RequestMethod.POST)
	public String toPostMethod(){
		System.out.println("post method");
		return "result/success";
	}
	
}
