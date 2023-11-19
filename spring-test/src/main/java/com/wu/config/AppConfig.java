package com.wu.config;

import com.wu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring
 * @author: wulei
 * @create: 2023-11-19 19:02
 */
@Configuration
@ComponentScan("com.wu")
public class AppConfig {

	@Bean
	public User myUser(){
		User user = new User();
		user.setId(1);
		user.setName("张三");
		return user;
	}
}
