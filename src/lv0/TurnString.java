package lv0;

import java.util.Scanner;

public class TurnString {
	
	public static void main(String[] args) {
		
	System.out.println(solution("He11oWor1d", "lloWorl", 2));
           
    
	
	
	} 
	
 
	
    public static String solution(String my_string, String overwrite_string, int s) {
        String[] ori = my_string.split("");
        String[] ovr = overwrite_string.split("");
        
        String answer = "";
        for(int i = 0; i < s; i++) {
        	answer += ori[i];
        }
        for(int i = s; i < ovr.length + s; i++) {
        	for(int j = 0; j < i-s + 1; j++) {
        	ori[i] = ovr[j];
        	}
        	answer += ori[i];
        }
        for(int i = ovr.length + s; i < ori.length; i++) {
        	answer += ori[i];
        }
                
        return answer;
    }
}