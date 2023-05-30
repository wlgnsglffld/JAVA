package chap_10;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "1234-5678", 1);
		
		System.out.println("이름: " + student.name);
		System.out.println("번호: " + student.ssn);
		System.out.println("학번: " + student.studentNo);
		

	}

}
