package swm.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/helloCache")
public class HelloWorldCacheController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest requset, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.getWriter().write("<a href>this</a>");
		return null;
	}
}
