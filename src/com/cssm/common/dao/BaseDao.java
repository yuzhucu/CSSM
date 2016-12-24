package com.cssm.common.dao;

import java.util.List;
import com.cssm.common.pojo.User;

public interface BaseDao {
	public void saveObject(Object obj) ;

	public User getUser();
}