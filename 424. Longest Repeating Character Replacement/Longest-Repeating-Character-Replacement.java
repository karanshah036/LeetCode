// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int characterReplacement(String s, int k) {
        int[] charMap = new int[26];
        int begin=0,end=0,maxCount=0,maxLength=0;
        while(end<s.length()){
            charMap[s.charAt(end)-'A']++;
            maxCount=Math.max(maxCount,charMap[s.charAt(end)-'A']);
            while(begin<end && end-begin+1-maxCount>k ){
                charMap[s.charAt(begin)-'A']--;
                begin++;    
            }
            maxLength=Math.max(end-begin+1,maxLength);
            end++;
        }
        return maxLength;

    }
}