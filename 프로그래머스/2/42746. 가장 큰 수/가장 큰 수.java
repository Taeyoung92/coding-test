import java.util.*;

class Solution {
    public String solution(int[] numbers) {    
        String[] strs = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : strs) {
            sb.append(str);
        }
        
        if(sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}