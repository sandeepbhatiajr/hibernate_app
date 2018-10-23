package com.sandeepbhatia.services;

import com.sandeepbhatia.bean.UserInfo;
import com.sandeepbhatia.factory.Factory;

public class UserInfoServiceImpl implements UserInfoService {

	@Override
	public String addUser(UserInfo userinfo) {

		Factory.getUserInfoDAO().addUser(userinfo);
		return null;
	}


}
