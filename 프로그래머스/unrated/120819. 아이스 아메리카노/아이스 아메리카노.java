class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int icedAmericanoPrice = 5500;
        int cups = money/icedAmericanoPrice;
        int change = money%icedAmericanoPrice;
        answer[0] = cups;
        answer[1] = change;
        return answer;
    }
}