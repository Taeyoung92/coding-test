import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++){
            int cuttingStart = commands[i][0] - 1;
            int cuttingEnd = commands[i][1] - 1;
            
            int[] cuttingArray = new int[cuttingEnd - cuttingStart + 1];
            
            for(int j=0; j<cuttingArray.length; j++) {
                cuttingArray[j] = array[cuttingStart + j];
            }
            
            Arrays.sort(cuttingArray);
            
            int select = commands[i][2] - 1;
            
            answer[i] = cuttingArray[select];
        }
        
        return answer;
    }
}