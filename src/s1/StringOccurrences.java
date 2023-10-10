package s1;

public class StringOccurrences {
	
	public static void main(String[] args) {
		
		String str = "aabbbcccc";
		char[] arr = str.toCharArray();
	
		int[] arr2 = new int[arr.length];
	
//		System.out.println(arr.length);
		
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] != '@') {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = '@';
					}
				}
				arr2[i] = count;
			}
		}
		
		for (int k = 0; k < arr2.length; k++) {
			if(arr[k]!= '@') {
				System.out.println(arr[k]+"----> "+arr2[k]);
			}
		}
	}
}
