import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] dist = new int[n][m];
        
        dist[0][0] = 1;
        
        queue.offer(new int[]{0, 0});
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maps[nx][ny] == 0) continue;
                if(dist[nx][ny] != 0) continue;
                
                dist[nx][ny] = dist[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}