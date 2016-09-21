package swm.httpTest;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import swm.po.UserModel;

@Controller
@RequestMapping(value="/requestParam")
public class RequestParamTest {
	
	//value：参数名字，即入参的请求参数名字，如 username 表示请求的参数区中的名字为 username 的参数的值将传入； 
	//required：是否必须，默认是 true，表示请求中一定要有相应的参数，否则将报 404 错误码； 
	//defaultValue ： 默 认 值 ， 表 示 如 果 请 求 中 没 有 同 名 参 数 时 的 默 认 值 ，
	@RequestMapping(value="/paramTest")
	public String paramTest(ServletRequest request,Model model,
			@RequestParam(value="",required=true,defaultValue="zhang") String username,
			@RequestParam(value="address",required=true) String address){
		model.addAttribute("username", username);
		model.addAttribute("address", address);
		return "result/param";
	}
	@RequestMapping(value="/paramNone")
	public String paramSimple(ServletRequest request,Model model){
		String username = request.getParameter("username");
		model.addAttribute("username", username);
		return "result/param";
	}
	//如请求的 URL 为“控制器 URL/users/123/topics/456”，则自动将 URL 中模板变量{userId}和{topicId}绑定到通过
	//@PathVariable 注解的同名参数上，即入参后 userId=123、topicId=456。代码在 PathVariableTypeController 中。 
	@RequestMapping(value="/pathValueTest/{userdname}/address/{address}")
	public String pathValueTest(ServletRequest request,Model model,@PathVariable(value="userdname") String username,
			@PathVariable(value="address") String address
			){
		model.addAttribute("username", username);
		model.addAttribute("address", address);
		return "result/param";
	}
	//如上配置将自动将 JSESSIONID 值入参到 sessionId 参数上，defaultValue 表示 Cookie 中没有 JSESSIONID 时默认为空。
	@RequestMapping(value="/cookieValue")
	public String cookieValue(ServletRequest request,Model model,@CookieValue(value="JSESSIONID",defaultValue="") String address){
		model.addAttribute("address", address);
		return "result/param";
	}
	//@ModelAttribute
	//http://localhost:8082/swm/requestParam/modelTest?username=yang&address=henam
	@RequestMapping(value="/modelTest")
//	public String modelTest(ServletRequest request,Model model,@ModelAttribute("user") UserModel user){
		public String modelTest(ServletRequest request,Model model,UserModel user){
		model.addAttribute("user", user);
		return "result/param";
	}
}
