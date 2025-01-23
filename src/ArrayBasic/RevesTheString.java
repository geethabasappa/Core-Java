package ArrayBasic;

public class RevesTheString {

	public static void main(String[] args) {
		String name = "Geetha";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			rev=name.charAt(i) +rev;
			
			//System.out.println(rev);
		}

		System.out.println(rev);
	}

}
