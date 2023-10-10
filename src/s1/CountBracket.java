package s1;

public class CountBracket {
	
	public static void main(String[] args) {
		
		String s1 = "(((()))))";
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '(') {
				count1++;
			} else if(s1.charAt(i) == ')'){
				count2++;
			}
		}
		System.out.println("No. of opening bracket is: "+count1);
		System.out.println("No. of closing bracket is: "+count2);
	}
}
