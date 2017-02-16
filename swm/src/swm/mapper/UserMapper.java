package swm.mapper;

import swm.po.UserModel;

public interface UserMapper {
	String getUsername();

	void saveUser(UserModel userModel);
}
