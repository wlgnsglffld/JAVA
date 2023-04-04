/**
 * 윤년 계산 프로그램
 *조건1 :4로 나누어 떨어지고,100으로 나누어 떨어지지 않으면 윤년이다.
 *조건2 :400으로 나누어 떨어지는 해도 윤년에 포함 된다. 
 */
package chap03;
import java.util.Scanner; //입력받기
public class OpEx2 {

	public static void main(String[] args) {
		System.out.println("연도를 입력하세요.");
		Scanner closestdin = new Scanner(System.in);//입력받기
		int year = closestdin.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}
}