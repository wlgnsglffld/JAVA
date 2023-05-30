package chap_11;

class Person{
	String name;
	String age;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String Grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
public class CastTest2 {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("Lee");
		p = s;  //자동 타입 변환(upcasting)
				//student 객체가 Person타입으로 업캐스팅
				//studnet 클래스의 필드나 메소드에 접근 불가
		
		System.out.println(p.name);
		//p.grade ="A";
		//p.department="Com"; //컴파일 오류
		
		Person p1 = new Student("Kim");
		Student s1;
		s1 = (Student)p1; //강제형변환(downcasting)
		
		System.out.println(s1.name);
		s1.Grade = "A";	//오류 없음

	}

}
