class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int pro = 1, l = 0, c = 0;

        for (int r = 0; r < nums.length; r++) {
            pro *= nums[r];

            while (pro >= k) {
                pro /= nums[l];
                l++;
            }

            c += r - l + 1;
        }

        return c;
    }
}