package LoopingStatement;

public class whileLoop {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		
		while(i<=10) {
			System.out.println(i);
			i++;
			}
		
		
		while(j<=10) {
			System.out.println("hello");
			j++;
		}
		// print even number 
		int n=1;
		while(n<=10) {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}
		
		
		int m=1;
		while(m<=10) {
			if(m%2==0) {
				System.out.println("even number"+m);
			}else {
				System.out.println("odd number"+m);
			}
			m++;
		}
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}

	}

}
