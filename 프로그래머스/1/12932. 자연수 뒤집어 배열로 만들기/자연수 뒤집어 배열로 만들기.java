class Solution {
    public int[] solution(long n) {
        String num = n + "";
        String[] forReverse = num.split("");
        int frLength = forReverse.length;
        int[] answer = new int[frLength];
        for(int i = 0; i < frLength; i++) {
            answer[i % frLength] = Integer.parseInt(forReverse[(frLength-1)-i]);
        }
        return answer;
    }
}