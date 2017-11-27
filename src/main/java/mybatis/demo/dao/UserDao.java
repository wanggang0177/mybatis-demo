package mybatis.demo.dao;

import java.util.List;


import mybatis.demo.pojo.User;

public interface UserDao {

	/**
	 * 插入
	 * */
	void insertUser(User u);
	
	/**
	 * 批量插入
	 * */
	void insertListUser(List<User> us);
	
	/**
	 * 获取user通过id
	 * */
	User selectUserById(int id);
	
	/**
	 * 删除user通过id
	 * */
	void delUserById(int id);
	
	/**
	 * 获取所有user
	 * */
	List<User> selectUser();
	
	/**
	 * 删除所有user
	 * */
	void delUser();
}
