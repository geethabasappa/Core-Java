package ArrayBasic;

public class Assament1Udaym {

	public static void main(String[] args) {
		 int[] numbers= new int[5];
				    numbers[0]=10;
				     numbers[1]=20;
				      numbers[2]=30;
				       numbers[3]=40;
				        numbers[4]=50;
				        System.out.println(numbers[0]);
				        System.out.println(numbers[4]);
				        int caluculation=0;
				        
				        for(int i=numbers.length-1;i>=0;i--) {
				     
				        	System.out.println(numbers[i]);
				        	 caluculation =  numbers[i]+caluculation;
				        }
				        System.out.println(caluculation);
				        
				        

	}

}
