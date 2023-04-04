package Ch04;

import java.util.Scanner;

public class SimplesTest3 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input score:");
		int grade=stdin.nextInt();
		
		switch(grade/10)
		{
		case 10:
			
		case 9:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			
			default:
				System.out.println("F");
			break;
		}
		else 
			System.out.println();
	}
	
}
	}
