class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,cost=0,maxlen=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            cost+=Math.abs(s.charAt(r)-t.charAt(r));
            while(cost>maxCost){
                cost-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
        
    }
}