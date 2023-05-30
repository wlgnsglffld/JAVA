package Test1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산을 선택하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        

        switch (operator) {
            case '+':
                Add add = new Add();
                add.setValue(num1, num2);
                int sum = add.calculate();
                System.out.println("결과: " + sum);
                break;
            case '-':
                Sub subtract = new Sub();
                subtract.setValue(num1, num2);
                int difference = subtract.calculate();
                System.out.println("결과: " + difference);
                break;
            case '*':
                Mul multiply = new Mul();
                multiply.setValue(num1, num2);
                int product = multiply.calculate();
                System.out.println("결과: " + product);
                break;
            case '/':
                Div divide = new Div();
                divide.setValue(num1, num2);
                int quotient = divide.calculate();
                System.out.println("결과: " + quotient);
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
                break;
        }
    }
}