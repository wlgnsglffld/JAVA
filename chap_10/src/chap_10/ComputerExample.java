package chap_10;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		Calculator calculator = new Calculator();
		
		//calculator 객체의 원의 넓이
		System.out.println("circle area:" + calculator.areaCircle(r));
		
		//computer 객체의 원의 넓이
		Computer computer = new Computer();
		System.out.println("circle area:" + computer.areaCircle(r));

	}

}
