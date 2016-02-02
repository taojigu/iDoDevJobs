package com.idodevjobs.sample.mode;

import java.util.Map;
import java.util.TreeMap;

public class ExampleModel {
    private String string;
    private int anInt;
    private TreeMap<String, Object>dataMap;
 
    public ExampleModel() {
    	this.dataMap = new TreeMap<String,Object>();
    }
 
    public ExampleModel(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }
 
    public String getString() {
        return string;
    }
 
    public void setString(String string) {
        this.string = string;
    }
 
    public int getAnInt() {
        return anInt;
    }
 
    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
 
    @Override
    public String toString() {
        return "ExampleModel{" +
                "string='" + string + '\'' +
                ", anInt=" + anInt +
                '}';
    }

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(TreeMap<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
