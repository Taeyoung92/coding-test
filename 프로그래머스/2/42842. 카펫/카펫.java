class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //우선 테두리의 가로,세로를 구해야 내부가 몇개로 차는 지 알 수 있음.
        //가로를 x, 세로를 y라고 하면 테두리의 개수는 2x + 2y - 4(겹치는 모서리부분)임
        //brown = 2x + 2y -4이고 brown은 항상 짝수이므로 실제로는 (brown -2)/2 = x+y임
        //내부의 개수는 (x-2) * (y-2)임
        //yellow = (x-2) * (y-2) = x^2 -4xy + y^2
        //항상 brown과 yellow는 주어지므로 x,y에 대한 식이 2개 도출됨
        //yellow의 값을 약수로 변환하면 역산으로 값을 구할 수 있음, yellow는 항상 짝수이므로 for문은 절반값까지만 돌리면 됨. 만약 yellow가 1이라면 for문을 돌릴 수 있게 2로 변환
        int count = (yellow == 1) ? 2 : yellow/2;
        for(int i=1; i<=count; i++) {
            int yRow = 0;
            int yCol = 0;
            if(yellow%i == 0) {
                yRow = yellow/i;
                yCol = i;
            }
            if(yRow != 0) {
                int outline = (2*(yRow+2)) + (2*(yCol+2)) -4;
                if(outline == brown) {
                    answer[0] = yRow+2;
                    answer[1] = yCol+2;
                    break;
                }
            }
        }
        return answer;
    }
}