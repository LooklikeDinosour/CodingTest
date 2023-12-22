class Solution {
    public int[] solution(int n) {
        int ansLen = n % 2 == 0 ? n/2 : n/2 + 1;
        int[] answer = new int[ansLen];
        for(int i=0; i<answer.length; i++) {
            answer[i]=2*i+1;
        }
        return answer;
    }
}