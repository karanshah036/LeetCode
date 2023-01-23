Time Complexity O(s,t)
Space Complexity O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charMap = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            charMap[s.charAt(i)-'a']++;
            charMap[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(charMap[i]!=0) return false;
        }
        return true;
    }
}