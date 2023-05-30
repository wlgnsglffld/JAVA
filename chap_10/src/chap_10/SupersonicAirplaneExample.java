package chap_10;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = 2; //or SupersonicAirplane.SUPERSONIC
		sa.fly();
		sa.flyMode = 1; //or SupersonicAirplane.NOMAL
		sa.fly();
		sa.land();
	}

}
