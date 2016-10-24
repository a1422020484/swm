package swm.highcharts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/highcharts")
public class GoHighcharts {

	@RequestMapping("/toHcIndex")
	public String toHcIndex(){
		return "highcharts/index";
	}
	@RequestMapping("/toPie")
	public String pieTest(){
		return "highcharts/pie";
	}
	@RequestMapping("/toLine")
	public String lineTest(){
		return "highcharts/line";
	}
	@RequestMapping("/toColumn")
	public String columnTest(){
		return "highcharts/column";
	}
}
