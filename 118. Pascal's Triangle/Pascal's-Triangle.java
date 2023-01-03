// Time Complexity O(numrows^2)
// Space Complexity O(1)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row1= new ArrayList<>();
        row1.add(1);
        list.add(row1);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++){
                row.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}