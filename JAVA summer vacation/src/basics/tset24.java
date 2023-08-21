package basics;

class Asia{
	public String country = "Asia";
	public String getC() {return country;}
}
class China extends Asia{
	public String country = "China";
	public String getC() {return super.country;}
}
class Korea extends Asia{
	public String country = "Korea";
	public String getC(int x) {return super.getC();}
}

public class tset24 {
	public static void main(String[] args) {
		System.out.println(new China().getC());
		System.out.println(new Korea().getC());
	}

}
