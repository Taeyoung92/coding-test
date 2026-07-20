class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        long min = 1l;
        long max = times[0];
        
        for(int i=1; i<times.length; i++) {
            if(times[i] > max) max = times[i];
        }
        
        max *= n;
        
        while(min <= max) {
            long mid = (min + max) / 2;
            
            long people = 0;
            
            for(int t : times) {
                people += mid / t;
            }
            
            if(people >= n) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        return answer;
    }
}