package s1;

public class ReverseString {

	public static void main(String[] args) {

		String str1 = "welcome to my home";
		String[] words = str1.split(" ");

		String reversedString = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reversedString += words[i]+" ";
		}
		System.out.println(reversedString);
//-------------------------------------------------------------------------		
		
		String s1 = "Welcome to Programming World";
		char[] arr  = s1.toCharArray();
		
		int sno = 0;
		int lno = arr.length-1;
		char temp;
		
		while (sno < lno) {
			temp = arr[sno];
			arr[sno] = arr[lno];
			arr[lno] = temp;
			sno++;
			lno--;
		}
		
		String s2 = new String(arr);
		System.out.println(s2);
//-----------------------------------------------------------------------------
		
		
		String s3  = "Reservation";
		char[] arr1 = s3.toCharArray();
		
		int s_no = 0;
		int e_no = arr1.length-1;
		char temp1;
		
		
		for (int i = 0; i < arr1.length/2; i++) {
			temp1 = arr1[s_no];
			arr1[s_no] = arr1[e_no];
			arr1[e_no] = temp1;
			s_no++;
			e_no--;
		}
		
		String sh = new String(arr1);
		System.out.println(sh);
//-------------------------------------------------------------------------------		
		String st = "Welcome to my home";
		
		String rev = "";
		
		for (int i = st.length()-1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		
		System.out.println(rev);
		
	}
}
