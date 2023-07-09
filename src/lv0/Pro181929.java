package lv0;

public class Pro181929 {
	public static void main(String[] args) {
		
	}

}
class Solution2 {
	public int solution(int[] num_list) {
		int mulsum = 1;
		for (int a : num_list) {
			mulsum *= a;
		}
		int sum = 0;
		for (int b :  num_list) {
			sum += b;
		}
		int gobsum = sum*sum;
		int answer = 0;
		if(mulsum < gobsum) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}