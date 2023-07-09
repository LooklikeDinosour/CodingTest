package lv0;

import java.util.Scanner;

public class LowUp {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] ch = new char[a.length()];
		ch = a.toCharArray();
		String str = "";
		for(int i = 0; i < a.length(); i++) {
			if ('a' <= ch[i] && ch[i] <= 'z') {
				str = ch[i] + "";
				str = str.toUpperCase();
				System.out.print(str);
			} else {
				str = ch[i] + "";
				str = str.toLowerCase();	
				System.out.print(str);
			}
		}
	}
}


