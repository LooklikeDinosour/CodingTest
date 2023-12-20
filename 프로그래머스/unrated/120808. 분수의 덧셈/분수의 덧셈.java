class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        int n1 = 0;
        int n2 = 0;
        int d1 = 0;
        int d2 = 0;
        //무조건 큰수는 2쪽으로 보내기
        if(denom1 <= denom2) {
            d2 = denom2;
            d1 = denom1;
            n2 = numer2;
            n1 = numer1;
        } else {
            d2 = denom1;
            d1 = denom2;
            n2 = numer1;
            n1 = numer2;
        }
        if(d2 % d1 == 0) {
            //첫번째 분수
            n1 = n1 * (d2 / d1);
            //두번째 분수 분모가 큰쪽이라 연산 없음
            answer[0] = n1 + n2;
            answer[1] = d2;
        } else {
            answer[0] = (n1 * d2) + (n2 * d1);
            answer[1] = (d1 * d2);
        }
        for(int i = 1; i <= 1000; i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] = answer[0]/i;
                answer[1] = answer[1]/i;
            }
        }
                for(int i = 1; i <= 1000; i++) {
            if(answer[0] % i == 0 && answer[1] % i == 0) {
                answer[0] = answer[0]/i;
                answer[1] = answer[1]/i;
            }
        }
        return answer;
    }
}