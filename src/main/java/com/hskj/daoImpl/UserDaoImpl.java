package com.hskj.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hskj.dao.UserDao;
import com.hskj.domain.User;
import com.hskj.mapper.UserMapper;

@Service("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public int countAll()
	{
		return this.mapper.countAll();
	}
    public void insertUser(User user)
    {
    	this.mapper.insertUser(user);
    }
    public List<User> getAllUser()
    {
    	return this.mapper.getAllUser();
    }
    public User getById(String id)
    {
    	return this.mapper.getById(id);
    }
    public void deleteUser(String id)
    {
    	this.mapper.deleteUser(id);
    }
    public void updateUser(Map<String,Object> map)
    {
    	this.mapper.updateUser(map);
    }


}
