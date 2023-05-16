package Chap09.exam04;

public class B {
	public B() {
		A a =new A();
		a.field1=1;
		a.field2=1;
		//a.field3=1;		//(x)private 접근 불가
		
		a.method1();
		a.method2();		//(o)default 이지만 같은 패키지 안에서 가능
		//a.method3();	//(x)private 접근 불가
		
	}
}
