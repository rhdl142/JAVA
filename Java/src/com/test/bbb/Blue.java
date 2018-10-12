package com.test.bbb;

import com.test.aaa.Red;

public class Blue {

	public void check() {
		
		//다른 패키지 + 클래스
		Red red = new Red();
		
		//System.out.println(red.a); 	//private
		System.out.println(red.b); 	//public
		//System.out.println(red.c);	//default
		//System.out.println(red.d); //protected
		
	}
	
}







