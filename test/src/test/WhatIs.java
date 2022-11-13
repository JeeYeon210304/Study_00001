package test;

import java.util.ArrayList;
import java.util.List;

public class WhatIs {

	public static void main(String[] args) {
//		wrote();
//		
//		WhatIs whatIs = new WhatIs();
//		whatIs.test1();
		
		Aaa aaa = new Aaa();
		Aaa bbb = new Aaa();

		aaa.a = 10;
		aaa.b = 10;
		bbb.a = 9;
		bbb.b = 9;
		
//		System.out.println(aaa.a + " " + aaa.b
//					+ "\n" + bbb.a + " " + bbb.b);
		// static 변수인 Aaa 클래스의 b는 참조변수 bbb에서 aaa.b에서 바뀐 값으로 나옴
		
		System.out.println("aaa.a : " + aaa.a);
		System.out.println("bbb.a : " + bbb.a);
		System.out.println("-----------------");
		aaa = bbb;
		System.out.println("aaa.a : " + aaa.a);
		System.out.println("bbb.a : " + bbb.a);
		System.out.println("-----------------");
		bbb.a = 1;
		System.out.println("aaa.a : " + aaa.a);
		System.out.println("bbb.a : " + bbb.a);
		System.out.println("-----------------");
		// 이렇게 하게 되면 참조변수 aaa와 bbb가 같은 주소값을 사용하기에 같이 변한다.
	}
	

	
	void test1() {
		int a;
		
	}
}

class Wrote {
	int a;
}
class Use {
	int a;
}

