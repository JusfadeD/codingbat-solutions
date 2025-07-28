package Array2;

public class modThree {
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            boolean firstEven = nums[i] % 2 == 0;
            boolean secondEven = nums[i + 1] % 2 == 0;
            boolean thirdEven = nums[i + 2] % 2 == 0;

            if ((firstEven && secondEven && thirdEven) ||
                    (!firstEven && !secondEven && !thirdEven)) {
                return true;
            }
        }

        return false;
    }
}
