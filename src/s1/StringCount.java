package s1;

public class StringCount {
	
	public static void main(String[] args) {
		
		String str = "Welcome to my home for party";
		String[] split = str.split(" ");
	
		int count = 0;
		
		for (int i = 0; i < split.length; i++) {
			count++;
		}
		System.out.println(count);
	
	
	}
}
