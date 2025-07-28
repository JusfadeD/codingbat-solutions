package array3;

public class fix34 {
    public int[] fix34(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                // Find the next 4 not already placed after a 3
                while (nums[j] != 4 || (j > 0 && nums[j - 1] == 3)) {
                    j++;
                }

                // Swap the number after 3 with this 4
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
}
