import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes) {
            String type = s[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(int count : map.values()) {
            answer *= (count + 1);
        }
        
        answer -= 1;
        
        return answer;
    }
}