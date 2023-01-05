class Solution {
    public String addBinary(String a, String b) {
        int pointer1=a.length()-1,pointer2=b.length()-1,carry=0;
        StringBuilder sb = new StringBuilder();
        while(pointer1>=0 || pointer2>=0){
            int sum = carry;
            if(pointer1>=0) sum+=a.charAt(pointer1--)-'0';
            if(pointer2>=0) sum+=b.charAt(pointer2--)-'0';
            sb.append(sum%2);
            carry=sum/2;
        }
        if(carry!=0) sb.append('1');
        return sb.reverse().toString();
    }
}