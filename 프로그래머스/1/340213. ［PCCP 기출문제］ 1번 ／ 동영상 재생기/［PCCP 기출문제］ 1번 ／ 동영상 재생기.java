class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] vlSplit = video_len.split(":");
        String[] posSplit = pos.split(":");
        String[] opStartSplit = op_start.split(":");
        String[] opEndSplit = op_end.split(":");
        int vlTrans = Integer.parseInt(vlSplit[0]) * 60 + Integer.parseInt(vlSplit[1]);
        int posTrans = Integer.parseInt(posSplit[0]) * 60 + Integer.parseInt(posSplit[1]);
        int opStartTrans = Integer.parseInt(opStartSplit[0]) * 60 + Integer.parseInt(opStartSplit[1]);
        int opEndTrans = Integer.parseInt(opEndSplit[0]) * 60 + Integer.parseInt(opEndSplit[1]);
        
        int now = posTrans;
        
        if(now >= opStartTrans && now <= opEndTrans) now = opEndTrans;
        
        for(int i=0; i<commands.length; i++) {
            int value = 0;
            if("next".equals(commands[i])) {
                value = 10;
            } else {
                value = -10;
            }
            
            now += value;
            
            if(now < 0) {
                now = 0;
            } else if(now > vlTrans) {
                now = vlTrans;
            }
            
            if(now >= opStartTrans && now <= opEndTrans) now = opEndTrans;
        }
        
        String endHour = now/60 + "";
        String endMinute = now%60 + "";
        
        if(endHour.length() == 1) endHour = "0" + endHour;
        if(endMinute.length() == 1) endMinute = "0" + endMinute;
        
        return endHour + ":" + endMinute;
    }
}