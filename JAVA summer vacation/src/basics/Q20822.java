package basics;
import java.util.Scanner;
/* 2개의 정수를 입력 받아 합을 출력하시오.
 * ① 두 수 사이의 합계를 계산한다.
 * ② 두 수 사이의 홀수의 합계를 계산한다.
 * ③ 두 수 사이의 짝수의 합계를 계산한다.
 * 2개의 값으로 각 합을 계산하여 돌려주는 클래스와 메소드를 생성하시오.
 */
class Calculator {
	public int calculateSum(int num1, int num2) {
		int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
	}
	public int calculateOddSum(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				sum += i;
	            }
			}
		return sum;
		}
	public int calculateEvenSum(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sum += i;
				}
			}
		return sum;
		}
	}

public class Q20822 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("첫 번째 정수를 입력하세요: ");
		        int num1 = scanner.nextInt();

		        System.out.print("두 번째 정수를 입력하세요: ");
		        int num2 = scanner.nextInt();

		        Calculator calculator = new Calculator();

		        int totalSum = calculator.calculateSum(num1, num2);
		        System.out.println("두 수 사이의 합계: " + totalSum);

		        int oddSum = calculator.calculateOddSum(num1, num2);
		        System.out.println("두 수 사이의 홀수 합계: " + oddSum);

		        int evenSum = calculator.calculateEvenSum(num1, num2);
		        System.out.println("두 수 사이의 짝수 합계: " + evenSum);
		    }
		}	




