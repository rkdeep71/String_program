package s1;

public class StringPalindrome {
	public static void main(String[] args) {

//		String str = "kanak";
//		String rev = "";
//		
//		for (int i = str.length()-1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		if (rev.equalsIgnoreCase(str)) {
//			System.out.println("String is  palindrone.");
//		} else {
//			System.out.println("String is not palindrone.");
//		}
//----------------------------------------------------------------------------------------------------
//		String st = "Vivek";
//		char[] arr = st.toCharArray();
//
//		int s_ch = 0;
//		int l_ch = arr.length - 1;
//		char temp;
//		
//		while (s_ch < l_ch) {
//			temp = arr[s_ch];
//			arr[s_ch] = arr[l_ch];
//			arr[l_ch] = temp;
//			s_ch++;
//			l_ch--;
//		}
//		
////	for (char c : arr) {
////		System.out.print(c+" ");
////	}
//
//		String s = new String(arr);
////		System.out.println(s);
//
//		if (s.equalsIgnoreCase(st)) {
//			System.out.println("String is palindrome.");
//		} else {
//			System.out.println("String is not palindrome.");
//		}
		
//------------------------------------------------------------------------------------------------------------------		
		String str = "level";
		char[] arr = str.toCharArray();
	
		int s_ch = 0;
		int l_ch = arr.length - 1;
		char temp;
		
		//using for loop
		for (int i = 0; i < arr.length-1; i++) {
			temp = arr[s_ch];
			arr[s_ch] = arr[l_ch];
			arr[l_ch] = temp;
			s_ch++;
			l_ch--;
		}
		
		String s2 = new String(arr);
		System.out.println(s2);

		if (s2.equalsIgnoreCase(str)) {
			System.out.println("String is palindrome.");
		} else {
			System.out.println("String is not palindrome.");
		}
		
	}
}
