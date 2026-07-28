package com.sunny.Rajbhandari;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.telusko.learn.AppConfig;
//import com.telusko.learn.Samsung;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
    	Samsung s7=context.getBean(Samsung.class);
    	s7.config();
       // System.out.println("Hello World!");
    	//Vehicle car=new Car();
    	//car.drive();
    	//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Vehicle b=(Vehicle)context.getBean("car");
    	//b.drive();
    	//Tyre t=(Tyre)context.getBean("tyre");
    	//System.out.println(t);
    	//System.out.println(t.brand);
    	} 
}
