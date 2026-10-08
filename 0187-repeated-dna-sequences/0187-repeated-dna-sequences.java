class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> rep = new HashSet<>();
        List<String> al = new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String st =  s.substring(i,i+10);
            if(seen.contains(st)){
                rep.add(st);
            }
            else{
                seen.add(st);
            }
        }
        al.addAll(rep);
        return al;
        
    }
}