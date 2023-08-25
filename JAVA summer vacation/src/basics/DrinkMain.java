package vaction;

class DrinkWithCarbonation {
    String name;
    int price;
    
    DrinkWithCarbonation(String name, int price) {
        this.name = name;
        this.price = price;
    }// DrinkWithCarbonation 클래스의 생성자

    void show() {
        System.out.print("음료 종류: " + name);
    } // 음료 종류 출력 메서드

    void showPrice() {
        System.out.println("가격: " + price + "원");
    }// 가격 출력 메서드
}

class Cola extends DrinkWithCarbonation {
    Cola() {
        super("콜라", 1000);
    }// 음료 클래스 , 생성자 호출하여 초기화
}

class Soda extends DrinkWithCarbonation {
    Soda() {
        super("사이다",1000);
    }
}

class Fanta extends DrinkWithCarbonation {
    Fanta() {
        super("환타",1000);
    }
}

class DrinkWithAlcohol extends DrinkWithCarbonation {
    double alcoholContent;

    DrinkWithAlcohol(String name, double alcoholContent, int price) {
        super(name, price);
        this.alcoholContent = alcoholContent;
    }

    @Override
    void show() {
        super.show();
        if (this instanceof DrinkWithAlcohol) {
            System.out.print(" 알콜 함량: " + alcoholContent + "% ");
        }
        showPrice(); // 가격 출력 추가
    }
}// 음료 정보 출력 메서드 (오버라이딩)


class Powerade extends DrinkWithCarbonation {
    Powerade() {
        super("파워에이드.", 1500);
    }
}


class Pocari extends DrinkWithCarbonation {
	Pocari() {
        super("포카리.",1500);
    }
}
class Gatorade extends DrinkWithCarbonation {
	Gatorade() {
        super("게토레이.",1500);
    }
}
class Cass extends DrinkWithAlcohol {
    Cass() {
        super("카스.", 4.5, 4500);
    }
}

class Terra extends DrinkWithAlcohol {
    Terra() {
        super("테라.", 5.0, 5000);
    }
}

class Kelly extends DrinkWithAlcohol {
    Kelly() {
        super("켈리.", 4.0, 4000);
    }
}


class BlackCoffee extends DrinkWithCarbonation {
    BlackCoffee() {
        super("블랙 커피.", 500);
    }
}

class MixCoffee extends DrinkWithCarbonation {
    MixCoffee() {
        super("믹스 커피." , 800);
    }
}

public class DrinkMain {
    public static void main(String[] args) {
        DrinkWithCarbonation drink1 = new Cola();
        DrinkWithCarbonation drink2 = new Soda();
        DrinkWithCarbonation drink3 = new Fanta();
        DrinkWithCarbonation drink4 = new Powerade();
        DrinkWithCarbonation drink5 = new Pocari();    
        DrinkWithCarbonation drink6 = new Gatorade(); 
        DrinkWithAlcohol drink7 = new Cass();
        DrinkWithAlcohol drink8 = new Terra();
        DrinkWithAlcohol drink9 = new Kelly();
        DrinkWithCarbonation drink10 = new BlackCoffee();
        DrinkWithCarbonation drink11 = new MixCoffee();

        drink1.show();
        System.out.println();

        drink2.show();
        System.out.println();

        drink3.show();
        System.out.println();

        drink4.show();
        System.out.println();

        drink5.show();
        System.out.println();

        drink6.show();
        System.out.println();

        drink7.show();
        System.out.println();

        drink8.show();
        System.out.println();

        drink9.show();
        System.out.println();
        
        drink10.show();
        System.out.println();
        
        drink11.show();
        System.out.println();
    }
}
