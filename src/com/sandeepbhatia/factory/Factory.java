package com.sandeepbhatia.factory;

import com.sandeepbhatia.dao.UserInfoDAO;
import com.sandeepbhatia.dao.UserInfoDAOImpl;
import com.sandeepbhatia.services.UserInfoService;
import com.sandeepbhatia.services.UserInfoServiceImpl;

public class Factory {

	public static UserInfoService getUserInfoService() {
		return new UserInfoServiceImpl();
	}
	
	public static UserInfoDAO getUserInfoDAO() {
		return new UserInfoDAOImpl();
	}
}
