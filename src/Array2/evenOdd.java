package Array2;

public class evenOdd {
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex++] = nums[i];
            } else {
                result[oddIndex--] = nums[i];
            }
        }

        return result;
    }
}
