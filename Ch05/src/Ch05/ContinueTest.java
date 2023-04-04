/**
 * 2023-04-04
 * 김지훈
 * 1~100까지의 숫자 중에서 사용자로부터 입력 받은 숫자의 배수의 합을 구하라.
 * #문제분석
 *  
 *   */
package Ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		 int number=0;
		  int count=0;
		  int sum=0;
		 
			Scanner stdin = new Scanner(System.in);
		  System.out.println("양의정수를 입력하세요:");
		  number=stdin.nextInt(); //number이라는 수가 입력수얏 
		 
		  for(int i=0; i<100;i++)
		  {
		   if(i%number==0)
		   {
		    count++;
		    sum+=i;
		   }
		  }
		  

		  System.out.println(number+"의배수 총합="+sum);
		 
		 
		 }
		

	}

