package basics;


	class S1{
		protected int a=50;
		static String x = "파이팅 자바";
	}
	class S2 extends S1{
		public int a = 100;
		String x = "쉬운자바";
		void write() {
			System.out.println(x);
			System.out.println(a);
			System.out.println(super.x);
			System.out.println(super.a);
			
		}
	}
	public class test28 {
	public static void main(String[] args) {
	S2 s = new S2();
	s.write();
	}
}





