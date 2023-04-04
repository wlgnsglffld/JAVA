/**
 * 동전 교환 프로그램
 *입력된 액수만큼 500원, 100원, 50원,10원 짜리 동전으로 교환해 주는프로그램 작성
 *조건1 :동전의 총개수를 최소화
 *조건2 :고액의 동전 우선 교환 
 * 
 */
package chap03;
import java.util.Scanner;
public class OpEx1 {
	 public static void main(String[] args) {
	        Scanner closestdin = new Scanner(System.in);
	        int[] arr = { 500, 100, 50, 10}; //arr 나머지
            System.out.print("금액을 입력하세요 : ");
            
	        int price = closestdin.nextInt();
	        
	        for(int i=0; i<arr.length; i++) {
	            if(price/arr[i] > 0) {
	                System.out.println(arr[i]+"원 : "+price/arr[i]+" 개 ");
	                price%=arr[i];
	            }
	        }
	        System.out.println();
	    }
	}