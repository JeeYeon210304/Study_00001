package test;

import java.util.ArrayList;
import java.util.List;

public class Aaa {

	int a = 1;
	static int b = 2;
	
	public static void main(String[] args) {
		Aaa aaa = new Aaa();
//		
//		
//		aaa.inst();
		
		System.out.println("main : " + aaa.a);
		System.out.println("main : " + b);
	}
	
	public void inst () {
		a = 3;
		b = 3;
		System.out.println(a);
		System.out.println(b);
		
		List<String> lst = new ArrayList<String>();
		
	}
	
}

