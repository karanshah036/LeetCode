// Time Complexity O(m*n)
// Space Complexity O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int rowBegin=0,rowEnd=matrix.length-1,colBegin=0,colEnd=matrix[0].length-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            //Traverse right
            for(int i=colBegin;i<=colEnd;i++){
                spiral.add(matrix[rowBegin][i]);
            }

            rowBegin++;
            
            // Traverse down
            for(int i=rowBegin;i<=rowEnd;i++){
                spiral.add(matrix[i][colEnd]);
            }

            colEnd--;

            // Traverse Left
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    spiral.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;
            
            // Traverse Up
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    spiral.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return spiral;
    }
}