// Time complexity O(log n)
// Space complexity O(1)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start+1<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) start=mid;
            else end=mid;
        }
        return -1;
    }
}