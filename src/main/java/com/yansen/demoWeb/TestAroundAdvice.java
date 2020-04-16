package com.yansen.demoWeb;

import org.aopalliance.intercept.Interceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TestAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("TestAroundAdvice Before: invocation=[" + invocation + "]");
		Object rval = invocation.proceed();
		System.out.println("rval-------- ="+rval);
		System.out.println("TestAroundAdvice Invocation returned");
		return rval;
	}
}
