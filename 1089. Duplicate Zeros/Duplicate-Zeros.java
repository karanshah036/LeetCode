// Time Complexity O(n)
// Space Compexity O(1)
class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros=0,pointer=arr.length-1;
        for(int i=0;i<arr.length-zeros;i++){
            if(arr[i]==0){
                zeros++;
                if(i==arr.length-zeros){
                    arr[pointer--]=0;
                    zeros--;
                    break;
                }
            }
        }
        int end=pointer-zeros;
        for(int i=end;i>=0;i--){
            if(arr[i]==0){
                arr[pointer--]=0;
                arr[pointer--]=0;
            }else{
                arr[pointer--]=arr[i];
            }
        }
    }
}
