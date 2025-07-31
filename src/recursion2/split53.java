package recursion2;

public class split53 {
    public boolean split53(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int index, int[] nums, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }

        int val = nums[index];

        if (val % 5 == 0) {
            return helper(index + 1, nums, sum1 + val, sum2);
        } else if (val % 3 == 0) {
            return helper(index + 1, nums, sum1, sum2 + val);
        } else {
            return helper(index + 1, nums, sum1 + val, sum2) ||
                    helper(index + 1, nums, sum1, sum2 + val);
        }
    }
}
