package com.hskj.serverImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hskj.dao.UserDao;
import com.hskj.domain.User;
import com.hskj.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public int countAll()
	{
		return this.userDao.countAll();
	}
	
	@Override
	public void insertUser(User user)
	{
		this.userDao.insertUser(user);
	}
	
	@Override 
	public void update_insertUser(Map<String,Object> map, User user) 
	{
		this.userDao.updateUser(map);
		this.userDao.insertUser(user);
	}
	
	@Override
	public List<Map<String, Object>>getAllUserMap()
	{
		return this.userDao.getAllUserMap();
	}

}
