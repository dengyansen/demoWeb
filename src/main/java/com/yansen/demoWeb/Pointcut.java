package com.yansen.demoWeb;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;

public interface Pointcut {
	ClassFilter getClassFilter();
	MethodMatcher getMethodMatcher();
}
