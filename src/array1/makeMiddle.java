package array1;

public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int num1 = nums[nums.length/2-1];
        int num2=  nums[nums.length/2];
        return new int[]{num1,num2};
    }
}
