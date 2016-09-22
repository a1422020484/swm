package swm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import swm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		System.out.println("getUsername method");
		return "zhangsan";
	}

}
