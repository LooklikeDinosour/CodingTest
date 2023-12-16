import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length;
        int pickMax = nums.length/2; //최대갯수
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numLength; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);                
            }
        }
        return pickMax > list.size() ? list.size() : pickMax;
    }
}