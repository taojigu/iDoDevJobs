package com.idodevjobs.sample.mode;

import java.util.TreeMap;

public class CustomResponse {
	
	private String statusCode;
	private String message;
	private TreeMap<String, Object> resultMap;
	
	public CustomResponse()
	{
		this.resultMap = new TreeMap<String,Object>();
	}
	
	public String getStatusCode()
	{
		return this.statusCode;
	}
	public void setStatusCode(String code)
	{
		this.statusCode = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TreeMap<String, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(TreeMap<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

}
