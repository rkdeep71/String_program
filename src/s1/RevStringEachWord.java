package s1;

public class RevStringEachWord {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Bihar";
		String[] words = str.split(" ");
		String reverseString = "";
		
		for (int i = 0; i < words.length; i++) {
			
			String word = words[i];
			char[] arr1 = word.toCharArray();
			
			int sno = 0;
			int lno = arr1.length-1;
			char temp;
			
			for (int j = 0; j < arr1.length/2; j++) {
				temp = arr1[sno];
				arr1[sno] = arr1[lno];
				arr1[lno] = temp;
				sno++;
				lno--;
			}
			
			String str2 = new String(arr1);
			reverseString += str2+" ";
			
		}
		System.out.println(reverseString);
		
	}
}
