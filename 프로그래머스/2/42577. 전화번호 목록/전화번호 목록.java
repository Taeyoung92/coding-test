import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        for(int i=0; i<phone_book.length; i++) {
            String number = phone_book[i];
            
            for(int j=1; j<number.length(); j++) {
                String prefix = number.substring(0, j);
                if(set.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}