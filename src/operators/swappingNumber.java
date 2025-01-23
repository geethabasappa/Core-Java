package operators;

public class swappingNumber {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		System.out.println( " Before Swapping a is "+a+ " b is  "+b);
		//Using Third variable
	//	int t=a;
	//	a=b;
	//	b=t;
	//	System.out.println( " After Swapping a is "+a+ " b is  "+b);
		//Using using + and - Without the using Third variable
	//	a=a+b;
	//	b=a-b;
	//	a=a-b;		
	//	System.out.println( " After Swapping a is "+a+ " b is  "+b);
		//using * and / it only number are should not be  0
		//a=a*b;
	//	b=a/b;
	//	a=a/b;
	//	System.out.println( " After Swapping a is "+a+ " b is  "+b);
		// using bitwise xor
	//	a=a^b;
	//	b=a^b;
	//	a=a^b;
	//	System.out.println( " After Swapping a is "+a+ " b is  "+b);
		//single statement 
		b=a+b-(a=b);
		System.out.println("After Swapping is "+a+ " b is "+b);
	}

}
