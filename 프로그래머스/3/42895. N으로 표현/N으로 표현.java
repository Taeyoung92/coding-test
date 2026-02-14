import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number) return 1;
        
        List<Set<Integer>> countList = new ArrayList<>();
        
        for(int i=0; i<9; i++) {
            countList.add(new HashSet<>());
        }
        
        // 1번 사용하는 경우
        countList.get(1).add(N);
        
        // 2번 사용부터 8번 사용까지
        for(int i=2; i<9; i++) {
            Set<Integer> currentSet = countList.get(i);
            
            currentSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            for(int j=1; j<i; j++) {
                for (int a : countList.get(j)) {
                    for (int b : countList.get(i - j)) {
                        currentSet.add(a + b);
                        currentSet.add(a - b);
                        currentSet.add(a * b);
                        if (b != 0) currentSet.add(a / b);
                    }
                }
            }
            if(currentSet.contains(number)) return i;
        }
        
        return -1;
    }
}