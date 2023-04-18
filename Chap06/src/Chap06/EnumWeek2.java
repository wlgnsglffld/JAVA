/**
 * 2023.04.18
 * 열거타입 Week이용하려면 날짜 정보 필요
 * 컴퓨터의 날짜, 요일, 시간을 얻기 위해 Calendar클래스 필요
 * Calendar.getInstance() Calendar 객체 얻기
 * 
 * today는 스택 영역에 생성, Week 객체는 힙 영역에 생성,
 * Week.SUNDAY는 메소드 영역에 생성
 * 
 * today에 저장되는 값은 Week.SUNDAY 열거 상수가 참조하는 객체 번지
 * Week.SUNDAY와 today 변수는 서로 같은 Week 객체 참조
 * 김지훈
 */
package Chap06;
import java.util.Calendar;

import Chap06.EnumWeek.Week;
public class EnumWeek2 {

	public static void main(String[] args) {
		Week today=null; //열거 타입 변수 생성
		
		Calendar cal=Calendar.getInstance(); //Calendar 객체 얻기
		int week=cal.get(Calendar.DAY_OF_WEEK); //일(1)~토(7)까지 숫자 리턴
		
		switch(week)
		{
			case 1:
				today=Week.SUNDAY; //열거 상수 대입
				break;
			case 2:
				today=Week.MONDAY; //열거 상수 대입
				break;
			case 3:
				today=Week.TUESDAY; //열거 상수 대입
				break;
			case 4:
				today=Week.WEDNESDAY; //열거 상수 대입
				break;
			case 5:
				today=Week.THURSDAY; //열거 상수 대입
				break;
			case 6:
				today=Week.FRIDAY; //열거 상수 대입
				break;
			case 7:
				today=Week.SATURDAY; //열거 상수 대입
				break;
							
		}
		
		System.out.println("오늘은 "+today+" 입니다.");
		
		if(today==Week.SUNDAY)
		{
			System.out.println("쉬는날입니다.");
		}
		else 
		{
			System.out.println("JAVA 공부를 하세요.");
		}

	}

}
