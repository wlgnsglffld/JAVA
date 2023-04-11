/*
 * 2023.04.11
 * 2차원 배열의 값은 난수로 초기화
 * 2차원 배열의 각 행의 합게 출력
 * 김지훈
 */
package Chap06;
import java.util.Random;
public class MulttiArrayTest {

	public static void main(String[] args)
	{
		Random ran = new Random();  //난수 발생
		int[][] score = new int[4][4];  //2차원 배열 생성
		
		for(int i=0; i<4; i++)  //행
			for(int j=0; j<4; j++)  //열
				score[i][j] = ran.nextInt(10);  //0~9까지 난수 발생
				
		for(int k=0; k<4; k++) // 행
		{
			int sum=0;
			for (int value : score[k])
			{
				System.out.print(value + "  ");
				sum = sum + value; //행의 합계
			}
			System.out.print("배열 각 숫자 합계는 :"+sum+ " 입니다.\n"); //행의 합계 출력
		}

	}

}
