import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numLength = nums.length;
        int pickMax = nums.length/2; //최대갯수
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numLength; i++) {
            set.add(nums[i]);
        }
            return pickMax > set.size() ? set.size() : pickMax;
    }
}