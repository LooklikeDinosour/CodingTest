package lv0;

public class 공배수 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(10, 2, 5));


	}

	static class Solution {
		public static int solution(int number, int n, int m) {
			int answer = 0;
			if (number % n == 0 && number % m == 0) {
				answer = 1;
			} else {
				answer = 0;
			}

			return answer;
		}
	}
}
