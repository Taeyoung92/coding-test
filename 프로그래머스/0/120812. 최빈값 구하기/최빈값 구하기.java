import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];
        
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        int maxCount = 0;
        int answer = 0;      
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            }
        }

        int repeatCheck = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                repeatCheck++;
            }
        }

        return repeatCheck > 1 ? -1 : answer;
    }
}