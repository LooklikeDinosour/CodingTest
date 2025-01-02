import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        for(int i = 0; i < callings.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(callings[i].equals(answer[j])) {
                    String temps = null;
                    temps = answer[j-1];
                    answer[j-1] = callings[i];
                    answer[j] = temps;
                }
            }
        }
        return answer;
    }
}