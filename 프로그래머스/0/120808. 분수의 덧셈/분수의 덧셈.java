class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int totalNumer = (numer1 * denom2) + (numer2 * denom1);
        int totalDenom = denom1 * denom2;
        
        int gcd = 1;
        for (int i = 1; i <= totalNumer && i <= totalDenom; i++) {
            if (totalNumer % i == 0 && totalDenom % i == 0) {
                gcd = i;
            }
        }

        int[] answer = {totalNumer / gcd, totalDenom / gcd};
        return answer;
    }
}