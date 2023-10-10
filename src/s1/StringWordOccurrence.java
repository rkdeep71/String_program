package s1;

public class StringWordOccurrence {

	public static void main(String[] args) {
		
		String str = "Welcome to bengaluru welcome to Bengaluru";
		String[] arr1 = str.split(" ");
		
		int[] arr2 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			int count = 1;
			
			if (arr1[i] != null) {
				for (int j = i+1; j < arr1.length; j++) {
					if (arr1[i].equalsIgnoreCase(arr1[j])) {
						count++;
						arr1[j] = null;
					}
				}
				arr2[i] = count;
			}
			}
		
		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] != null) {
				System.out.println(arr1[k]+"----"+arr2[k]);
			}
			}
	
			
			
			
		}
		
	}

