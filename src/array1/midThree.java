package array1;

public class midThree {
    public int[] midThree(int[] nums) {
        int num1 = nums[nums.length/2-1];
        int num2 = nums[nums.length/2];
        int num3= nums[nums.length/2+1];
        return new int[]{num1,num2,num3};
    }
}
