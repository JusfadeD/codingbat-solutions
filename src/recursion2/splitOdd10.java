package recursion2;

public class splitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    private boolean helper(int index, int[] nums, int sum1, int sum2) {
        if (index == nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) ||
                    (sum2 % 10 == 0 && sum1 % 2 == 1);
        }

        if (helper(index + 1, nums, sum1 + nums[index], sum2)) {
            return true;
        }

        if (helper(index + 1, nums, sum1, sum2 + nums[index])) {
            return true;
        }

        return false;

    }
}