package com.sandeepbhatia.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
	
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Build a SessionFactory object from session-factory config
            // defined in the hibernate.cfg.xml file. In this file we
            // register the JDBC connection information, connection pool,
            // the hibernate dialect that we used and the mapping to our
            // hbm.xml file for each pojo (plain old java object).
            Configuration config = new Configuration();
            sessionFactory = config.configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Error in creating SessionFactory object." + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
