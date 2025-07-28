package Array2;

public class post4 {
    public int[] post4(int[] nums) {
        int lastFourIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastFourIndex = i;
            }
        }

        int[] result = new int[nums.length - lastFourIndex - 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = nums[lastFourIndex + 1 + i];
        }

        return result;
    }
}
