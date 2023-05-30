package chap_11;

abstract class Figure{
	abstract void draw();
}

class Triangle1 extends Figure{
	public void draw() {
		System.out.println("다형성 : 삼각형을 그린다.");
	}
}

class Rectangle1 extends Figure{
	public void draw() {
		System.out.println("다형성 : 사각형을 그린다.");
	}
}

class Oval1 extends Figure{
	public void draw() {
		System.out.println("다형성 : 타원형을 그린다.");
	}
}

class Polydraw1{	//도형을 그리는 기능만을 위한 클래스 생성
	public void pdraw(Figure f) {	//완벽한 다형성을 제공하기 위해 pdraw()메소드를 선언,
		f.draw();					//매개 변수로 figure형의 객체를 받아들여 그 객체의 draw()메소드를 호출
	}
	/*
	 * public void pdraw(Triangle t){	다형성을 제공하지 않을 경우 각 객체별로 메소드를 작성해햐 한다.
	 * 		t.draw()
	 * }
	 * public void pdraw(Rectangle r){
	 * 		r.draw()
	 * }
	 * public void pdraw(Oval o){
	 * 		o.draw()
	 * }
	 */
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Polydraw1 p = new Polydraw1();
		Figure fg1 = new Triangle1();
		Figure fg2 = new Rectangle1();
		Figure fg3 = new Oval1();
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);

	}

}
