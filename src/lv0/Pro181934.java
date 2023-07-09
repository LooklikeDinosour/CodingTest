package lv0;

public class Pro181934 {
	public static void main(String[] args) {
		
		int a =solution("<","=",20,50);
		System.out.println(a);
		
	}

    public static int solution(String ineq, String eq, int n, int m) {
    	boolean answerb = false;
        if((ineq.equals(">")) && (eq.equals("="))) {
        	answerb = (n >= m);
        
        } else if ((ineq.equals(">")) && (eq.equals("!"))) {
        	answerb = (n > m);
        	
        } else if ((ineq.equals("<")) && (eq.equals("="))) {
        	answerb = (n <= m);
        	
        } else if ((ineq.equals("<")) && (eq.equals("!"))) {
        	answerb = (n < m);
        	
        }
        int answer = 0;
        if(answerb == true) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        return answer;
    }	
	
}

