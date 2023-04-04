/*2023.03.28
 * 김지훈
 * 입력받은 단의 구구단 출력하기
 */
	package Ch05;
	import java.util.Scanner;
	public class GugudanTest1 {

	public static void main(String[] args) {
		
		int dan = 5;
		int sum = 0;
		
		for(int i=1; i<=9; i++) 
		{
			sum = dan*i;
			System.out.println(dan+"*"+i+"="+sum);
		}

	}
}
