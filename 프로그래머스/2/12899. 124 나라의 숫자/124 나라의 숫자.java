class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int remainder = n % 3;

            if (remainder == 0) {
                sb.append('4');
                n = n / 3 - 1;          // 4로 당겨썼으니 몫에서 1을 더 뺌
            } else {
                sb.append(remainder);
                n = n / 3;
            }
        }

        return sb.reverse().toString();
    }
}