package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberbnateUtils {

	private static SessionFactory sessionFactory ;
	static{
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e){
			
			throw new RuntimeException("初始化sessionFactory失败");
			
		}
		
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}
