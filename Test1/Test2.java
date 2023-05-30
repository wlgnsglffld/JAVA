package Test;

abstract class Cal{
	public abstract int add(int a, int b); //덧셈
	public abstract int sub(int a, int b); //뺄셈
	public abstract int mul(int a, int b); //뺄셈
	public abstract int div(int a, int b); //뺄셈
	public abstract double aver(int[]a); //배열에 저장된 평균
}	

class Calculate extends Cal{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		return a-b;
	}
	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	@Override
	public int div(int a, int b) {
		return a/b;
	}
	public double aver(int[]a) {
		double sum=0;
		for (int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
}
	public class Test2 {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(1, 3));
		System.out.println(c.sub(5, 1));
		System.out.println(c.mul(4, 3));
		System.out.println(c.div(6, 3));
		
	}
}