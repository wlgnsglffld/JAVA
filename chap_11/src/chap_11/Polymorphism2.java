package chap_11;

class Item{
	public int price;
}

class Noodle extends Item{
	public Noodle() {
		price = 2500;
	}
	public String toString() {
		return "Noodle";
	}
}

class Mixnoodle extends Item{
	public Mixnoodle() {
		price = 3000;
	}
	public String toString() {
		return "Mixnoodle";
	}
}

class Woodong extends Item{
	public Woodong() {
		price = 2000;
	}
	public String toString() {
		return "Woodong";
	}
}

class Buyer{
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item it, int count) {
		System.out.println(it + "을(를)" + count + " 개 맛있게 먹었습니다.");
		money = money -it.price*count;
		System.out.println("현재 남은 돈:" + money);
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		Buyer me = new Buyer(20000);
		me.buy((new Woodong()),3);
		me.buy((new Noodle()),2);
		me.buy((new Mixnoodle()),2);

	}

}
