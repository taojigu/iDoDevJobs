package com.hskj.service;

import java.util.List;
import java.util.Map;

import com.hskj.domain.User;

public interface UserService {
	
	public int countAll();
	public void insertUser(User user);
	public void update_insertUser(Map<String,Object> map,User user);
	public List<Map<String, Object>>getAllUserMap();
}
