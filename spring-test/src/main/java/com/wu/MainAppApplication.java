package com.wu;

import com.wu.config.AppConfig;
import com.wu.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: wulei
 * @create: 2023-11-19 19:03
 */
public class MainAppApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = applicationContext.getBean("myUser", User.class);
		System.out.println(user.getName());

	}
}
