package ap1;

public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length && index < count; i++) {
            if (nums[i] % 2 == 0) {
                result[index++] = nums[i];
            }
        }

        return result;
    }
}
