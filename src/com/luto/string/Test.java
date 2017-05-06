package com.luto.string;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		test1();
	}


	/**
	 * 测试String，StringBuilder，StringBuffer的效率
	 */
	private static void test1() {
		String str = "1";
		StringBuilder builder = new StringBuilder("1");
		StringBuffer buffer = new StringBuffer("1");
		Date strdate = new Date();
		for (int i = 0; i < 10000;i++) {
			str += i;
		}
		System.out.println("String : " + ((new Date()).getTime() - strdate.getTime()));
		Date builderdate = new Date();
		for(int i = 0;i<10000;i++){
			builder.append(i);
		}
		System.out.println("StringBuilder : " + ((new Date()).getTime() - builderdate.getTime()));
		Date bufferdate = new Date();
		for(int i = 0;i<10000;i++){
			buffer.append(i);
		}
		System.out.println("StringBuffer : " + ((new Date()).getTime() - bufferdate.getTime()));
	}
}
