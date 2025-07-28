package ap1;

public class scoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0 && nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
