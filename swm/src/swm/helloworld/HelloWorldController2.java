package swm.helloworld;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController2{
	
	@RequestMapping("/toHelloWorld2")
	public String toHelloWorld(ServletRequest req,Model model)  throws Exception {
		model.addAttribute("message", "HELLO WORLD2!!!");
		System.out.println("toHelloWorld2 method");
		return "HelloWorld";
	}
	
}
