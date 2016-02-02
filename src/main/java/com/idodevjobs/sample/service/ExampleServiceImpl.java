package com.idodevjobs.sample.service;

import com.idodevjobs.sample.mode.ExampleModel;


import org.springframework.stereotype.Service;
 
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
 
    @Override
    public ExampleModel get(String modelId) {
    	
        return new ExampleModel("example", 1001);
    }
    
    @Override
    public ExampleModel post(ExampleModel model){
    	return model;
    }
}
