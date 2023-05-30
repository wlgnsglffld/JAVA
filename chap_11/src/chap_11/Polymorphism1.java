/**
 * 다향성
 * 1.서로 다른 객체가 동일한 메세지에 대해 서로 다르게 응답하는 것
 * 2.상속, 형 변환, 오버라이딩으로 실현
 * 메소드 오버라이딩 제약조건
 * 1.상위 클래스의 메소드와 동일한 원형이어야 한다.
 * 2.상위 클래스 메소드의 접근 지정자 보다 범위를 좁혀 오버라이딩 할 수 없다.
 * 3. static, private, final로 선언된 메소드는 오버라이딩 할 수 없다.
 */
package chap_11;
class Shape{
	public Shape next;
	public Shape() {
		next = null;
	}
	public void draw() {	
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {	//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {	//메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {	//메소드 오버라이딩
		System.out.println("Circle");
	}
}
public class Polymorphism1 {

	static void paint(Shape p) {
		p.draw(); //동적 바인딩(실행할 메소드를 컴파일시가 아닌 실행시(run time)에 결정
				  //p가 가리키는 객체 내레 오버라이딩 된 draw()호출
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line); //line에 오버라이딩한 draw() 실행
		paint(new Shape());	//Shape에 오버라이딩한 draw()실행
		paint(new Line());	//
		paint(new Rect());
		paint(new Circle());
	}

}
