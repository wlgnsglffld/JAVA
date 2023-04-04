/**
*2023-04-04
*김지훈
* 두개의 숫자를 입력 받아서 두 숫자 사이의 홀수 값을 모두 더하여 출력하는
 * 프로그램 작성
 * #문제분석
 *  변수 -num1, num2,sum
 *  #알고리즘
 *  1. 두 정수 입력 (num1,num2)
 *  2.선택문 (if (num1<num2))
 *  3.복합논리 (반복문 안에 선택문 포함)
 *  	while(num1 <= num2){
 *  		if(num1 %2 ==1){
 *  			sum=sum+num1
 *  			}	
 *  		num1=num1+1
 */

package Ch05;
import java.util.Scanner;
public class TestEx1 {
	public static void main(String[] args)
	{
		Scanner stdin=new Scanner(System.in);
		System.out.print("first , second :");
		int  num1=stdin.nextInt();		
		int  num2=stdin.nextInt();
		int temp =0, sum=0;
		//num1는 num2보다 항사 적은 값을 가진다
		if(num1 > num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		while(num1<=num2)
		{
				if(num1%2 ==1)
				{
						sum=sum+num1;
				}
				num1=num1+1;
		}
				System.out.print("sum of odd numbers: "+sum);
	}
}
		