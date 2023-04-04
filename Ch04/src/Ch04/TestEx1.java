/**
*2023.03.28
*김지훈
*직급과 나이를 입력 받아서 직급이 7또는 8이고 나이가 40대이면 "연금 80%"
*직급이 5또는 6이고 나이가 50대이면 "연금 100%"
*그 외의 경우는 "연금 대상자 아님"
*을 출력하는 프로그램
**/

package Ch04;
import java.util.Scanner;
public class TestEx1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input position:");
		int grade=stdin.nextInt();
		
		Scanner stdin2=new Scanner(System.in);
		System.out.print("input age:");
		int age=stdin.nextInt();
	    
	    if ((grade==7 || grade==8) && (age>=40 && age<=49))
	    	System.out.println("Pension 80%");
	    else if((grade==5 || grade==6) && (age>=50 && age<=59))
	    	System.out.println("Pension 100%");
	    else 
	    	System.out.println("non Pension ");
	}
	
}
