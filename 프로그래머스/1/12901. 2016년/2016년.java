class Solution {
    public String solution(int a, int b) {
        // 2016년은 윤년 (2월 29일 포함)
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 1월 1일이 금요일이므로, 금요일(5)을 기준으로 시작
        int totalDays = 4 + b;

        // 이전 달까지의 일수 누적
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // 요일 계산 (0: SUN ~ 6: SAT)
        totalDays %= 7;

        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        return dayOfWeek[totalDays];
    }
}