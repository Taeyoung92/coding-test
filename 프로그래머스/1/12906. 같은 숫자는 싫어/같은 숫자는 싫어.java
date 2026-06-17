import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            // 직전에 넣은 값과 다를 때만 추가 (리스트가 비었으면 무조건 추가)
            if (list.isEmpty() || list.get(list.size() - 1) != num) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}