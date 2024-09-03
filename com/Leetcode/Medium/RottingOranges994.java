package Leetcode.Medium;

public class RottingOranges994 {
    public int orangesRotting(int[][] grid) {
        int[][] graph = grid;
        int rows = graph.length;
        int cols = graph[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();
        int fresh = 1;
        int rotten = 2;
        int time = 0;
        int leftOranges = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(graph[i][j] == rotten){
                    q.add(new int[]{i,j});
                }
                if(graph[i][j] == fresh) leftOranges++;
            }
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && leftOranges>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] current = q.poll();
                int currentRow = current[0];
                int currentCol = current[1];

                for(int[] direction:directions){
                    int newRow = currentRow + direction[0];
                    int newCol = currentCol + direction[1];
                        if(newCol >=0 && newCol<cols && newRow>=0 && newRow<rows && graph[newRow][newCol]== fresh && !visited[newRow][newCol]){
                            graph[newRow][newCol] = rotten;
                            visited[newRow][newCol] = false;
                            q.add(new int[]{newRow,newCol});
                            leftOranges--;
                        }
                }
            }
            time++;
        }
        if(leftOranges == 0) return time;
        else return -1;
    }
}