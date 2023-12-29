class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        for(int i = 1; i <= n; i++){
            if(i%10 == 0) {
                free++;
            }
        }
        answer = (n * 12000) + ((k-free) * 2000);
        return answer;
    }
}