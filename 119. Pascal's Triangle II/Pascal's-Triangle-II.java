// Time Complexity O(rowIndex^2)
// Space Complexity O(RowIndex^2)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row0 = new ArrayList<>();
        row0.add(1);
        list.add(row0);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++){
                newRow.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            }
            newRow.add(1);
            list.add(newRow);
        }
        return list.get(list.size()-1);
    }
}