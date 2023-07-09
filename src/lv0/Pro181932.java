package lv0;

public class Pro181932 {
	public static void main(String[] args) {

		String a =solution("1");
		System.out.println(a);

	}

	public static String solution(String code) {
		int mode = 0;
		String ret = "";
		for(int i = 0; i < code.length(); i++) {
			if(mode == 0) {
				if((code.charAt(i) !='1') && (i % 2 == 0)) {
					ret+=code.charAt(i);
				} else if (code.charAt(i) == '1') {
					mode = 1;
				}
			} else if (mode == 1) {
				if((code.charAt(i) != '1') && (i % 2 != 0)) {
					ret+=code.charAt(i);
				} else if (code.charAt(i) == '1') {
					mode = 0;
				}
			} 
		}
		if(ret.equals("")) {
			ret = "EMPTY";
		}
		return ret;
	}
}
