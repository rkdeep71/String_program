package s1;

public class StringIndexLen {
	public static void main(String[] args) {
		
		String str = "Welcome to my home";
		
		String[] arr1 = str.split(" ");
		
		
		
		//1st way
//		int[] count = new int[arr1.length];
//		
//		for (int i = 0; i < arr1.length; i++) {
//			int len = 0;
//			
//			for (int j = 0; j <= i; j++) {
//				len = arr1[i].length();
//			}
//			
//			count[i] = len;
//			
//		}
//		
//		for (int k = 0; k < count.length; k++) {
//			System.out.println(count[k]);
//		}
//----------------------------------------------------------------------------------------------------------------
		
		
		
		//2nd way
		System.out.print("Total each word count is in sequence: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i].length()+" ");
		}
	}
}
