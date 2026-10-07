class Solution {
    public int maxVowels(String s, int k) {

        int l = 0, vc = 0, maxc = Integer.MIN_VALUE;

        for (int r = 0; r < s.length(); r++) {

            if (isVowel(s.charAt(r))) {
                vc++;
            }

            if (r - l + 1 == k) {

                maxc = Math.max(maxc, vc);

                if (isVowel(s.charAt(l))) {
                    vc--;
                }

                l++;
            }
        }

        return maxc;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}