// Time Complexity O(N^2)
// Space Complexity O(1)
class Solution {
    int start=0,end=0,max=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            isPalindrome(s,i,i);
            isPalindrome(s,i,i+1);
        }
        return new String(s.substring(start,end+1));
    }
    public void isPalindrome(String s, int starting, int ending){
        while(starting>=0 && ending<s.length() && s.charAt(starting)==s.charAt(ending)){
            if(ending-starting+1>max){
                max=ending-starting+1;
                start=starting;
                end=ending;
            }
            starting--;
            ending++;
        }
        return;
    }
}