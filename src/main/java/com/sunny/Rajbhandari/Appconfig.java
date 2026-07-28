package com.sunny.Rajbhandari;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.telusko.learn.Samsung;
@Configuration 
public class Appconfig{
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

}
