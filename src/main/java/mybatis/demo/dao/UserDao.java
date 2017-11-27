package mybatis.demo.dao;

import java.util.List;


import mybatis.demo.pojo.User;

public interface UserDao {

	/**
	 * ����
	 * */
	void insertUser(User u);
	
	/**
	 * ��������
	 * */
	void insertListUser(List<User> us);
	
	/**
	 * ��ȡuserͨ��id
	 * */
	User selectUserById(int id);
	
	/**
	 * ɾ��userͨ��id
	 * */
	void delUserById(int id);
	
	/**
	 * ��ȡ����user
	 * */
	List<User> selectUser();
	
	/**
	 * ɾ������user
	 * */
	void delUser();
}
