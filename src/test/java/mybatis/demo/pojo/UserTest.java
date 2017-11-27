package mybatis.demo.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import mybatis.demo.dao.UserDao;
import mybatis.demo.util.DBUtil;

public class UserTest {

//	@Test
//	public void testSelect() {
//		SqlSession sqlSession = DBUtil.getSessionFactory().openSession();
//		System.out.println(sqlSession.getClass().getName());
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		User u = userDao.selectUserById(1);
//		System.out.println(u.toString());
//	}

//	@Test
//	public void testInsert() {
//		SqlSession sqlSession = DBUtil.getSessionFactory().openSession();
//		User user = new User();
//		user.setName("wangg");
//		user.setAge(24);
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		userDao.insertUser(user);
//		sqlSession.commit();
//	}
	
//	@Test
//	public void testInsertListUser() {
//		SqlSession sqlSession = DBUtil.getSessionFactory().openSession();
//		List<User> list = new ArrayList<User>();
//		User user = new User();
//		user.setName("wangg");
//		user.setAge(24);
//		list.add(user);
//		list.add(user);
//		list.add(user);
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
//		userDao.insertListUser(list);
//		sqlSession.commit();
//	}
	
	
	@Test
	public void testSelectUser() {
		SqlSession sqlSession = DBUtil.getSessionFactory().openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> users = userDao.selectUser();
		System.out.println(users.size());
	}
}
