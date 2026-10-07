class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,c=0,l=0,avg=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i-l+1==k){
                avg=sum/k;
                if(threshold<=avg){
                    c++;
                }
                sum-=arr[l];
                l++;
            }

        }
        return c;
        
    }
}