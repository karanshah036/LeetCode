// Time Complexity O(n)
// Space Complexity O(k)
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
     int count=0,maxLength=0;
     int start=0,end=0;
     Map<Character,Integer> map = new HashMap<>();
     while(end<s.length()){
        map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
        if(map.get(s.charAt(end))==1) count++;
        while(count>k && start<s.length()){
            map.put(s.charAt(start),map.get(s.charAt(start))-1);
            if(map.get(s.charAt(start))==0){
                map.remove(s.charAt(start));
                count--;
            }
            start++;
        }
        maxLength=Math.max(end-start+1,maxLength);
        end++;
     }   
     return maxLength;
    }
}