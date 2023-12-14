import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int arrLen = arr.length;
        if(arrLen < 2) {
            answer = Arrays.copyOf(arr, 1);
        } else if(arrLen < 3) {
            answer = Arrays.copyOf(arr, 2);
        } else if (arrLen < 5) {
            answer = Arrays.copyOf(arr, 4);
        } else if (arrLen < 9 ) {
            answer = Arrays.copyOf(arr, 8);
        } else if (arrLen < 17) {
            answer = Arrays.copyOf(arr, 16);
        } else if (arrLen < 33) {
            answer = Arrays.copyOf(arr, 32);
        } else if (arrLen < 65) {
            answer = Arrays.copyOf(arr, 64);
        } else if (arrLen < 129) {
            answer = Arrays.copyOf(arr, 128);
        } else if (arrLen < 257) {
             answer = Arrays.copyOf(arr, 256);
        } else if (arrLen < 513) {
            answer = Arrays.copyOf(arr, 512);
        } else {
            answer = Arrays.copyOf(arr, 1024);
        }
        return answer;
    }
}