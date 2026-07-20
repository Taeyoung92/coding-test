import java.util.*;

class Solution {
    public long solution(int distance, int[] rocks, int n) {
        long answer = 0;
        
        Arrays.sort(rocks);
        
        // 각 바위 사이의 거리를 구하는 Array의 갯수는 rocks.length + 2(시작점 0과 마지막지점) - 1(각 사이를 구하는거니 1 빼기) - n
        long min = 1;
        long max = distance;
        
        while(min <= max) {
            long mid = (min + max) / 2;
            
            int removed = 0;
            long prev = 0;
        
            for(int i = 0; i<rocks.length; i++) {
                if(rocks[i] - prev < mid) {
                    removed++;
                } else {
                    prev = rocks[i];
                }
            }
            
            if(distance - prev < mid) {
                removed++;
            }
            
            if(removed <= n) {
                answer = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        
        return answer;
    }
}