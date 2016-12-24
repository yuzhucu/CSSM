package com.cssm.common.manager;

import java.util.List;


import com.cssm.common.dao.BaseDao;
import com.cssm.common.dao.impl.UserDao;
import com.cssm.common.pojo.User;
public class UserManager {
	private BaseDao dao;  
	
	public UserManager(){
		dao = new UserDao();
		System.out.println("UserManager IN");
	}
   
    public BaseDao getDao() {
		return dao;
	}
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}
	public User getUsers()  {  
    	return dao.getUser();
    } 
}