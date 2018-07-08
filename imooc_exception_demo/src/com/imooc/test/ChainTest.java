package com.imooc.test;

public class ChainTest {

	public static void main(String[] args) {
		ChainTest c = new ChainTest();
		try {
			c.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void test1() throws DrunkException{
		throw new DrunkException("喝车别开酒！");
	}
	
	public void test2(){
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException Newexc = new RuntimeException(e);
			Newexc.initCause(e);
//			throw Newexc;
		}
	}

}
