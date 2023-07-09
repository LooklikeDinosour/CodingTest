package lv0;

import java.util.ArrayList;

public class ElementArray {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int arr[] = {5, 1, 4};
		s.solution(arr);
		
	
	}
	static class Solution {
	    public ArrayList<Integer> solution(int[] arr) {
	    	ArrayList<Integer> list = new ArrayList<>();
	        for(int i = 0; i < arr.length; i++) {
	            for(int j = 0; j < arr[i]; j++) {
	                list.add(arr[i]);
	            } 
	        }
	        
	        return list;
	    }
	}

}
