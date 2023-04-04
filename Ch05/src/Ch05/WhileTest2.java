/**
 * 2023-04-04
 * 김지훈
 * 입력받은 숫자의 펙토리얼 구하기
 * #문제 분석
 *  -변수 : fac, facvalue
 *  #알고리즘
 *  1.팩토리얼 구할 수 입력(fac)
 *  2.반복
 *  	while(fac>1)
 *  	{
 *  		facvalue=fac을 1씩 감소하면서 곱하기
*		}
*3.결과출력
*/

package Ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) 
	{
		Scanner stdin=new Scanner(System.in);
		System.out.println("팩토리얼 계산을 위한 정수값 입력");
		int fac = stdin.nextInt();	
		
		int  facvalue= fac;

		while (fac >1)
		{ 
			System.out.print(fac+"*");
			facvalue *= --fac;
		}
		System.out.println("1=" + facvalue);
	}
}