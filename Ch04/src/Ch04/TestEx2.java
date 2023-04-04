/**
*2023.03.28
*김지훈
*입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성
**/
package Ch04;
import java.util.Scanner;
public class TestEx2 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num=stdin.nextInt();
		
	    if (num==0 )
	    	System.out.println("0입니다");
	    else  if (num>0 )
	    	System.out.println("양수입니다");
	    else 
	    System.out.println("음수입니다");
	    
		
	}

}
