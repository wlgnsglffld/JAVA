package basics;
import java.util.Scanner;

public class Circle {
	public double cArea(double a) {
		double area =Math.PI*(a*a);
		return area;
	}
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("반지름의 길이를 입력하세요 :");
		int a = stdin.nextInt();
		
		Circle c = new Circle();
		System.out.println("원의 넓이는 : " + c.cArea(a));

	}

}
