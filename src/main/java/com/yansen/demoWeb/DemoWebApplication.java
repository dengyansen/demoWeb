package com.yansen.demoWeb;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoWebApplication {
	public static void main(String[] args){
		SpringApplication.run(DemoWebApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) throws Exception {
		ProxyFactory factory = new ProxyFactory(new BusinessImpl());
//		factory.addAdvice(new TestBeforeAdvice());
		factory.addAdvice(new TestAroundAdvice());
		factory.addAdvice(new TestAroundAdvice());
//		factory.addAdvice(new ExceptionThrowsAdvice());
//		factory.addAdvisor(myAdvisor);
		System.out.println("111");
		Business tb = (Business) factory.getProxy();
		tb.getInfo();
		System.out.println("11111");
		return String.format("Hello %s!", name);
	}
}
