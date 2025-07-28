package ap1;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length && index < count; i++) {
            if (isEndy(nums[i])) {
                result[index++] = nums[i];
            }
        }

        return result;
    }

    public boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }
}
