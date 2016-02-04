package com.unittest.MyBatis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hskj.domain.User;
import com.hskj.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
	
	
	private ApplicationContext applicationContext;

	@Test
	public void testUserService()
	{
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService) applicationContext.getBean("userService");
		
		User user =new User();
        user.setId("003");
        user.setName("樱木花道");
         
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("id", "001");
        map.put("name", "方舟子");
        
        int countAll = service.countAll();
        
        service.update_insertUser(map, user);
        
		return;
	}

}
