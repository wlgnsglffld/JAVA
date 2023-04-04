/**
 * 2023-04-04
 * 김지훈
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package Ch05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("정수를 더하기. ");
		System.out.println("몇개를 더하나? ");
		int n = stdin.nextInt();
		int sum = 0;
		int i;
		for(i=0; i<n; i++)
		{
			System.out.print("정수(1000이 넘어가면 종료): ");	
			int t =stdin.nextInt();
			if (t >=1001) break;
			sum += t;
		}
		
		System.out.println("합계는 "+sum+"입니다");
		if (i != 0)
			System.out.println("평균은 "+sum/i+"입니다");
	}

}
