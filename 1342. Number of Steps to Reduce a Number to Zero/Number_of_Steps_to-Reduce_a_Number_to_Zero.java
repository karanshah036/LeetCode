// Time Complexity O(log n)
// Space Complexity O(1)
class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0)num=num/2;
            else num-=1;
            steps++;
        }
        return steps;
    }
}