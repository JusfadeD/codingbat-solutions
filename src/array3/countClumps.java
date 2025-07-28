package array3;

public class countClumps {
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;

        while (i < nums.length) {
            int val = nums[i];
            int length = 1;

            while (i + 1 < nums.length && nums[i + 1] == val) {
                i++;
                length++;
            }

            if (length > 1) {
                count++;
            }

            i++;
        }

        return count;
    }
}
