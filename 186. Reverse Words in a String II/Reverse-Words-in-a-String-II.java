// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public void reverseWords(char[] s) {
        reverse(s,0,s.length-1);
        int start=0,end=0;
        while(end<s.length){
            while(end<s.length && s[end]!=' ')end++;
            reverse(s,start,end-1);
            start=++end;
        }
    }
    public void reverse(char[] s,int start, int end){
      while(start<=end){
        char c = s[start];
        s[start]=s[end];
        s[end]=c;
        start++;
        end--;
      }
    }
}