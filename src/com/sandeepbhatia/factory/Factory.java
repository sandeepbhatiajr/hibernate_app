package com.sandeepbhatia.factory;

import com.sandeepbhatia.dao.UserInfoDAO;
import com.sandeepbhatia.dao.UserInfoDAOImpl;
import com.sandeepbhatia.services.UserInfoService;
import com.sandeepbhatia.services.UserInfoServiceImpl;

public class Factory {

	public UserInfoService getUserInfoService() {
		return new UserInfoServiceImpl();
	}
	
	public UserInfoDAO getUserInfoDAO() {
		return new UserInfoDAOImpl();
	}
}
