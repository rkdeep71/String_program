package s1;

public class CheckBracketIsEqual {
	
	public static void main(String[] args) {
		
		String s1 = "((()))";
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '(') {
				count1++;
			} else if(s1.charAt(i) == ')'){
				count2++;
			}
		}
		
		if (count1 == count2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
}
