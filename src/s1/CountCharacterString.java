package s1;

public class CountCharacterString {
	public static void main(String[] args) {
			
//		String s = "Banglore";
//		System.out.println(s.length());
		
		
		
		String str = "Bengaluru";
		
		char[] arr  = str.toCharArray();
		int length = arr.length;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		System.out.println("total charecter: "+count);
		
	}
}
