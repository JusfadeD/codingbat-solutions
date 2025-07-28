package array1;

public class sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inBlock = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                inBlock = true;
            } else if (nums[i] == 7 && inBlock) {
                inBlock = false;
            } else if (!inBlock) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
