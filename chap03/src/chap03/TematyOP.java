/**
 * 확대 형 변환
 * 날짜 2023 03 21
 * 김지훈
 */
package chap03;

import java.util.Scanner;

public class TematyOP {

	public static void main(String[] args) {
		Scanner closestdin=new Scanner(System.in);
		System.out.print("Enter number:");
		int a=closestdin.nextInt();//첫번째 정수 저장
		
		boolean flag;
		flag=(a%2==0)?true:false;
		System.out.print(a+"은 짝수인가?:");
		System.out.println(flag);
		flag=(a%2==1)?true:false;
		System.out.print(a+"은 홀수인가?:");
		System.out.println(flag);
		
	}

}
