
class Solution {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String str = s + "#" + rev;

        int[] lps = new int[str.length()];

        int j = 0;

        for (int i = 1; i < str.length(); i++) {

            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lps[j - 1];
            }

            if (str.charAt(i) == str.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }

        int len = lps[str.length() - 1];

        String add = s.substring(len);
        StringBuilder result = new StringBuilder(add);
        result.reverse();

        return result.toString() + s;
    }
}