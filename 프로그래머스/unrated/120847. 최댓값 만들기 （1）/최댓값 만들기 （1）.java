import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int numbersLen = numbers.length;
        int answer = numbers[numbersLen-2] * numbers[numbersLen-1];
        return answer;
    }
}