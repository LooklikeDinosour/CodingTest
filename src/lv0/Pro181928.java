package lv0;

public class Pro181928 {
	public static void main(String[] args) {
		int[] num_list = {3,4,5,2,1};

		String str1 = "";
		String str2 = "";
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 != 0) {
				str1 += num_list[i];
			} else {
				str2 += num_list[i];
			}
		}
		int answer1 = Integer.parseInt(str1);
		int answer2 = Integer.parseInt(str2);
		int answer = answer1 + answer2;
		System.out.println(answer);
		
	}
}

