package com.johnson.test;

import java.util.ArrayList;
import java.util.List;

public class SingletonDemo {
    private static SingletonDemo instant = null ;
    
    private SingletonDemo() {}
    
    
    public static SingletonDemo getInstant() {
    	
    	if(instant == null) {
    		synchronized(SingletonDemo.class){
    			if(instant == null )
    				instant = new SingletonDemo();
    		}
    	}
    	return instant ;
    }
   public static void main(String[] args) {
	List<String> List = new ArrayList<String>();
}
}
