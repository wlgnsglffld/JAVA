/*
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램을
 * for로 작성
 */
package Ch05;
import java.util.Scanner;
public class TestEx2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
{
			  int num=0;
			  int sum=0;
			 
			  Scanner stdin=new Scanner(System.in);
			  System.out.println("정수를 입력하세요:");
			  num=stdin.nextInt(); 
			 
			  for(int i=0; i<=1000;i++)
			  {
			   if(i%num==0)
			   {
			    sum+=i;
			   }
			  }
			 
			  System.out.println(num+"의 배수의 총합="+sum);
			 
			 
			 }
	}
}