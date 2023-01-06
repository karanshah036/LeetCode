// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int start=0,end=0;
        while(end<charArray.length){
          while(end<charArray.length && charArray[end]!=' ')end++;
          reverse(charArray,start,end-1);
          end++;
          start=end;
        }
        return new String(charArray);
    }
    public void reverse(char[] charArray,int start, int end){
      while(start<end){
        char c = charArray[start];
        charArray[start]=charArray[end];
        charArray[end]=c;
        start++;
        end--;
      }
    }
}