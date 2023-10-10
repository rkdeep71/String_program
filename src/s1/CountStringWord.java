package s1;

public class CountStringWord {
	
	public static void main(String[] args) {
		
		String str = "Banglore is the silicon valley of India.";
		String[] s =str.trim().split(" ");
		
		System.out.println(s.length);
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
