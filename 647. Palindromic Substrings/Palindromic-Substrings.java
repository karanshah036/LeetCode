// Time Complexity O(N^3)
// Space Complexity (1)
class Solution {
    public int countSubstrings(String s) {
        int result=0;
        for(int start=0;start<s.length();start++){
          for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
              result++;
            }
          }
        }
        return result;
    }
    public boolean isPalindrome(String s, int start, int end){
      while(start<end){
        if(s.charAt(start)!=s.charAt(end)) return false;
        start++;
        end--;
      }
      return true;
    }
}

// Time Complexity O(N^2)
// Space Complexity O(1)
class Solution {
    int result=0;
    public int countSubstrings(String s) {

        for(int start=0;start<s.length();start++){
            isPalindrome(s,start,start);
            isPalindrome(s,start,start+1);
        }
        return result;
    }
    public void isPalindrome(String s, int start, int end){
      while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
        result++;
        start--;
        end++;
      }
        return;
      }
}