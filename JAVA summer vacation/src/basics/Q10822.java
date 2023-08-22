package basics;
import java.util.Scanner;
/* 2개의 정수를 입력 받아 합을 출력하시오.
 * 2개의 값으로 합을 계산하여 돌려주는 클래스와 메소드를 생성하시오.
 */
class Calculator01{
	int add (int num1,int num2) {
		return num1 + num2;
	}
}


public class Q10822 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("첫번째 정수를 입력하세요 : ");
	int num1 = scanner.nextInt();
	System.out.print("두번째 정수를 입력하세요 : ");
	int num2 = scanner.nextInt();

	Calculator calculator = new Calculator();
	int hap = calculator.add(num1, num2);
	
	System.out.println("두 정수의 합 : "+hap);
	}

}
