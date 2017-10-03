package swm.httpTest;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/http")
public class ContentTypeTest {

//	@RequestMapping(value="/ContentType",headers="Accept=application/json")
	@RequestMapping(value="/ContentType")
	public void contentTypeResponse(HttpServletResponse response) throws IOException{
		response.setContentType("application/json;charset=UTF-8");
		String jsonData = "{\"username\":\"张啊大\", \"password\":\"123\"}";
		response.getWriter().write(jsonData);
	}
	@RequestMapping(value="/jsonRequest")
	public String jsonRequest() throws IOException, URISyntaxException{
		HttpRequestTest.jsonRequest();
		return "result/success";
	}
	@RequestMapping(value="/toMethodForm")
	public String toMethodForm(){
		return "/method/methodForm";
	}
	
	public void httpTest(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
	}
}
