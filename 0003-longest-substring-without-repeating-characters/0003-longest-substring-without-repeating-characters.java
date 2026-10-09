class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,maxlen=0;
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(s.charAt(i));
                maxlen=Math.max(maxlen,i-l+1);
        }        
        return maxlen;
    }
}