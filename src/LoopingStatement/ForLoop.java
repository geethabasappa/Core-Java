package LoopingStatement;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		for(int m=1;m<=10;m++) {
			if(m%2==0) {
				System.out.println("Even " +m);
			}else {
				System.out.println("odd " +m);
			}
			
		}
		

	}

}
