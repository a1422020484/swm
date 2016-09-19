package swm.helloworld;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController{

	/*
	 * 实现controller 接口之后重写的方法
	 * @Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv =  new ModelAndView();
		
		mv.addObject("message","HELLO WORLD!");		
		
		mv.setViewName("HelloWorld");
		
		return mv;
	}*/
	@RequestMapping("/toHelloWorld")
	public String toHelloWorld(ServletRequest req,Model model)  throws Exception {
		model.addAttribute("message", "HELLO WORLD!!!");
		System.out.println("toHelloWorld method");
		return "HelloWorld";
	}
	HelloWorldController(){
		System.out.println("HelloWorldController is true!");
	}
}
