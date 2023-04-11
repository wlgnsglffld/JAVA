/*
 * 2023.04.04
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면
 * 1000을 넘은 수와 평균을 출력
 * 김지훈
 */
package Ch05;
import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args)
	{
		int sum = 0; //합계
		int cnt = 0;  //입력 횟수
		
		while(true)
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("숫자 입력 :");
			int num = stdin.nextInt();
			
			cnt++;  //입력 횟수 증가
			sum=sum+num;  //입력받은 값의 합게
			
			if(sum >= 1000) //합계가 1000 이상인지 확인
				
				break;  //반복 종료
		}
		System.out.print("입력한 숫자의 합이"+ sum +"으로 1000을 넘었습니다. " );  
		System.out.print("\n합계는 : "+ sum +"이고," );  //합계 출력
		System.out.print("평균은 : "+ sum/cnt + "입니다.");  //합계 출력
	}

}
