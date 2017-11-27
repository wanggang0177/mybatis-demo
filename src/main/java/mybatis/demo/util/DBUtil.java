package mybatis.demo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DBUtil {

	private static SqlSessionFactory sessionFactory = null;  
	private static final String resource = "mybatis/mybatis-config.xml";
	private static final String dbconf = "mybatis/db-config.properties";
	public static SqlSessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			try {
//				sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
				Properties properties = new Properties();
				properties.load(Resources.getResourceAsStream(dbconf));
				sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource), properties);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
