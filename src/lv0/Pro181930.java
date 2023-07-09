package lv0;

public class Pro181930 {
	public static void main(String[] args) {
		
		Solution1 s = new Solution1();
		System.out.println(s.solution(4, 4, 4));
		
	}

}
class Solution1 {
    public int solution(int a, int b, int c) {
    	int answer = 0;
    	
    	if ((a == b) && (a == c)) {
    		answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
    	} else if (a != b && b != c && c != a) {
    		answer = a+b+c;
    	} else {
    		answer = (a+b+c)*(a*a+b*b+c*c);
    	}
        return answer;
    }
}