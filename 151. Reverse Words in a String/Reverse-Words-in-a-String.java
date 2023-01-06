// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
   public String reverseWords(String s) {
        int start=s.length()-1,end=s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(start>=0){
            while(start>=0 && s.charAt(start)==' ')start--;
            end=start;
            while(start>=0 && s.charAt(start)!=' ')start--;
            sb.append(s.substring(start+1,end+1));
            if(start!=end)sb.append(" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}