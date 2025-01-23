package JavaBasic;

public class Array1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//for loop
		for(int i=0;i<a.length;i++) {
			System.out.println("using for loop"+a[i]);
		}
		
      //enhanced for loop/for each loop
		for(int x:a) {
			System.out.println("using for each loop"+x);
		}
		
		int n[][]=new int[5][4];
		n[0][0]=1;
		n[0][1]=2;
		n[0][2]=3;
		n[0][3]=4;
		
		n[1][0]=10;
		n[1][1]=20;
		n[1][2]=30;
		n[1][3]=40;
		
		n[2][0]=100;
		n[2][1]=200;
		n[2][2]=300;
		n[2][3]=400;
		
		n[3][0]=1000;
		n[3][1]=2000;
		n[3][2]=3000;
		n[3][3]=4000;
		
		n[4][0]=10000;
		n[4][1]=20000;
		n[4][2]=30000;
		n[4][3]=40000;
		
		for(int j=0;j<n.length;j++) {
			for(int m=0;m<n[j].length;m++) {
				System.out.println(n[j][m]);
			}
		}
			for(int arr[]:n) {
				for(int e:arr) {
					System.out.println(e);
				}
					
				}
				
	}

}
