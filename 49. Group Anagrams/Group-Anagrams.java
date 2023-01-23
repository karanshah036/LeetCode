// Time Complexity O(NK) N-> number of string K-> Max Length of String
// Space Complexity O(NK) N-> number of string K-> Max Length of String
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(sorted,newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}