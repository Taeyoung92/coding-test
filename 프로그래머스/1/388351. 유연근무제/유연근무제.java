class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // i번째 직원 출근 희망 시각 나열
        for(int i=0; i<schedules.length; i++) {
            // i번째 직원 출근 인정 시간
            int recog = minutes(schedules[i]) + 10;
            // i번째 직원 지각 여부 변동 변수
            boolean yn = true;
            // 직원 요일 초기화
            int day = startday;
            // i번째 직원 일주일 간 출근
            for(int j=0; j<timelogs[i].length; j++) {
                // 주말 제외 지각 여부 검증
                int log = minutes(timelogs[i][j]);
                if(day <= 5 && log > recog) {
                    yn = false;
                }
                // 날짜 변동
                day = (day == 7) ? 1 : day + 1;
            }
            // 지각 여부 변동 없을 시 추가
            if(yn == true) answer++;
        }
        return answer;
    }
    
    private int minutes(int time) {
        return (time/100) * 60 + (time%100);
    }
}