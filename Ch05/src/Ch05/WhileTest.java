package Ch05;


public class WhileTest {

	public static void main(String[] args) {

		//While 반복
			int sum=0, cnt=1;
			
			while (cnt<=10)
				{
					sum=sum+cnt;
					cnt=cnt+1;
				}
			System.out.println("1~10 total: "+sum);
			
			//for 반복
			int i, total=0;
			for(i=1;i<=10;i++)
			{
				total=total+i;
			}
			System.out.println("1~10 total(for): "+total);
			
			//do~while
			int hap=0, j=1;
			
			do
				{
					hap=hap+j;
					j=j+1;
				}			while (j<=10);
			System.out.println("1~10 total(do~while: "+hap);
		}

	}