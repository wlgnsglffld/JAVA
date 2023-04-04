package Ch04;

	public class Test4 {
	import java.util.Scanner;
	public static void main(String[] args) {
		



     Scanner stdin = new Scanner(System.in);
    System.out.print("점수를 입력하세요: " );
    int score;
    String grade;
    
    if (score >= 90) {
        grade = "A";
        
        if (score >= 96) {
            grade += "+"; 
        } else if (score < 93) {
            grade += "-";
        } else {
            
        }
    } else if (score >= 80 && score < 90) {
        grade = "B";
        if (score >= 86) {
            grade += "+";
        } else if (score < 83) {
            grade += "-";
        } else {
            
        }
    } else {
        grade = "C";
    }
    

}

    
  