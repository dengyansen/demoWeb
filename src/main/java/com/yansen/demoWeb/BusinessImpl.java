package com.yansen.demoWeb;

public class BusinessImpl implements Business {
	@Override
	public int getInfo() throws MyException {
		System.out.println("hello,invoke getInfo");
//		if(1 == 1){
//			throw  new MyException();
//		}
		return 0;
	}
}
