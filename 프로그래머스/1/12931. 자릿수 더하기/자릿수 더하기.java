import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nSplit = (n + "").split("");
        for(int i = 0; i < nSplit.length; i++) {
            answer += Integer.parseInt(nSplit[i]);
        }

        return answer;
    }
}