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
		// static ������ Aaa Ŭ������ b�� �������� bbb���� aaa.b���� �ٲ� ������ ����
		
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
		// �̷��� �ϰ� �Ǹ� �������� aaa�� bbb�� ���� �ּҰ��� ����ϱ⿡ ���� ���Ѵ�.
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

