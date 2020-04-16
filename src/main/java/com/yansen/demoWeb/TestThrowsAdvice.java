package com.yansen.demoWeb;

import org.springframework.aop.ThrowsAdvice;

import java.rmi.RemoteException;

public class TestThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(RemoteException ex) throws Throwable {
		// Do something with remote exception
	}
}
