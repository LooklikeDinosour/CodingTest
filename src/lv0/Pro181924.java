package lv0;

public class Pro181924 {
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[][] queries = {{0,3}, {1,2}, {1,4}};
		
	}
	
    public static int[] solution(int[] arr, int[][] queries) {
    	
    	for(int i = 0; i < queries.length; i++) {
    		for(int j = 0; j < queries[i].length; j++) {
    			int temp;
    			temp = arr[queries[i][j]];
    			arr[i] = arr[queries[i][j]];    			
    		}
    	}
    	
    	
        int[] answer = {};
        return answer;
    }
}
