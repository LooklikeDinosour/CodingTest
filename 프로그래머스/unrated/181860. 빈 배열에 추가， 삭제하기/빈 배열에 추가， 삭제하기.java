import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            int secondForLoopLength = flag[i] == true ? arr[i]*2 : arr[i];
            for(int j = 0; j < secondForLoopLength; j++) {
                if(flag[i] == true) {
                    stack.add(arr[i]);
                } else {
                    stack.pollLast();
                }
            }
        }
        answer = new int[stack.size()];
        Object[] objAnswer = stack.toArray();
        int idx = 0;
        for(Object oA : objAnswer) {
            answer[idx++] = (int)oA;
        }
        return answer;
    }
}