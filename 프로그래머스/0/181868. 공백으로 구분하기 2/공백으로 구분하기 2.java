class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        my_string = my_string.trim().replaceAll("[\\s]{1,}", " ");
        answer = my_string.split(" ");
        return answer;
    }
}