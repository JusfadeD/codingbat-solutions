package array1;

public class reverse3 {
    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0]=nums[2];
        nums[2]=temp;
        return nums;
    }
}
