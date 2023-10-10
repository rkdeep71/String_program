package s1;

public class CountCharIntSpl {
	
	public static void main(String[] args) {
		
		String str = "ajeetkumar123@gmail.com";
		int ch_count1 = 0;
		int d_count2 = 0;
		int sp_count3 = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 97 && str.charAt(i) <= 122) || str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				ch_count1++;
			} else if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
				d_count2++;
			}else {
				sp_count3++;
			}
		}
		
		
		System.out.println(ch_count1);
		System.out.println(d_count2);
		System.out.println(sp_count3);
	}
}
