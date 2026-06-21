import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> type = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            type.add(nums[i]);
        }
        
        System.out.println(type);
        
        answer = Math.min(type.size(), nums.length / 2);
        
        return answer;
    }
}