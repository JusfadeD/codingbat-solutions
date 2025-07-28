package Array2;

public class zeroFront {
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int front = 0;
        int back = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[front++] = 0;
            } else {
                result[back--] = nums[i];
            }
        }

        return result;
    }
}
