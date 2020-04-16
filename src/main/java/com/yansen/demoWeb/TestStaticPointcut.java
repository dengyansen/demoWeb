package com.yansen.demoWeb;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class TestStaticPointcut extends StaticMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return false;
	}
}
