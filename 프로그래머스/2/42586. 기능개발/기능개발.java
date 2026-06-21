import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int count = progresses.length;
        
        int[] deploys = new int[count];
        
        for(int i=0; i<count; i++) {
            int deployDays = 0;
            if(progresses[i] < 100) {
                if((100 - progresses[i]) % speeds[i] != 0) {
                    deployDays = (100 - progresses[i]) / speeds[i] + 1;
                } else {
                    deployDays = (100 - progresses[i]) / speeds[i];
                }
            }
            deploys[i] = deployDays;
        }
        
        List<Integer> result = new ArrayList<>();
        int standardDay = deploys[0];
        int group = 1;
        
        for(int i=1; i<deploys.length; i++) {
            if(deploys[i] <= standardDay) {
                group++;
            } else {
                result.add(group);
                standardDay = deploys[i];
                group = 1;
            }
        }
        
        result.add(group);
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}