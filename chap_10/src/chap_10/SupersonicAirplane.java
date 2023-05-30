package chap_10;

public class SupersonicAirplane extends Airplane {
	public static final int NOMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("supersonic flight.");
		}
		else {
			super.fly(); //Airplane 객채의 fly()메소드 호출
		}
	}
}
