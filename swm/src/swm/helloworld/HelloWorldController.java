package swm.helloworld;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//@Controller
@RequestMapping("/hello")
public class HelloWorldController implements Controller{

	/*
	 * 实现controller 接口之后重写的方法*/
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv =  new ModelAndView();
		
		mv.addObject("message","HELLO WORLD!");		
		
		mv.setViewName("HelloWorld");
		
		return mv;
	}
	/*@RequestMapping("/toHelloWorld")
	public String toHelloWorld(ServletRequest req,Model model)  throws Exception {
		model.addAttribute("message", "HELLO WORLD!!!");
		System.out.println("toHelloWorld method");
		return "HelloWorld";
	}*/

	/*HelloWorldController(){
		System.out.println("HelloWorldController is true!");
	}*/
}
