// DFS Approach
// Time Complexity O(M x N)
// Space Complexity O(M x N)
class Solution {
    public int numIslands(char[][] grid) {
        int numIslands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    public void dfs(char[][] grid,int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0') return;
        else{
            grid[row][col]='0';
            dfs(grid,row+1,col);
            dfs(grid,row-1,col);
            dfs(grid,row,col+1);
            dfs(grid,row,col-1);
        }
    }
}

// BFS Approach
// Time Complexity O(M x N)
// Space Complexity O(min(M,N))
class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid==null) return 0;
        int nr=grid.length;
        int nc=grid[0].length;
        int numIslands=0;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]=='1'){
                    numIslands++;
                    grid[i][j]='0';
                    Queue<Integer> queue = new LinkedList<>();
                    int position = i*nc+j;
                    queue.add(position);
                    while(!queue.isEmpty()){
                        int startinPoint = queue.poll();
                        int row = startinPoint/nc;
                        int col = startinPoint%nc;
                        if(row+1<nr && grid[row+1][col]=='1'){
                            queue.add((row+1) * nc + col);
                            grid[row+1][col]='0';
                        }
                        if(row-1>=0 && grid[row-1][col]=='1'){
                            queue.add((row-1) * nc + col);
                            grid[row-1][col]='0';
                        }
                        if(col+1<nc && grid[row][col+1]=='1'){
                            queue.add(row * nc + col+1);
                            grid[row][col+1]='0';
                        }
                        if(col-1>=0 && grid[row][col-1]=='1'){
                            queue.add((row) * nc + col-1);
                            grid[row][col-1]='0';
                        }
                    }
                }
            }
        }
        return numIslands;
    }
}

// BFS approach 2
class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid==null) return 0;
        int nr=grid.length;
        int nc=grid[0].length;
        int numIslands=0;
        final int[][] DIRECTIONS = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]=='1'){
                    numIslands++;
                    grid[i][j]='0';
                    Queue<Integer> queue = new LinkedList<>();
                    int position = i*nc+j;
                    queue.add(position);
                    while(!queue.isEmpty()){
                        int startinPoint = queue.poll();
                        int row = startinPoint/nc;
                        int col = startinPoint%nc;
                        for(int[] direction:DIRECTIONS){
                            int x=direction[0]+row;
                            int y=direction[1]+col;
                            if(x>=0 && x<nr && y>=0 && y<nc && grid[x][y]=='1'){
                                grid[x][y]='0';
                                queue.add(x*nc+y);
                            }
                        }
                    }
                }
            }
        }
        return numIslands;
    }
}