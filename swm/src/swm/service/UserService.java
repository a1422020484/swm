package swm.service;

import java.sql.SQLException;

import swm.po.UserModel;

public interface UserService {
	String getUsername();

	void saveUser(UserModel userModel) throws SQLException;
}
