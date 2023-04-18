/**
 * 2023.04.18
 * 별 피라미드 3
 * 김지훈
 */
package star;
import java.util.Scanner;
public class star3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=stdin.nextInt();
		for (int i = 1; i <= num; i++) {
		    
		    for(int j = num-1; j >= i; j--) {
		        System.out.print("  ");
		    }
		    
		    for(int j=1; j <=i; j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println("");
		}
	}
}
