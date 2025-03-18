package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		for (int i=0; i<=10;++i) {
			
			int n=a+b;
			 a=b;
			 b=n;
			
			System.out.println(a +" ");
			
			
		}

	}

}
