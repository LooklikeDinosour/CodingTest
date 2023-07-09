package lv0;

public class changeindex {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("Stanley1yelnatS", 4, 10));
	}
	
	static class Solution {
	    public String solution(String my_string, int s, int e) {
	        String answer = "";
	        for(int i = s; i <= e; i++) {
	        answer += my_string.charAt(i);
	        }
	        StringBuilder sb = new StringBuilder(answer);
	        sb.reverse();	
	        String rever = sb.toString();
	        String my_string2 = my_string.substring(0, s);
	        String my_string3 = my_string.substring(e+1, my_string.length());
	        answer = my_string2 + rever + my_string3;
	        return answer;
	    }
	}
}
