package swm.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import swm.mapper.UserMapper;
import swm.po.UserModel;
import swm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public String getUsername() {
	// TODO Auto-generated method stub
	String username = usermapper.getUsername();
	System.out.println("getUsername method");
	return username;
    }

    @Override
    public void saveUser(UserModel userModel) throws SQLException {
	usermapper.saveUser(userModel);
    }

}
