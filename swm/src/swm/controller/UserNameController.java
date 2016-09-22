package swm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import swm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserNameController {

	@Autowired
	public UserService userService;
	
	@RequestMapping("/getUserName")
	public String getUserName(Model model){
		String username = userService.getUsername();
		model.addAttribute("username", username);
		return "result/param";
	}
}
