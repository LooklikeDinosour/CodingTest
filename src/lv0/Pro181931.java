package lv0;

public class Pro181931 {
	public static void main(String[] args) {
		boolean[] included = {true, false, false, true, true};
		int[] arr = new int[included.length];
		int a = 3;
		int d = 4;
		
		int answer = 0;
		for( int i = 0; i < included.length; i++) {
			if (i == 0) {
				arr[i] = a;
			} else {
				arr[i]= a += d;				
			}
			if (included[i] == true) {
				answer += arr[i];
			}
		}
		System.out.println(answer);
	}
}
class Solution {
	public int solution(int a, int d, boolean[] included) {
		int[] arr = new int[included.length];
		int answer = 0;
		for( int i = 0; i < included.length; i++) {
			if (i == 0) {
				arr[i] = a;
			} else {
				arr[i]= a += d;				
			}
			if (included[i] == true) {
				answer += arr[i];
			}
		}
		return answer;
	}
}

