package com.unittest.MyBatis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hskj.domain.User;
import com.hskj.service.UserService;
import com.sun.jmx.snmp.Timestamp;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
	
	
	private ApplicationContext applicationContext;
	
	public UserServiceTest()
	{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	
	@org.junit.Before public void  setUp() 
	{
		System.out.println("Before");
	}

	@Test
	public void testUserService()
	{
		
		
		UserService service = (UserService) applicationContext.getBean("userService");
        int countAll = service.countAll();
        
        assertThat("the count more than 0",countAll>0);
        
		return;
	}
	
	@Test
	public void testUpdateInsertUser()
	{

		UUID uuid= java.util.UUID.randomUUID();
        String userid= uuid.toString();
		User user =new User();
        user.setId(userid);
        user.setName("樱木花道");
 
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("id", "001");
        map.put("name", "方舟子");
        UserService service = (UserService) applicationContext.getBean("userService");
        //service.update_insertUser(map, user);
        service.insertUser(user);
        return;
        
	}

}
