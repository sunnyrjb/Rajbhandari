package com.sunny.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.sunny.Rajbhandari.Samsung;
@Configuration
public class Appconfigs {
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

}
