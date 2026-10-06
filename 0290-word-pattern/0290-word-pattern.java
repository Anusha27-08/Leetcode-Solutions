class Solution {
    public boolean wordPattern(String pattern, String s) {
      
        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rev = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c) && !map.get(c).equals(w))
                return false;

            if (rev.containsKey(w) && rev.get(w) != c)
                return false;

            map.put(c, w);
            rev.put(w, c);
        }

        return true;
    }
}
        