package com.yansen.demoWeb;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionThrowsAdvice  implements ThrowsAdvice {
	public void afterThrowing(MyException2 ex) throws Throwable {
		System.out.println(" MyException2  thorowes hhhh");
	}
}
