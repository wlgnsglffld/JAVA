/**
 * 2023-04-04
 * 김지훈
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * (while,continue 이용)
 *  
 */
package Ch05;
import java.util.Scanner;
public class ContinueTest 
	{
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			System.out.println("수를 입력하세요 :");
			int num=stdin.nextInt();
			int i=0, sum=0;
			
			while(i<=100)
			{
					i++;  //i가 1부터 시작하기
					if (i%num!=0)
						continue;  //i를 num 나눈 나머지가 0이 아니면 수행
					
					sum = sum+i;  //num의 배수만 더하기
			}
			 System.out.print("1~100까지의 숫자 중에 "+num+"의 배수를 더한 값은"+ sum +"입니다");
		
	}
		

	}

