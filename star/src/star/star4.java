/**
 * 2023.04.18
 * 별 정삼각형 
 * 김지훈
 */
package star;
import java.util.Scanner;
public class star4 {

	public static void main(String[] args) 
	{
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=stdin.nextInt();
		for (int i = 1; i <= num; i++) 
		{
		    for (int j = num; j > i; j--) 
		    {
		        System.out.print("  ");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) 
		    {
		        System.out.print("*");
		    }
		    for (int j = num; j > i; j--) 
		    {
		        System.out.print("  ");
		    }
		    
		    System.out.println(" ");		    
		}
	}
	
}

