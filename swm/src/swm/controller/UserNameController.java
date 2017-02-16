package swm.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import swm.po.UserModel;
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
	
	@RequestMapping("/saveUser")
	public void saveUser(UserModel userModel) throws SQLException{
		long sum = 1;
//		HashMap<String,Object> userInfo = new HashMap<String,Object>();
		for(int i=1;i<100;i++){
			sum = sum * i;
			userModel.setAddress("我是氢气球吗"+sum);
			userService.saveUser(userModel);
		}
	}
}
