package com.idodevjobs.sample.service;

import com.idodevjobs.sample.mode.ExampleModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
 
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.TreeMap;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:test-context.xml")
public class ExampleServiceImplRestTest {
 
    @Autowired
    private RestTemplate restTemplate;
 
    @Test
    public void testCxfRestService() {
        ResponseEntity<ExampleModel> entity = restTemplate.getForEntity("http://localhost:8080/iDoDevJobs/services/example/2", ExampleModel.class);
     
        assertThat(entity.getStatusCode(), equalTo(HttpStatus.OK));
        
    }
    
    @Test
    public void testCxfPostRestService(){
    	String urlString = "http://localhost:8080/iDoDevJobs/services/example/post/1";
    	TreeMap<String, Object> requestMap = new TreeMap<String,Object>();
    	requestMap.put("name", "Smith");
    	Integer age = new Integer(20);
    	requestMap.put("age", age);
    	ExampleModel model=new ExampleModel();
    	model.setDataMap(requestMap);
    	
    	ResponseEntity<ExampleModel> entity = restTemplate.postForEntity(urlString, model, ExampleModel.class);
    	assertThat(entity.getStatusCode(), equalTo(HttpStatus.OK));
    }
}