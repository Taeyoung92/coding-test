import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];

        // 후보 숫자 1 ~ n
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // 팩토리얼 미리 계산 (0! ~ n!)
        long[] fac = new long[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i;
        }

        k--; // 1-index를 0-index로

        for (int i = 0; i < n; i++) {
            int remain = n - 1 - i;        // 남은 뒤 자리 수
            long block = fac[remain];      // 남은 자리로 만들 수 있는 경우의 수 = (remain)!
            int idx = (int) (k / block);   // 후보 리스트에서 고를 인덱스

            answer[i] = nums.get(idx);
            nums.remove(idx);              // 쓴 숫자는 제거

            k %= block;                    // 나머지만 다음 자리로
        }

        return answer;
    }
}