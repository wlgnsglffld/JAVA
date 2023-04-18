/**
 * 2023.04.18
 * 별 피라미드
 * 김지훈
 */
package star;
import java.util.Scanner;
public class star1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=stdin.nextInt();
		int i=1;
		while(i<=num) 
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j=j+1;
			}
			System.out.println(); 
			i=i+1;
		}

	}

}
