class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=sum(n);
        }
        return true;
        
    }
    public int sum(int n){
        int s=0;
        while(n>0){
            int d = n%10;
            s+=d*d;
            n/=10;
        }
        return s;
    }
}