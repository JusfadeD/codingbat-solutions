package array1;

public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return (sum - max - min) / (nums.length - 2);
    }
}
