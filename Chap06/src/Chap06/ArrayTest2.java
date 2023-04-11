/*
 * 2023.04.11
 * 1차원 정수 배열 생성 후 가장 큰 값 찾기
 * 김지훈
 * 
 */
package Chap06;

public class ArrayTest2 
{

	public static void main(String[] args)
	{
		int score[]= {88,92,53,62,92,68,82};
		int max=score[0]; //배열의 첫 번째 요소를 max 지정
		for (int i: score) //기존 for문 : for (int i =1; i < score.length; i=i+1)
		{
				if(i>max) //기존의 for 문을 사용할 때의 if문 : if (score[i]>max)
					max =i; //max = score[i] //i 가 max보다 크면 max 변경
		}
		System.out.print("배열 요소의 최대값은 "+max+"입니다.");
	}

}
