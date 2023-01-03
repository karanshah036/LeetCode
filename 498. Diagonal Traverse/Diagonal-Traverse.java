// Time Complexity O(m*n)
// Space Complexity O(min(m,n))
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int pointer=0;
        List<Integer> diagonal = new ArrayList<>();
        int ans[] = new int[m*n]; 
        for(int i=0;i<m+n-1;i++){
            diagonal.clear();
            int r=i<n?0:i-n+1;
            int c=i<n?i:n-1;
            while(r<m && c>=0){
                diagonal.add(mat[r][c]);
                r++;
                c--;
            }
            if(i%2==0) Collections.reverse(diagonal);
            for(int j=0;j<diagonal.size();j++){
                ans[pointer++]=diagonal.get(j);
            }
        }
        return ans;
    }
}