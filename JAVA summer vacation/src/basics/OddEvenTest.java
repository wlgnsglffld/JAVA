package basics;
import java.util.Scanner;

public class OddEvenTest {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("숫자 n을 입력하세요: ");
	        int n = scanner.nextInt();
	        
	        OddEven oddEven = new OddEven();
	        int oddSum = oddEven.sumOdd(n);
	        int evenSum = oddEven.sumEven(n);
	        
	       System.out.println("1부터 " + n + "까지의 짝수의 합: " + evenSum);
	       System.out.println("1부터 " + n + "까지의 홀수의 합: " + oddSum);
	        
	        scanner.close();
	    }
	}