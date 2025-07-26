package array1;

public class rotateleft3 {
    public int[] rotateLeft3(int[] nums) {
        if (nums.length < 3) {
            return nums;
        }
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = temp;

        return nums;
    }
}
