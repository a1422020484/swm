package swm.highcharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/highcharts")
public class GoHighcharts {

	@RequestMapping("/toPie")
	public String pieTest(){
		return "highcharts/pie";
	}
}
