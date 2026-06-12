class Solution {
    public int solution(int n) {

        /*
         * [풀이 1 - 단순 반복 + bitCount]
         *
         * 1. 현재 숫자의 1 개수를 구한다.
         * 2. n을 1씩 증가시키면서
         * 3. 같은 개수의 1을 가지는 숫자가 나오면 반환
         *
         * ✔ 핵심: 조건 만족할 때까지 브루트포스
         * ✔ 장점: 코드 짧고 안정적 (실전 코테용)
         * ✔ 단점: 반복문 존재
         *
         * 예시 코드:
         * int oneCount = Integer.bitCount(n);
         * while (true) {
         *     n++;
         *     if (Integer.bitCount(n) == oneCount) return n;
         * }
         */


        /*
         * [풀이 2 - 비트 연산 (O(1))]
         *
         * 1. 가장 오른쪽 1비트를 찾는다 (n & -n)
         * 2. 해당 비트를 올려서 수를 증가시킨다
         * 3. 나머지 비트들을 오른쪽으로 재정렬
         *
         * ✔ 핵심: "01 → 10" 변환 + 오른쪽 정렬을 비트로 압축
         * ✔ 장점: 반복문 없음, 매우 빠름
         * ✔ 단점: 직관적이지 않음 (이해 필요)
         *
         * 예시 코드:
         * int c = n & -n;
         * int r = n + c;
         * return (((r ^ n) >> 2) / c) | r;
         */

        // 스스로 작성한 구현 코드
        StringBuilder binary = new StringBuilder();
        int boundaryNum = 1;
        int count = 0;
        while(true) {
            boundaryNum *= 2;
            count++;
            if(boundaryNum > n) {
                boundaryNum /= 2;
                break;
            }
        }
        int sum = 0;
        int oneCount = 0;
        for(int i=0; i<count; i++) {
            if((sum + boundaryNum) > n) {
                binary.append('0');
            } else {
                sum += boundaryNum;
                binary.append('1');
                oneCount++;
            }
            boundaryNum /= 2;
        }
        char[] arr = binary.toString().toCharArray();

        // 뒤에서부터 01 패턴(arr[idx-1]=='0', arr[idx]=='1') 찾기
        int idx = -1;
        for(int i = count - 1; i > 0; i--) {
            if(arr[i-1] == '0' && arr[i] == '1') {
                idx = i;
                break;
            }
        }

        // 못 찾은 경우 (11..00.. 또는 11..1) -> 자릿수를 한 칸 늘림
        if(idx == -1) {
            char[] res = new char[count + 1];
            for(int i = 0; i < res.length; i++) res[i] = '0';
            res[0] = '1';
            // 나머지 1들(oneCount - 1개)을 맨 뒤로 몰기
            for(int k = 0; k < oneCount - 1; k++) {
                res[count - k] = '1';
            }
            return Integer.parseInt(new String(res), 2);
        }
        else {
            // swap: arr[idx-1]=1, arr[idx]=0
            arr[idx - 1] = '1';
            arr[idx] = '0';
            // idx 이후의 1 개수를 세고 모두 0으로
            int onesRight = 0;
            for(int i = idx; i < count; i++) {
                if(arr[i] == '1') onesRight++;
                arr[i] = '0';
            }
            // 남은 1들을 가장 오른쪽부터 채움 (최소값 형태)
            int pos = count - 1;
            while(onesRight > 0) {
                arr[pos--] = '1';
                onesRight--;
            }
        }
        return Integer.parseInt(new String(arr), 2);
    }
}