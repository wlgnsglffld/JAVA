/**
 * 확대 형 변환
 * 날짜 2023 03 21
 * 김지훈
 */
package chap03;
import java.util.Scanner;
public class ShiftEx {
	
	public static void main(String[] args) {
		Scanner closestdin=new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int a=closestdin.nextInt();
		int b=closestdin.nextInt();
		
		System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
		System.out.println("b="+b+"("+Integer.toBinaryString(b)+")");
		
		System.out.println("a<<2="+(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println("a>>2="+(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
		
		System.out.println("b<<2="+(b<<2)+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println("b>>2="+(b>>2)+"("+Integer.toBinaryString(b>>2)+")");
		
		System.out.println("b>>>2="+(b>>>2)+"("+Integer.toBinaryString(b>>>2)+")");
		
	}
}
