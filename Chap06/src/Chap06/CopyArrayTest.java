/*
 * 2023.04.11
 * 1차원 배열의 복사 
 * 김지훈
 */
package Chap06;

public class CopyArrayTest {

	public static void main(String[] args) {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		
		num2 = num1;   //배열 주소가 복사
		num2[2]=200;  //num2[2]요소의 값을 변경

		System.out.print("num1 배열의 값 : ");
		
		for (int i : num1) //num1 출력
			System.out.print(i+"  ");

	
		System.out.print("\num2 배열의 값 : ");
		
		for (int i : num2) //num2 출력
			System.out.print(i+"  ");

	
			int num3[]= {100,200,300};
			int num4[]= {400,500,600};
			for (int i =0; i < num3.length; i++)
				num4[i] = num3[i]; //배열 요소 1개씩 복사
			
			num4[2] = 999; //num4[2]요소 값 변경
			
			System.out.print("\nnum3 배열의 값 : ");
			for (int i : num3)
				System.out.print(i+"  ");
			System.out.print("\nnum4 배열의 값 : ");
			for (int i : num4)
				System.out.print(i+"  ");
		
	}

}
