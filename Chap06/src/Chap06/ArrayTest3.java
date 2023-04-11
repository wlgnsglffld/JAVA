/*
 * 2023.04.11
 * 1차원 배열에서 입력받은 값 검색하기 (선형 검색)
 * 김지훈
 */
package Chap06;
import java.util.Scanner;
public class ArrayTest3 {

	public static void main(String[] args) {
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		int key = stdin.nextInt();
		int cnt=0; //동일한 데이터의 갯수
		
		for (int i = 0; i < inum.length; i++)
		{
			if(key==inum[i])
			{
				cnt++;
	            System.out.println("입력한 숫자는 "+(i+1)+ "은 배열 번째 자리에 있습니다.");
			}
		}
		if (cnt==0)
			System.out.print("입력한 숫자 "+key+"은(는) 배열에 없습니다.");
		else
			System.out.print("입력한숫자 "+key+"은 배열에  "+ cnt+"개 있습니다.");
		
	}
		

}


