public class MaxSubArray {


    /*
    TC : O(N)
    SC : O(1)
     */

    /**
     * The approach taken here is kadane's algorithm. At every step, we calculate whether the current sum + nums[i] is greater
     * or nums[i] is greater and store that in a global variable max.
     * At the end, we have seen the max Sum somewhere in our iteration.
     * This approach is based on the concept of running sum.
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int rSum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum, max);
        }

        return max;

    }

}
