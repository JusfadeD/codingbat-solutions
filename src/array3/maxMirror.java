package array3;

public class maxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int x = i;
                int y = j;

                while (x < nums.length && y >= 0 && nums[x] == nums[y]) {
                    count++;
                    x++;
                    y--;
                }

                if (count > max) {
                    max = count;
                }
            }
        }

        return max;
    }
}
