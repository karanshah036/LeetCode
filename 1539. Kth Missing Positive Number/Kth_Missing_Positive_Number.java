// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int pointer=0;
        while(pointer<arr.length && k!=0){
            if(num==arr[pointer]){
                num++;
                pointer++;
            }else{
                num++;
                k--;
            }
        }
        while(k!=0){
            num++;
            k--;
        }
        return num-1;
    }
}