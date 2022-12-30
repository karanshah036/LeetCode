// Time complexity O(n)
// Space complexity O(n)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i*2) || (set.contains(i/2) && i%2==0))return true;
            set.add(i);
        }
        return false;
    }
}