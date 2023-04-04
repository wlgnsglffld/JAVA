/**
*2023-04-04
*김지훈
*두 숫자를 입력받아서 두 수 사이의 합계 출력 하기
* #문제분석
* -변수 : first, second, sum
* #알고리즘
*  1.정수 입력(first,second)
*  2.선택문(if (first<second))
*  3.반복문(for (first; second; first++))
*  					sum=sum+first
*  
*/
package Ch05;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  max = 0 , min = 0 , sum =0;
		
		System.out.print("첫 번째 정수: ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int second = sc.nextInt();
		
		if (first> second)
		{
			max = first ;
			min = second;
		}
		else
		{
			max = second;
			min = first;
		}
		for (int i = min; i<= max; i++)
		{
			sum += i;
		}
		System.out.println(min +"에서"+ max +"까지 정수들의 합:"+sum);
	}

}
