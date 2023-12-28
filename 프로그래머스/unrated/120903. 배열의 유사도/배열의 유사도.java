class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int s1Len = s1.length;
        int s2Len = s2.length;
        for(int i = 0; i < s1Len; i++) {
            for(int j = 0; j < s2Len; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}