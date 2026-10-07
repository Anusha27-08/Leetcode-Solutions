class Solution {
    public int takeCharacters(String s, int k) {
        int n=s.length();
        int[] freq=new int[3];
        for(char c: s.toCharArray()){
            freq[c-'a']++;

        }
        if(freq[0]<k || freq[1]<k || freq[2]<k)
            return -1;
        int l=0;
        int ans=n;
        for(int r=0;r<n;r++){
            freq[s.charAt(r)-'a']--;
            while(freq[0]<k || freq[1]<k || freq[2]<k){
                freq[s.charAt(l)-'a']++;
                l++;
            }
            ans=Math.min(ans,n-(r-l+1));
        }
        return ans;
        
    }
}