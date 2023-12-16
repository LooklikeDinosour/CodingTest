import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length;
        int pickMax = nums.length/2; //최대갯수
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numLength; i++) {
                map.put(nums[i], 1);                
        }
        return pickMax > map.size() ? map.size() : pickMax;
    }
}