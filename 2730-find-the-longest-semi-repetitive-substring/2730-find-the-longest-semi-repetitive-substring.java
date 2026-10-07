class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l=0,count=0,ans=1;
        for(int r=1;r<s.length();r++){
            if(s.charAt(r)==s.charAt(r-1)){
                count++;
            }
            while(count > 1){
                if (s.charAt(l) == s.charAt(l + 1)) {
               
                    count--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}