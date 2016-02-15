package com.idodevjobs.sample.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.hskj.domain.User;
import com.hskj.service.UserService;
import com.idodevjobs.sample.mode.CustomResponse;

@Service("userAuthService")
public class UserAuthServiceImp implements UserAuthService {
	
	private ApplicationContext applicationContext;
	
	public  UserAuthServiceImp() {
		// TODO Auto-generated constructor stub
		this.applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Override
	public CustomResponse getUserList()
	{
		CustomResponse response = new CustomResponse();
		response.setStatusCode("OK");
		response.setMessage("Response Successful");
		
		UserService userService =(UserService) this.applicationContext.getBean("userService");
		List<Map<String, Object>> userList = userService.getAllUserMap();
		TreeMap<String, Object> responseMap = response.getResultMap();
		responseMap.put("userMapList", userList);
		
		return response;
	}

}
