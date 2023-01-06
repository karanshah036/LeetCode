// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<>();
        int min=0;
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int task = entry.getValue();
            if(task==1)return -1;
            while(task>=3 && task-4!=0){
                task-=3;
                min++;
            }
            while(task>0){
                task-=2;
                min++;
            }
        }
        return min;

    }
}