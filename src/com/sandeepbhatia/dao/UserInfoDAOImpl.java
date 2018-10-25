package com.sandeepbhatia.dao;

import org.hibernate.Session;
import com.sandeepbhatia.bean.UserInfo;
import com.sandeepbhatia.entity.UserInfoEntity;
import com.sandeepbhatia.factory.Factory;

public class UserInfoDAOImpl implements UserInfoDAO {

	@Override
	public String addUser(UserInfo userinfo) {
		UserInfoEntity userInfoEntity= null;
		Session session = null;
		try {

			session = Factory.getSessionFactory().openSession();
			session.getTransaction().begin();;
			
			userInfoEntity = new UserInfoEntity();
			
			userInfoEntity.setUsername(userinfo.getUsername());
			userInfoEntity.setPassword(userinfo.getPassword());
			
			session.save(userInfoEntity);
			session.getTransaction().commit();

			session.close();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}

		return userInfoEntity.getUsername();
	}

/*	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("sandeepbhatia");
		userInfo.setPassword("password");
		
		System.out.println(new UserInfoServiceImpl().addUser(userInfo));
	}*/
}
