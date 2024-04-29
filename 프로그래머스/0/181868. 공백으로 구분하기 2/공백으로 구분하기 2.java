class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string
            .trim()
            .replaceAll("[\\s]{2,}", " ")
            .split(" ");
        return answer;
    }
}