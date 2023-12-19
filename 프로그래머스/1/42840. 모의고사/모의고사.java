
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int idx1 = 0, idx2 = 0, idx3 = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i]==answer1[idx1++]) {
                answer[0]++;
            }
                            if(idx1 == answer1.length ) {
                    idx1 = 0;
                }
            if(answers[i]==answer2[idx2++]) {
                answer[1]++;

            }
                            if(idx2 == answer2.length ) {
                    idx2 = 0;
                }
            if(answers[i]==answer3[idx3++]) {
                answer[2]++;

            }
                            if(idx3 == answer3.length ) {
                    idx3 = 0;
                }
        }
        
        if(answer[0]==answer[1] && answer[0]==answer[2]) {
            answer = new int[] {1, 2, 3};
        } else if (answer[0]==answer[1] && answer[0] > answer[2]){
            answer = new int[] {1, 2};
        } else if (answer[1]==answer[2] && answer[1] > answer[0]){
            answer = new int[] {2, 3};
        } else if (answer[0]==answer[2] && answer[2] > answer[1]){
            answer = new int[] {1, 3};
        } else {
            int ansMax = 0;
            int ansIdx = 0;
            for(int i = 0; i < answer.length; i++) {
                if(ansMax < answer[i]) {
                    ansMax = answer[i];
                    ansIdx = i+1;
                    
                }
            }
            answer = new int[] {ansIdx};
        }
        return answer;
    }
}