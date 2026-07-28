package com.sunny.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.sunny.Rajbhandari.Appconfig;
//import com.sunny.Rajbhandari.Samsung;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfigs.class);
    	Samsung s7=context.getBean(Samsung.class);
    	s7.config();

	}

}
